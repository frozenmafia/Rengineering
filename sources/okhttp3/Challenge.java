package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import o.fetchDrawMatrixField;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String str, Map<String, String> map) {
        String str2;
        runAnimators.ag$a(str, "scheme");
        runAnimators.ag$a(map, "authParams");
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                runAnimators.ah$a(locale, "US");
                Objects.requireNonNull(key, "null cannot be cast to non-null type java.lang.String");
                str2 = key.toLowerCase(locale);
                runAnimators.ah$a(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        runAnimators.ah$a(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = unmodifiableMap;
    }

    public final String scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                runAnimators.ah$a(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        runAnimators.ah$a(charset, "ISO_8859_1");
        return charset;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Challenge(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "scheme"
            o.runAnimators.ag$a(r2, r0)
            java.lang.String r0 = "realm"
            o.runAnimators.ag$a(r3, r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r0 = "singletonMap(\"realm\", realm)"
            o.runAnimators.ah$a(r3, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Challenge.<init>(java.lang.String, java.lang.String):void");
    }

    public final Challenge withCharset(Charset charset) {
        runAnimators.ag$a(charset, "charset");
        Map HaptikSDK$a = fetchDrawMatrixField.HaptikSDK$a(this.authParams);
        String name = charset.name();
        runAnimators.ah$a(name, "charset.name()");
        HaptikSDK$a.put("charset", name);
        return new Challenge(this.scheme, HaptikSDK$a);
    }

    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m1283deprecated_scheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_authParams  reason: not valid java name */
    public final Map<String, String> m1280deprecated_authParams() {
        return this.authParams;
    }

    /* renamed from: -deprecated_realm  reason: not valid java name */
    public final String m1282deprecated_realm() {
        return realm();
    }

    /* renamed from: -deprecated_charset  reason: not valid java name */
    public final Charset m1281deprecated_charset() {
        return charset();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (runAnimators.values((Object) challenge.scheme, (Object) this.scheme) && runAnimators.values(challenge.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.scheme.hashCode() + 899) * 31) + this.authParams.hashCode();
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }
}
