package org.apache.http.protocol;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.apache.http.util.Args;
/* loaded from: classes8.dex */
public class UriPatternMatcher<T> {
    private final Map<String, T> map = new LinkedHashMap();

    public Set<Map.Entry<String, T>> entrySet() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.map.entrySet());
        }
        return hashSet;
    }

    public void register(String str, T t) {
        synchronized (this) {
            Args.notNull(str, "URI request pattern");
            this.map.put(str, t);
        }
    }

    public void unregister(String str) {
        synchronized (this) {
            if (str == null) {
                return;
            }
            this.map.remove(str);
        }
    }

    @Deprecated
    public void setHandlers(Map<String, T> map) {
        synchronized (this) {
            Args.notNull(map, "Map of handlers");
            this.map.clear();
            this.map.putAll(map);
        }
    }

    @Deprecated
    public void setObjects(Map<String, T> map) {
        synchronized (this) {
            Args.notNull(map, "Map of handlers");
            this.map.clear();
            this.map.putAll(map);
        }
    }

    @Deprecated
    public Map<String, T> getObjects() {
        Map<String, T> map;
        synchronized (this) {
            map = this.map;
        }
        return map;
    }

    public T lookup(String str) {
        T t;
        synchronized (this) {
            Args.notNull(str, "Request path");
            t = this.map.get(str);
            if (t == null) {
                String str2 = null;
                for (String str3 : this.map.keySet()) {
                    if (matchUriRequestPattern(str3, str) && (str2 == null || str2.length() < str3.length() || (str2.length() == str3.length() && str3.endsWith("*")))) {
                        t = this.map.get(str3);
                        str2 = str3;
                    }
                }
            }
        }
        return t;
    }

    protected boolean matchUriRequestPattern(String str, String str2) {
        if (str.equals("*")) {
            return true;
        }
        if (str.endsWith("*") && str2.startsWith(str.substring(0, str.length() - 1))) {
            return true;
        }
        return str.startsWith("*") && str2.endsWith(str.substring(1, str.length()));
    }

    public String toString() {
        return this.map.toString();
    }
}
