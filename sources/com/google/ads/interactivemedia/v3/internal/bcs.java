package com.google.ads.interactivemedia.v3.internal;

import com.sendbird.android.constant.StringSet;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes4.dex */
final class bcs {
    private static final byte[] a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final bcr f795b;
    private final BigInteger c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private BigInteger g = BigInteger.ZERO;

    private bcs(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, bcr bcrVar) {
        this.f = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.c = bigInteger;
        this.f795b = bcrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bcs c(byte[] bArr, byte[] bArr2, bcv bcvVar, bcq bcqVar, bcr bcrVar, byte[] bArr3) throws GeneralSecurityException {
        byte[] b2 = bdd.b(bcvVar.b(), bcqVar.b(), bcrVar.b());
        byte[] bArr4 = bdd.l;
        byte[] bArr5 = a;
        byte[] y = bic.y(bdd.a, bcqVar.d(bArr4, bArr5, "psk_id_hash", b2), bcqVar.d(bdd.l, bArr3, "info_hash", b2));
        byte[] d = bcqVar.d(bArr2, bArr5, "secret", b2);
        return new bcs(bArr, bcqVar.c(d, y, StringSet.key, b2, bcrVar.a()), bcqVar.c(d, y, "base_nonce", b2, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), bcrVar);
    }

    private final byte[] d() throws GeneralSecurityException {
        byte[] z;
        synchronized (this) {
            byte[] bArr = this.e;
            byte[] byteArray = this.g.toByteArray();
            int length = byteArray.length;
            if (length != 12) {
                if (length > 13) {
                    throw new GeneralSecurityException("integer too large");
                }
                if (length == 13) {
                    if (byteArray[0] == 0) {
                        byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                    } else {
                        throw new GeneralSecurityException("integer too large");
                    }
                } else {
                    byte[] bArr2 = new byte[12];
                    System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                    byteArray = bArr2;
                }
            }
            z = bic.z(bArr, byteArray);
            if (this.g.compareTo(this.c) >= 0) {
                throw new GeneralSecurityException("message limit reached");
            }
            this.g = this.g.add(BigInteger.ONE);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] a() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f795b.c(this.d, d(), bArr, bArr2);
    }
}
