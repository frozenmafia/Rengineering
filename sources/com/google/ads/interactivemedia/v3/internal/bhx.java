package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
/* loaded from: classes4.dex */
public final class bhx implements bey {
    public static final int a = bbt.f791b;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadLocal f841b;
    private final String c;
    private final Key d;
    private final int e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public bhx(String str, Key key) throws GeneralSecurityException {
        char c;
        int i;
        bhw bhwVar = new bhw(this);
        this.f841b = bhwVar;
        if (bbt.a(a)) {
            this.c = str;
            this.d = key;
            if (key.getEncoded().length < 16) {
                throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
            }
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 392315023:
                    if (str.equals("HMACSHA224")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.e = 20;
            } else {
                if (c == 1) {
                    i = 28;
                } else if (c == 2) {
                    i = 32;
                } else if (c == 3) {
                    i = 48;
                } else if (c != 4) {
                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                } else {
                    i = 64;
                }
                this.e = i;
            }
            bhwVar.get();
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bey
    public final byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > this.e) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f841b.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f841b.get()).doFinal(), i);
    }
}
