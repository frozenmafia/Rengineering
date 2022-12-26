package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes4.dex */
final class bcq {
    private final String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bcq(String str) {
        this.a = str;
    }

    private final byte[] f(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        Mac mac = (Mac) bhq.f838b.a(this.a);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(bArr, this.a));
        byte[] bArr4 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArr4);
            mac.update(bArr2);
            mac.update((byte) i2);
            bArr4 = mac.doFinal();
            int length = bArr4.length;
            int i4 = i3 + length;
            if (i4 < i) {
                System.arraycopy(bArr4, 0, bArr3, i3, length);
                i2++;
                i3 = i4;
            } else {
                System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                return bArr3;
            }
        }
    }

    private final byte[] g(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac mac = (Mac) bhq.f838b.a(this.a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.a));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.a));
        }
        return mac.doFinal(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() throws GeneralSecurityException {
        return Mac.getInstance(this.a).getMacLength();
    }

    public final byte[] c(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i) throws GeneralSecurityException {
        return f(bArr, bdd.f(str, bArr2, bArr3, i), i);
    }

    public final byte[] d(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) throws GeneralSecurityException {
        return g(bdd.e(str, bArr2, bArr3), bArr);
    }

    public final byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws GeneralSecurityException {
        return f(g(bdd.e("eae_prk", bArr, bArr3), null), bdd.f("shared_secret", bArr2, bArr3, i), i);
    }

    public final byte[] b() throws GeneralSecurityException {
        char c;
        String str = this.a;
        int hashCode = str.hashCode();
        if (hashCode == 984523022) {
            if (str.equals("HmacSha256")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 984524074) {
            if (hashCode == 984525777 && str.equals("HmacSha512")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("HmacSha384")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return bdd.h;
                }
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
            }
            return bdd.g;
        }
        return bdd.f;
    }
}
