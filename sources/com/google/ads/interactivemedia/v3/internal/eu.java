package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
public final class eu extends at {
    public final int c;
    public final String d;
    public final int e;
    public final s f;
    public final int g;
    public final am h;
    final boolean i;

    private eu(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    public static eu b(Throwable th, String str, int i, s sVar, int i2, boolean z, int i3) {
        return new eu(1, th, i3, str, i, sVar, sVar == null ? 4 : i2, z);
    }

    public static eu c(IOException iOException, int i) {
        return new eu(0, iOException, i);
    }

    public static eu d(RuntimeException runtimeException, int i) {
        return new eu(2, runtimeException, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eu a(am amVar) {
        String message = getMessage();
        int i = cp.a;
        return new eu(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.g, amVar, this.f707b, this.i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private eu(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, com.google.ads.interactivemedia.v3.internal.s r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L3e
            r0 = 1
            if (r4 == r0) goto Ld
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r17
            r6 = r18
            goto L44
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r19)
            java.lang.String r1 = com.google.ads.interactivemedia.v3.internal.cp.N(r20)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", format_supported="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            goto L44
        L3e:
            r5 = r17
            r6 = r18
            java.lang.String r0 = "Source error"
        L44:
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L5f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
        L5f:
            r1 = r0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r9 = 0
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.eu.<init>(int, java.lang.Throwable, int, java.lang.String, int, com.google.ads.interactivemedia.v3.internal.s, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private eu(java.lang.String r9, java.lang.Throwable r10, int r11, int r12, java.lang.String r13, int r14, com.google.ads.interactivemedia.v3.internal.s r15, int r16, com.google.ads.interactivemedia.v3.internal.am r17, long r18, boolean r20) {
        /*
            r8 = this;
            r6 = r8
            r7 = r20
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r18
            r0.<init>(r1, r2, r3, r4)
            r0 = 0
            r1 = 1
            r2 = r12
            if (r7 == 0) goto L17
            if (r2 != r1) goto L15
            r2 = 1
            goto L17
        L15:
            r3 = 0
            goto L18
        L17:
            r3 = 1
        L18:
            com.google.ads.interactivemedia.v3.internal.af.u(r3)
            if (r10 != 0) goto L1e
            goto L1f
        L1e:
            r0 = 1
        L1f:
            com.google.ads.interactivemedia.v3.internal.af.u(r0)
            r6.c = r2
            r0 = r13
            r6.d = r0
            r0 = r14
            r6.e = r0
            r0 = r15
            r6.f = r0
            r0 = r16
            r6.g = r0
            r0 = r17
            r6.h = r0
            r6.i = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.eu.<init>(java.lang.String, java.lang.Throwable, int, int, java.lang.String, int, com.google.ads.interactivemedia.v3.internal.s, int, com.google.ads.interactivemedia.v3.internal.am, long, boolean):void");
    }
}
