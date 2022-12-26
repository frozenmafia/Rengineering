package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
/* loaded from: classes4.dex */
public final class bhr implements bhs {
    private final /* synthetic */ int a;

    public bhr(int i) {
        this.a = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bhs
    public final /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        int i = this.a;
        if (i == 0) {
            if (provider == null) {
                return KeyAgreement.getInstance(str);
            }
            return KeyAgreement.getInstance(str, provider);
        } else if (i == 1) {
            if (provider == null) {
                return Cipher.getInstance(str);
            }
            return Cipher.getInstance(str, provider);
        } else if (i == 2) {
            if (provider == null) {
                return KeyFactory.getInstance(str);
            }
            return KeyFactory.getInstance(str, provider);
        } else if (i == 3) {
            if (provider == null) {
                return KeyPairGenerator.getInstance(str);
            }
            return KeyPairGenerator.getInstance(str, provider);
        } else if (i == 4) {
            if (provider == null) {
                return Mac.getInstance(str);
            }
            return Mac.getInstance(str, provider);
        } else if (i != 5) {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        } else if (provider == null) {
            return MessageDigest.getInstance(str);
        } else {
            return MessageDigest.getInstance(str, provider);
        }
    }
}
