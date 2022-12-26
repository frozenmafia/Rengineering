package org.apache.http.conn.util;

import java.net.IDN;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.util.Args;
/* loaded from: classes5.dex */
public final class PublicSuffixMatcher {
    private final Map<String, DomainType> exceptions;
    private final Map<String, DomainType> rules;

    public PublicSuffixMatcher(Collection<String> collection, Collection<String> collection2) {
        this(DomainType.UNKNOWN, collection, collection2);
    }

    public PublicSuffixMatcher(DomainType domainType, Collection<String> collection, Collection<String> collection2) {
        Args.notNull(domainType, "Domain type");
        Args.notNull(collection, "Domain suffix rules");
        this.rules = new ConcurrentHashMap(collection.size());
        for (String str : collection) {
            this.rules.put(str, domainType);
        }
        this.exceptions = new ConcurrentHashMap();
        if (collection2 != null) {
            for (String str2 : collection2) {
                this.exceptions.put(str2, domainType);
            }
        }
    }

    public PublicSuffixMatcher(Collection<PublicSuffixList> collection) {
        Args.notNull(collection, "Domain suffix lists");
        this.rules = new ConcurrentHashMap();
        this.exceptions = new ConcurrentHashMap();
        for (PublicSuffixList publicSuffixList : collection) {
            DomainType type = publicSuffixList.getType();
            for (String str : publicSuffixList.getRules()) {
                this.rules.put(str, type);
            }
            List<String> exceptions = publicSuffixList.getExceptions();
            if (exceptions != null) {
                for (String str2 : exceptions) {
                    this.exceptions.put(str2, type);
                }
            }
        }
    }

    private static boolean hasEntry(Map<String, DomainType> map, String str, DomainType domainType) {
        DomainType domainType2;
        if (map == null || (domainType2 = map.get(str)) == null) {
            return false;
        }
        return domainType == null || domainType2.equals(domainType);
    }

    private boolean hasRule(String str, DomainType domainType) {
        return hasEntry(this.rules, str, domainType);
    }

    private boolean hasException(String str, DomainType domainType) {
        return hasEntry(this.exceptions, str, domainType);
    }

    public String getDomainRoot(String str) {
        return getDomainRoot(str, null);
    }

    public String getDomainRoot(String str, DomainType domainType) {
        if (str == null || str.startsWith(".")) {
            return null;
        }
        String normalize = DnsUtils.normalize(str);
        String str2 = null;
        while (normalize != null) {
            String unicode = IDN.toUnicode(normalize);
            if (hasException(unicode, domainType)) {
                return normalize;
            }
            if (hasRule(unicode, domainType)) {
                return str2;
            }
            int indexOf = normalize.indexOf(46);
            String substring = indexOf != -1 ? normalize.substring(indexOf + 1) : null;
            if (substring != null) {
                if (hasRule("*." + IDN.toUnicode(substring), domainType)) {
                    return str2;
                }
            }
            str2 = normalize;
            normalize = substring;
        }
        if (domainType == null || domainType == DomainType.UNKNOWN) {
            return str2;
        }
        return null;
    }

    public boolean matches(String str) {
        return matches(str, null);
    }

    public boolean matches(String str, DomainType domainType) {
        if (str == null) {
            return false;
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        return getDomainRoot(str, domainType) == null;
    }
}
