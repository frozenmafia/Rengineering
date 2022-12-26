package com.google.ads.interactivemedia.v3.internal;

import javax.crypto.spec.SecretKeySpec;
import o.isFirst;
/* loaded from: classes4.dex */
public final class bhe implements bhu {
    public static final int a;
    private static int ag$a = 0;
    private static char ah$a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal f831b;
    private static int toString = 1;
    private static char[] valueOf;
    private final SecretKeySpec c;
    private final int d;
    private final int e;

    static {
        ah$a();
        a = bbt.f791b;
        f831b = new bhd();
        int i = ag$a + 27;
        toString = i % 128;
        if ((i % 2 == 0 ? '\f' : 'O') != '\f') {
            return;
        }
        int i2 = 5 / 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
        if (r11 <= r10) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
        if (r11 <= r10) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        r9.d = r11;
        r10 = com.google.ads.interactivemedia.v3.internal.bhe.toString + 99;
        com.google.ads.interactivemedia.v3.internal.bhe.ag$a = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bhe(byte[] r10, int r11) throws java.security.GeneralSecurityException {
        /*
            r9 = this;
            r9.<init>()
            int r0 = com.google.ads.interactivemedia.v3.internal.bhe.a
            boolean r0 = com.google.ads.interactivemedia.v3.internal.bbt.a(r0)
            if (r0 == 0) goto L82
            int r0 = r10.length
            com.google.ads.interactivemedia.v3.internal.bib.a(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            int r1 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r1 = r1 >> 8
            int r1 = r1 + 24
            byte r1 = (byte) r1
            r2 = 3
            char[] r2 = new char[r2]
            r2 = {x008a: FILL_ARRAY_DATA  , data: [0, 2, 13793} // fill-array
            long r3 = android.os.SystemClock.currentThreadTimeMillis()
            r5 = -1
            r7 = 87
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r8 = r8 + 2
            java.lang.String r1 = valueOf(r1, r2, r8)
            java.lang.String r1 = r1.intern()
            r0.<init>(r10, r1)
            r9.c = r0
            java.lang.ThreadLocal r10 = com.google.ads.interactivemedia.v3.internal.bhe.f831b
            java.lang.Object r10 = r10.get()
            javax.crypto.Cipher r10 = (javax.crypto.Cipher) r10
            int r10 = r10.getBlockSize()
            r9.e = r10
            r0 = 12
            if (r11 < r0) goto L4e
            r0 = 67
            goto L50
        L4e:
            r0 = 87
        L50:
            if (r0 == r7) goto L7a
            int r0 = com.google.ads.interactivemedia.v3.internal.bhe.ag$a
            r1 = 1
            int r0 = r0 + r1
            int r2 = r0 % 128
            com.google.ads.interactivemedia.v3.internal.bhe.toString = r2
            int r0 = r0 % 2
            r2 = 0
            if (r0 != 0) goto L60
            goto L61
        L60:
            r1 = 0
        L61:
            if (r1 == 0) goto L6b
            r0 = 82
            int r0 = r0 / r2
            if (r11 > r10) goto L7a
            goto L6d
        L69:
            r10 = move-exception
            throw r10
        L6b:
            if (r11 > r10) goto L7a
        L6d:
            r9.d = r11
            int r10 = com.google.ads.interactivemedia.v3.internal.bhe.toString
            int r10 = r10 + 99
            int r11 = r10 % 128
            com.google.ads.interactivemedia.v3.internal.bhe.ag$a = r11
            int r10 = r10 % 2
            return
        L7a:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "invalid IV size"
            r10.<init>(r11)
            throw r10
        L82:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bhe.<init>(byte[], int):void");
    }

    static void ah$a() {
        ah$a = (char) 2;
        valueOf = new char[]{13791, 13792, 13787, 13769};
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r0 <= (Integer.MAX_VALUE / r1)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r2 = new byte[r1 + r0];
        r1 = com.google.ads.interactivemedia.v3.internal.bia.b(r1);
        java.lang.System.arraycopy(r1, 0, r2, 0, r12.d);
        r9 = r12.d;
        r4 = (javax.crypto.Cipher) com.google.ads.interactivemedia.v3.internal.bhe.f831b.get();
        r3 = new byte[r12.e];
        java.lang.System.arraycopy(r1, 0, r3, 0, r12.d);
        r4.init(1, r12.c, new javax.crypto.spec.IvParameterSpec(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
        if (r4.doFinal(r13, 0, r0, r2, r9) != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        r13 = 'Q';
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
        r13 = '^';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
        if (r13 == '^') goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
        r13 = com.google.ads.interactivemedia.v3.internal.bhe.toString + 9;
        com.google.ads.interactivemedia.v3.internal.bhe.ag$a = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        if ((r13 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (r13 == true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
        r13 = 13 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
        throw new java.security.GeneralSecurityException("stored output's length does not match input's length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
        r13 = r12.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
        throw new java.security.GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 <= (Integer.MAX_VALUE - r1)) goto L11;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.bhu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a(byte[] r13) throws java.security.GeneralSecurityException {
        /*
            r12 = this;
            int r0 = com.google.ads.interactivemedia.v3.internal.bhe.toString
            int r0 = r0 + 47
            int r1 = r0 % 128
            com.google.ads.interactivemedia.v3.internal.bhe.ag$a = r1
            int r0 = r0 % 2
            r1 = 70
            if (r0 == 0) goto L11
            r0 = 70
            goto L13
        L11:
            r0 = 71
        L13:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L20
            int r0 = r13.length
            int r1 = r12.d
            int r3 = r2 - r1
            if (r0 > r3) goto L87
            goto L27
        L20:
            int r0 = r13.length
            int r1 = r12.d
            int r3 = r2 / r1
            if (r0 > r3) goto L87
        L27:
            int r2 = r1 + r0
            byte[] r2 = new byte[r2]
            byte[] r1 = com.google.ads.interactivemedia.v3.internal.bia.b(r1)
            int r3 = r12.d
            r10 = 0
            java.lang.System.arraycopy(r1, r10, r2, r10, r3)
            int r9 = r12.d
            java.lang.ThreadLocal r3 = com.google.ads.interactivemedia.v3.internal.bhe.f831b
            java.lang.Object r3 = r3.get()
            r4 = r3
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            int r3 = r12.e
            byte[] r3 = new byte[r3]
            int r5 = r12.d
            java.lang.System.arraycopy(r1, r10, r3, r10, r5)
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec
            r1.<init>(r3)
            javax.crypto.spec.SecretKeySpec r3 = r12.c
            r11 = 1
            r4.init(r11, r3, r1)
            r6 = 0
            r5 = r13
            r7 = r0
            r8 = r2
            int r13 = r4.doFinal(r5, r6, r7, r8, r9)
            r1 = 94
            if (r13 != r0) goto L63
            r13 = 81
            goto L65
        L63:
            r13 = 94
        L65:
            if (r13 == r1) goto L7f
            int r13 = com.google.ads.interactivemedia.v3.internal.bhe.toString
            int r13 = r13 + 9
            int r0 = r13 % 128
            com.google.ads.interactivemedia.v3.internal.bhe.ag$a = r0
            int r13 = r13 % 2
            if (r13 == 0) goto L75
            r13 = 0
            goto L76
        L75:
            r13 = 1
        L76:
            if (r13 == r11) goto L7e
            r13 = 13
            int r13 = r13 / r10
            return r2
        L7c:
            r13 = move-exception
            throw r13
        L7e:
            return r2
        L7f:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            java.lang.String r0 = "stored output's length does not match input's length"
            r13.<init>(r0)
            throw r13
        L87:
            int r13 = r12.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "plaintext length can not exceed "
            r0.append(r1)
            int r2 = r2 - r13
            r0.append(r2)
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bhe.a(byte[]):byte[]");
    }

    private static String valueOf(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = valueOf;
            char c = ah$a;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}
