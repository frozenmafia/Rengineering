package com.nimbusds.jwt;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.QueryInterceptorStatement$$ExternalSyntheticLambda2;
import o.getGeneratedImplementation;
import o.lambda$executeUpdateDelete$1$androidxroomQueryInterceptorStatement;
import o.lambda$simpleQueryForString$4$androidxroomQueryInterceptorStatement;
/* loaded from: classes7.dex */
public final class JWTClaimsSet implements Serializable {
    private static final String AUDIENCE_CLAIM = "aud";
    private static final String EXPIRATION_TIME_CLAIM = "exp";
    private static final String ISSUED_AT_CLAIM = "iat";
    private static final String ISSUER_CLAIM = "iss";
    private static final String JWT_ID_CLAIM = "jti";
    private static final String NOT_BEFORE_CLAIM = "nbf";
    private static final Set<String> REGISTERED_CLAIM_NAMES;
    private static final String SUBJECT_CLAIM = "sub";
    private static final long serialVersionUID = 1;
    private final Map<String, Object> claims;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(ISSUER_CLAIM);
        hashSet.add(SUBJECT_CLAIM);
        hashSet.add(AUDIENCE_CLAIM);
        hashSet.add(EXPIRATION_TIME_CLAIM);
        hashSet.add(NOT_BEFORE_CLAIM);
        hashSet.add(ISSUED_AT_CLAIM);
        hashSet.add(JWT_ID_CLAIM);
        REGISTERED_CLAIM_NAMES = Collections.unmodifiableSet(hashSet);
    }

    private JWTClaimsSet(Map<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.claims = linkedHashMap;
        linkedHashMap.putAll(map);
    }

    public static Set<String> getRegisteredNames() {
        return REGISTERED_CLAIM_NAMES;
    }

    public String getIssuer() {
        try {
            return getStringClaim(ISSUER_CLAIM);
        } catch (ParseException unused) {
            return null;
        }
    }

    public String getSubject() {
        try {
            return getStringClaim(SUBJECT_CLAIM);
        } catch (ParseException unused) {
            return null;
        }
    }

    public List<String> getAudience() {
        Object claim = getClaim(AUDIENCE_CLAIM);
        if (claim instanceof String) {
            return Collections.singletonList((String) claim);
        }
        try {
            List<String> stringListClaim = getStringListClaim(AUDIENCE_CLAIM);
            return stringListClaim != null ? Collections.unmodifiableList(stringListClaim) : Collections.emptyList();
        } catch (ParseException unused) {
            return Collections.emptyList();
        }
    }

    public Date getExpirationTime() {
        try {
            return getDateClaim(EXPIRATION_TIME_CLAIM);
        } catch (ParseException unused) {
            return null;
        }
    }

    public Date getNotBeforeTime() {
        try {
            return getDateClaim(NOT_BEFORE_CLAIM);
        } catch (ParseException unused) {
            return null;
        }
    }

    public Date getIssueTime() {
        try {
            return getDateClaim(ISSUED_AT_CLAIM);
        } catch (ParseException unused) {
            return null;
        }
    }

    public String getJWTID() {
        try {
            return getStringClaim(JWT_ID_CLAIM);
        } catch (ParseException unused) {
            return null;
        }
    }

    public Object getClaim(String str) {
        return this.claims.get(str);
    }

    public String getStringClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null || (claim instanceof String)) {
            return (String) claim;
        }
        throw new ParseException("The \"" + str + "\" claim is not a String", 0);
    }

    public String[] getStringArrayClaim(String str) throws ParseException {
        if (getClaim(str) == null) {
            return null;
        }
        try {
            List list = (List) getClaim(str);
            int size = list.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                try {
                    strArr[i] = (String) list.get(i);
                } catch (ClassCastException unused) {
                    throw new ParseException("The \"" + str + "\" claim is not a list / JSON array of strings", 0);
                }
            }
            return strArr;
        } catch (ClassCastException unused2) {
            throw new ParseException("The \"" + str + "\" claim is not a list / JSON array", 0);
        }
    }

    public List<String> getStringListClaim(String str) throws ParseException {
        String[] stringArrayClaim = getStringArrayClaim(str);
        if (stringArrayClaim == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(stringArrayClaim));
    }

    public URI getURIClaim(String str) throws ParseException {
        String stringClaim = getStringClaim(str);
        if (stringClaim == null) {
            return null;
        }
        try {
            return new URI(stringClaim);
        } catch (URISyntaxException e) {
            throw new ParseException("The \"" + str + "\" claim is not a URI: " + e.getMessage(), 0);
        }
    }

    public Boolean getBooleanClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null || (claim instanceof Boolean)) {
            return (Boolean) claim;
        }
        throw new ParseException("The \"" + str + "\" claim is not a Boolean", 0);
    }

    public Integer getIntegerClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Integer.valueOf(((Number) claim).intValue());
        }
        throw new ParseException("The \"" + str + "\" claim is not an Integer", 0);
    }

    public Long getLongClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Long.valueOf(((Number) claim).longValue());
        }
        throw new ParseException("The \"" + str + "\" claim is not a Number", 0);
    }

    public Date getDateClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Date) {
            return (Date) claim;
        }
        if (claim instanceof Number) {
            return lambda$executeUpdateDelete$1$androidxroomQueryInterceptorStatement.ag$a(((Number) claim).longValue());
        }
        throw new ParseException("The \"" + str + "\" claim is not a Date", 0);
    }

    public Float getFloatClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Float.valueOf(((Number) claim).floatValue());
        }
        throw new ParseException("The \"" + str + "\" claim is not a Float", 0);
    }

    public Double getDoubleClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Number) {
            return Double.valueOf(((Number) claim).doubleValue());
        }
        throw new ParseException("The \"" + str + "\" claim is not a Double", 0);
    }

    public Map<String, Object> getJSONObjectClaim(String str) throws ParseException {
        Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof Map) {
            Map<String, Object> values = QueryInterceptorStatement$$ExternalSyntheticLambda2.values();
            for (Map.Entry entry : ((Map) claim).entrySet()) {
                if (entry.getKey() instanceof String) {
                    values.put((String) entry.getKey(), entry.getValue());
                }
            }
            return values;
        }
        throw new ParseException("The \"" + str + "\" claim is not a JSON object or Map", 0);
    }

    public Map<String, Object> getClaims() {
        return Collections.unmodifiableMap(this.claims);
    }

    public Map<String, Object> toJSONObject() {
        return toJSONObject(false);
    }

    public Map<String, Object> toJSONObject(boolean z) {
        Map<String, Object> values = QueryInterceptorStatement$$ExternalSyntheticLambda2.values();
        for (Map.Entry<String, Object> entry : this.claims.entrySet()) {
            if (entry.getValue() instanceof Date) {
                values.put(entry.getKey(), Long.valueOf(lambda$executeUpdateDelete$1$androidxroomQueryInterceptorStatement.ah$a((Date) entry.getValue())));
            } else if (AUDIENCE_CLAIM.equals(entry.getKey())) {
                List<String> audience = getAudience();
                if (audience == null || audience.isEmpty()) {
                    if (z) {
                        values.put(AUDIENCE_CLAIM, null);
                    }
                } else if (audience.size() == 1) {
                    values.put(AUDIENCE_CLAIM, audience.get(0));
                } else {
                    List<Object> ag$a = lambda$simpleQueryForString$4$androidxroomQueryInterceptorStatement.ag$a();
                    ag$a.addAll(audience);
                    values.put(AUDIENCE_CLAIM, ag$a);
                }
            } else if (entry.getValue() != null) {
                values.put(entry.getKey(), entry.getValue());
            } else if (z) {
                values.put(entry.getKey(), null);
            }
        }
        return values;
    }

    public String toString() {
        return QueryInterceptorStatement$$ExternalSyntheticLambda2.values(toJSONObject());
    }

    public String toString(boolean z) {
        return QueryInterceptorStatement$$ExternalSyntheticLambda2.values(toJSONObject(z));
    }

    public <T> T toType(getGeneratedImplementation<T> getgeneratedimplementation) {
        return getgeneratedimplementation.values(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.nimbusds.jwt.JWTClaimsSet$ah$a] */
    public static JWTClaimsSet parse(Map<String, Object> map) throws ParseException {
        ?? r0 = new Object() { // from class: com.nimbusds.jwt.JWTClaimsSet$ah$a
            private final Map<String, Object> toString = new LinkedHashMap();

            public JWTClaimsSet$ah$a ag$a(String str) {
                this.toString.put("iss", str);
                return this;
            }

            public JWTClaimsSet$ah$a toString(String str) {
                this.toString.put("sub", str);
                return this;
            }

            public JWTClaimsSet$ah$a ag$a(List<String> list) {
                this.toString.put("aud", list);
                return this;
            }

            public JWTClaimsSet$ah$a valueOf(String str) {
                if (str == null) {
                    this.toString.put("aud", null);
                } else {
                    this.toString.put("aud", Collections.singletonList(str));
                }
                return this;
            }

            public JWTClaimsSet$ah$a ag$a(Date date) {
                this.toString.put("exp", date);
                return this;
            }

            public JWTClaimsSet$ah$a ah$a(Date date) {
                this.toString.put("nbf", date);
                return this;
            }

            public JWTClaimsSet$ah$a valueOf(Date date) {
                this.toString.put("iat", date);
                return this;
            }

            public JWTClaimsSet$ah$a values(String str) {
                this.toString.put("jti", str);
                return this;
            }

            public JWTClaimsSet$ah$a toString(String str, Object obj) {
                this.toString.put(str, obj);
                return this;
            }

            public JWTClaimsSet valueOf() {
                return new JWTClaimsSet(this.toString);
            }
        };
        for (String str : map.keySet()) {
            if (str.equals(ISSUER_CLAIM)) {
                r0.ag$a(QueryInterceptorStatement$$ExternalSyntheticLambda2.ah$b(map, ISSUER_CLAIM));
            } else if (str.equals(SUBJECT_CLAIM)) {
                r0.toString(QueryInterceptorStatement$$ExternalSyntheticLambda2.ah$b(map, SUBJECT_CLAIM));
            } else if (str.equals(AUDIENCE_CLAIM)) {
                Object obj = map.get(AUDIENCE_CLAIM);
                if (obj instanceof String) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(QueryInterceptorStatement$$ExternalSyntheticLambda2.ah$b(map, AUDIENCE_CLAIM));
                    r0.ag$a(arrayList);
                } else if (obj instanceof List) {
                    r0.ag$a(QueryInterceptorStatement$$ExternalSyntheticLambda2.invoke(map, AUDIENCE_CLAIM));
                } else if (obj == null) {
                    r0.valueOf(null);
                }
            } else if (str.equals(EXPIRATION_TIME_CLAIM)) {
                r0.ag$a(new Date(QueryInterceptorStatement$$ExternalSyntheticLambda2.HaptikSDK$a(map, EXPIRATION_TIME_CLAIM) * 1000));
            } else if (str.equals(NOT_BEFORE_CLAIM)) {
                r0.ah$a(new Date(QueryInterceptorStatement$$ExternalSyntheticLambda2.HaptikSDK$a(map, NOT_BEFORE_CLAIM) * 1000));
            } else if (str.equals(ISSUED_AT_CLAIM)) {
                r0.valueOf(new Date(QueryInterceptorStatement$$ExternalSyntheticLambda2.HaptikSDK$a(map, ISSUED_AT_CLAIM) * 1000));
            } else if (str.equals(JWT_ID_CLAIM)) {
                r0.values(QueryInterceptorStatement$$ExternalSyntheticLambda2.ah$b(map, JWT_ID_CLAIM));
            } else {
                r0.toString(str, map.get(str));
            }
        }
        return r0.valueOf();
    }

    public static JWTClaimsSet parse(String str) throws ParseException {
        return parse(QueryInterceptorStatement$$ExternalSyntheticLambda2.ag$a(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JWTClaimsSet) {
            return Objects.equals(this.claims, ((JWTClaimsSet) obj).claims);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.claims);
    }
}
