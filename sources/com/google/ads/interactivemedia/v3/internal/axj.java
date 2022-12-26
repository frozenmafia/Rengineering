package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class axj {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r12 > 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r12 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r11 == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long a(long r11, java.math.RoundingMode r13) {
        /*
            com.google.ads.interactivemedia.v3.internal.atc.k(r13)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r11 / r0
            long r4 = r2 * r0
            long r4 = r11 - r4
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L12
            return r2
        L12:
            long r11 = r11 ^ r0
            r9 = 63
            long r11 = r11 >> r9
            int r12 = (int) r11
            r11 = 1
            r12 = r12 | r11
            int[] r9 = com.google.ads.interactivemedia.v3.internal.axi.a
            int r10 = r13.ordinal()
            r9 = r9[r10]
            switch(r9) {
                case 1: goto L57;
                case 2: goto L59;
                case 3: goto L4e;
                case 4: goto L54;
                case 5: goto L4b;
                case 6: goto L2a;
                case 7: goto L2a;
                case 8: goto L2a;
                default: goto L24;
            }
        L24:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            r11.<init>()
            throw r11
        L2a:
            long r4 = java.lang.Math.abs(r4)
            long r0 = java.lang.Math.abs(r0)
            long r0 = r0 - r4
            long r4 = r4 - r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L48
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            if (r13 == r0) goto L52
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_EVEN
            if (r13 != r0) goto L51
            r0 = 1
            long r0 = r0 & r2
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 == 0) goto L51
            goto L52
        L48:
            if (r0 <= 0) goto L51
            goto L52
        L4b:
            if (r12 <= 0) goto L51
            goto L52
        L4e:
            if (r12 >= 0) goto L51
            goto L52
        L51:
            r11 = 0
        L52:
            if (r11 == 0) goto L59
        L54:
            long r11 = (long) r12
            long r2 = r2 + r11
            return r2
        L57:
            if (r8 != 0) goto L5a
        L59:
            return r2
        L5a:
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
            java.lang.String r12 = "mode was UNNECESSARY, but rounding was necessary"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.axj.a(long, java.math.RoundingMode):long");
    }
}
