package com.google.ads.interactivemedia.v3.internal;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
public final class bdd {
    public static final byte[] a = c(1, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f800b = c(2, 32);
    public static final byte[] c = c(2, 16);
    public static final byte[] d = c(2, 17);
    public static final byte[] e = c(2, 18);
    public static final byte[] f = c(2, 1);
    public static final byte[] g = c(2, 2);
    public static final byte[] h = c(2, 3);
    public static final byte[] i = c(2, 1);
    public static final byte[] j = c(2, 2);
    public static final byte[] k = c(2, 3);
    public static final byte[] l = new byte[0];
    private static final byte[] m = "KEM".getBytes(StandardCharsets.UTF_8);
    private static final byte[] n = "HPKE".getBytes(StandardCharsets.UTF_8);

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f801o = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(bgi bgiVar) throws GeneralSecurityException {
        if (bgiVar.e() == bgg.a || bgiVar.e() == bgg.f) {
            int e2 = bgiVar.e();
            String a2 = bgg.a(e2);
            if (e2 == 0) {
                throw null;
            }
            throw new GeneralSecurityException("Invalid KEM param: ".concat(String.valueOf(a2)));
        } else if (bgiVar.d() == bgf.a || bgiVar.d() == bgf.e) {
            int d2 = bgiVar.d();
            String a3 = bgf.a(d2);
            if (d2 == 0) {
                throw null;
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(String.valueOf(a3)));
        } else if (bgiVar.c() == bge.a || bgiVar.c() == bge.e) {
            int c2 = bgiVar.c();
            String a4 = bge.a(c2);
            if (c2 == 0) {
                throw null;
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(String.valueOf(a4)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return bic.y(n, bArr, bArr2, bArr3);
    }

    public static byte[] c(int i2, int i3) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i3 >> (((i2 - i4) - 1) * 8)) & 255);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] d(byte[] bArr) throws GeneralSecurityException {
        return bic.y(m, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] e(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return bic.y(f801o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] f(String str, byte[] bArr, byte[] bArr2, int i2) throws GeneralSecurityException {
        return bic.y(c(2, i2), f801o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
