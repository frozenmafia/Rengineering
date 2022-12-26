package o;

import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.util.Base64URL;
/* loaded from: classes7.dex */
public final class addWeakObserver {
    private final JWEHeader ag$a;
    private final Base64URL ah$a;
    private final Base64URL toString;
    private final Base64URL valueOf;
    private final Base64URL values;

    public addWeakObserver(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) {
        this.ag$a = jWEHeader;
        this.ah$a = base64URL;
        this.toString = base64URL2;
        if (base64URL3 == null) {
            throw new IllegalArgumentException("The cipher text must not be null");
        }
        this.values = base64URL3;
        this.valueOf = base64URL4;
    }

    public JWEHeader values() {
        return this.ag$a;
    }

    public Base64URL ag$a() {
        return this.ah$a;
    }

    public Base64URL HaptikSDK$c() {
        return this.toString;
    }

    public Base64URL valueOf() {
        return this.values;
    }

    public Base64URL ah$a() {
        return this.valueOf;
    }
}
