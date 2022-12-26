package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.security.KeyStore;
import java.util.List;
import java.util.Set;
import javax.crypto.SecretKey;
/* loaded from: classes7.dex */
public class OctetSequenceKey$ag$a {
    private List<Base64> HaptikSDK$a;
    private URI HaptikSDK$b;
    private Base64URL HaptikSDK$c;
    private Algorithm ag$a;
    private String ah$a;
    @Deprecated
    private Base64URL ah$b;
    private KeyUse invoke;
    private Set<KeyOperation> toString;
    private final Base64URL valueOf;
    private KeyStore values;

    public OctetSequenceKey$ag$a(Base64URL base64URL) {
        if (base64URL == null) {
            throw new IllegalArgumentException("The key value must not be null");
        }
        this.valueOf = base64URL;
    }

    public OctetSequenceKey$ag$a(byte[] bArr) {
        this(Base64URL.encode(bArr));
        if (bArr.length == 0) {
            throw new IllegalArgumentException("The key must have a positive length");
        }
    }

    public OctetSequenceKey$ag$a(SecretKey secretKey) {
        this(secretKey.getEncoded());
    }

    public OctetSequenceKey$ag$a valueOf(String str) {
        this.ah$a = str;
        return this;
    }

    public OctetSequenceKey$ag$a valueOf(KeyStore keyStore) {
        this.values = keyStore;
        return this;
    }

    public OctetSequenceKey values() {
        try {
            return new OctetSequenceKey(this.valueOf, this.invoke, this.toString, this.ag$a, this.ah$a, this.HaptikSDK$b, this.ah$b, this.HaptikSDK$c, this.HaptikSDK$a, this.values);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }
}
