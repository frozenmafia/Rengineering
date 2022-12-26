package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.QueryInterceptorStatement$$ExternalSyntheticLambda2;
/* loaded from: classes7.dex */
public final class PlainHeader extends Header {
    private static final Set<String> REGISTERED_PARAMETER_NAMES;
    private static final long serialVersionUID = 1;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(hashSet);
    }

    /* loaded from: classes7.dex */
    public static class toString {
        private Map<String, Object> ag$a;
        private Set<String> ah$a;
        private Base64URL toString;
        private String valueOf;
        private JOSEObjectType values;

        public toString values(JOSEObjectType jOSEObjectType) {
            this.values = jOSEObjectType;
            return this;
        }

        public toString ah$a(String str) {
            this.valueOf = str;
            return this;
        }

        public toString valueOf(Set<String> set) {
            this.ah$a = set;
            return this;
        }

        public toString values(String str, Object obj) {
            if (PlainHeader.getRegisteredParameterNames().contains(str)) {
                throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
            }
            if (this.ag$a == null) {
                this.ag$a = new HashMap();
            }
            this.ag$a.put(str, obj);
            return this;
        }

        public toString values(Base64URL base64URL) {
            this.toString = base64URL;
            return this;
        }

        public PlainHeader valueOf() {
            return new PlainHeader(this.values, this.valueOf, this.ah$a, this.ag$a, this.toString);
        }
    }

    public PlainHeader() {
        this(null, null, null, null, null);
    }

    public PlainHeader(JOSEObjectType jOSEObjectType, String str, Set<String> set, Map<String, Object> map, Base64URL base64URL) {
        super(Algorithm.NONE, jOSEObjectType, str, set, map, base64URL);
    }

    public PlainHeader(PlainHeader plainHeader) {
        this(plainHeader.getType(), plainHeader.getContentType(), plainHeader.getCriticalParams(), plainHeader.getCustomParams(), plainHeader.getParsedBase64URL());
    }

    public static Set<String> getRegisteredParameterNames() {
        return REGISTERED_PARAMETER_NAMES;
    }

    @Override // com.nimbusds.jose.Header
    public Algorithm getAlgorithm() {
        return Algorithm.NONE;
    }

    public static PlainHeader parse(Map<String, Object> map) throws ParseException {
        return parse(map, (Base64URL) null);
    }

    public static PlainHeader parse(Map<String, Object> map, Base64URL base64URL) throws ParseException {
        if (Header.parseAlgorithm(map) != Algorithm.NONE) {
            throw new ParseException("The algorithm \"alg\" header parameter must be \"none\"", 0);
        }
        toString values = new toString().values(base64URL);
        for (String str : map.keySet()) {
            if (!"alg".equals(str)) {
                if ("typ".equals(str)) {
                    String ah$b = QueryInterceptorStatement$$ExternalSyntheticLambda2.ah$b(map, str);
                    if (ah$b != null) {
                        values = values.values(new JOSEObjectType(ah$b));
                    }
                } else if ("cty".equals(str)) {
                    values = values.ah$a(QueryInterceptorStatement$$ExternalSyntheticLambda2.ah$b(map, str));
                } else if ("crit".equals(str)) {
                    List<String> invoke = QueryInterceptorStatement$$ExternalSyntheticLambda2.invoke(map, str);
                    if (invoke != null) {
                        values = values.valueOf(new HashSet(invoke));
                    }
                } else {
                    values = values.values(str, map.get(str));
                }
            }
        }
        return values.valueOf();
    }

    public static PlainHeader parse(String str) throws ParseException {
        return parse(str, (Base64URL) null);
    }

    public static PlainHeader parse(String str, Base64URL base64URL) throws ParseException {
        return parse(QueryInterceptorStatement$$ExternalSyntheticLambda2.ag$a(str), base64URL);
    }

    public static PlainHeader parse(Base64URL base64URL) throws ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
