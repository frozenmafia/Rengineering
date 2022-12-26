package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
/* loaded from: classes4.dex */
public final class uf extends be {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f1296b = new Object();
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final Object l;
    private final ai m;
    private final ac n;

    static {
        v vVar = new v();
        vVar.b("SinglePeriodTimeline");
        vVar.c(Uri.EMPTY);
        vVar.a();
    }

    public uf(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, Object obj, ai aiVar, ac acVar) {
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = obj;
        this.m = aiVar;
        this.n = acVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int a(Object obj) {
        return f1296b.equals(obj) ? 0 : -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int b() {
        return 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int c() {
        return 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final bc d(int i, bc bcVar, boolean z) {
        af.y(i, 1);
        return bcVar.m(null, z ? f1296b : null, this.e, -this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r1 > r6) goto L11;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.be
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.bd e(int r24, com.google.ads.interactivemedia.v3.internal.bd r25, long r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = 1
            r2 = r24
            com.google.ads.interactivemedia.v3.internal.af.y(r2, r1)
            long r1 = r0.h
            boolean r3 = r0.j
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L2d
            boolean r3 = r0.k
            if (r3 != 0) goto L2d
            r6 = 0
            int r3 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r6 = r0.f
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L24
            goto L2a
        L24:
            long r1 = r1 + r26
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 <= 0) goto L2d
        L2a:
            r16 = r4
            goto L2f
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = com.google.ads.interactivemedia.v3.internal.bd.a
            com.google.ads.interactivemedia.v3.internal.ai r5 = r0.m
            java.lang.Object r6 = r0.l
            long r7 = r0.c
            long r9 = r0.d
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r13 = r0.i
            boolean r14 = r0.j
            com.google.ads.interactivemedia.v3.internal.ac r15 = r0.n
            long r1 = r0.f
            r18 = r1
            r20 = 0
            long r1 = r0.g
            r21 = r1
            r3 = r25
            r3.d(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.uf.e(int, com.google.ads.interactivemedia.v3.internal.bd, long):com.google.ads.interactivemedia.v3.internal.bd");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final Object f(int i) {
        af.y(i, 1);
        return f1296b;
    }
}
