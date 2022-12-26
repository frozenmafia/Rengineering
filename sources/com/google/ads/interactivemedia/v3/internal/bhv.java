package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Color;
import android.os.Process;
import android.view.View;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import o.isAfterLast;
/* loaded from: classes4.dex */
public final class bhv implements bey {
    private static int toString = 1;
    private static int values;

    /* renamed from: b  reason: collision with root package name */
    private final SecretKey f840b;
    private byte[] c;
    private byte[] d;
    private static int valueOf = 192;
    public static final int a = bbt.a;

    static {
        int i = values + 79;
        toString = i % 128;
        int i2 = i % 2;
    }

    public bhv(byte[] bArr) throws GeneralSecurityException {
        bib.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, values(2 - View.MeasureSpec.makeMeasureSpec(0, 0), 263 - Process.getGidForName(""), true, Color.green(0) + 3, new char[]{65533, 65529, 11}).intern());
        this.f840b = secretKeySpec;
        Cipher b2 = b();
        b2.init(1, secretKeySpec);
        byte[] C = bic.C(b2.doFinal(new byte[16]));
        this.c = C;
        this.d = bic.C(C);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        if ((com.google.ads.interactivemedia.v3.internal.bbt.a(com.google.ads.interactivemedia.v3.internal.bhv.a) ? 26 : '=') != '=') goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        r0 = (javax.crypto.Cipher) com.google.ads.interactivemedia.v3.internal.bhq.a.a("AES/ECB/NoPadding");
        r2 = com.google.ads.interactivemedia.v3.internal.bhv.values + 103;
        com.google.ads.interactivemedia.v3.internal.bhv.toString = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        r1 = '9';
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r1 == '9') goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
        throw new java.security.GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (com.google.ads.interactivemedia.v3.internal.bbt.a(com.google.ads.interactivemedia.v3.internal.bhv.a) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static javax.crypto.Cipher b() throws java.security.GeneralSecurityException {
        /*
            int r0 = com.google.ads.interactivemedia.v3.internal.bhv.values
            int r0 = r0 + 85
            int r1 = r0 % 128
            com.google.ads.interactivemedia.v3.internal.bhv.toString = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == r2) goto L1e
            int r0 = com.google.ads.interactivemedia.v3.internal.bhv.a     // Catch: java.lang.Exception -> L1c
            boolean r0 = com.google.ads.interactivemedia.v3.internal.bbt.a(r0)     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L56
            goto L32
        L1c:
            r0 = move-exception
            throw r0
        L1e:
            int r0 = com.google.ads.interactivemedia.v3.internal.bhv.a
            boolean r0 = com.google.ads.interactivemedia.v3.internal.bbt.a(r0)
            r2 = 20
            int r2 = r2 / r3
            r2 = 61
            if (r0 == 0) goto L2e
            r0 = 26
            goto L30
        L2e:
            r0 = 61
        L30:
            if (r0 == r2) goto L56
        L32:
            com.google.ads.interactivemedia.v3.internal.bhq r0 = com.google.ads.interactivemedia.v3.internal.bhq.a
            java.lang.String r2 = "AES/ECB/NoPadding"
            java.lang.Object r0 = r0.a(r2)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            int r2 = com.google.ads.interactivemedia.v3.internal.bhv.values
            int r2 = r2 + 103
            int r3 = r2 % 128
            com.google.ads.interactivemedia.v3.internal.bhv.toString = r3
            int r2 = r2 % r1
            r3 = 57
            if (r2 != 0) goto L4a
            goto L4c
        L4a:
            r1 = 57
        L4c:
            if (r1 == r3) goto L55
            r1 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L53
            return r0
        L53:
            r0 = move-exception
            throw r0
        L55:
            return r0
        L56:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use AES-CMAC in FIPS-mode."
            r0.<init>(r1)
            throw r0
        L5e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bhv.b():javax.crypto.Cipher");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bey
    public final byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] z;
        int i2;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        int i3 = values + 93;
        toString = i3 % 128;
        int i4 = i3 % 2;
        Cipher b2 = b();
        b2.init(1, this.f840b);
        int length = bArr.length;
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        if (max * 16 != length) {
            z = bic.z(bic.B(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.d);
            i2 = values + 25;
        } else {
            int i5 = toString + 29;
            values = i5 % 128;
            int i6 = i5 % 2;
            z = bic.A(bArr, (max - 1) * 16, this.c, 0, 16);
            i2 = values + 83;
        }
        toString = i2 % 128;
        int i7 = i2 % 2;
        byte[] bArr2 = new byte[16];
        int i8 = 0;
        while (true) {
            if (!(i8 >= max + (-1))) {
                bArr2 = b2.doFinal(bic.A(bArr2, 0, bArr, i8 * 16, 16));
                i8++;
            } else {
                return Arrays.copyOf(b2.doFinal(bic.z(z, bArr2)), i);
            }
        }
    }

    private static String values(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - valueOf);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
