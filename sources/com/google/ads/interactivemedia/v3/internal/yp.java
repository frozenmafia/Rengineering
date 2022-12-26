package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class yp {
    private final long a;

    /* renamed from: b  reason: collision with root package name */
    private final long f1366b;
    private final long c;
    private long d = 0;
    private long e;
    private long f;
    private long g;
    private long h;

    /* JADX INFO: Access modifiers changed from: protected */
    public yp(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.f1366b = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.c = j6;
        this.h = f(j2, 0L, j3, j4, j5, j6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long f(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
        return cp.p(((j4 + j7) - j6) - (j7 / 20), j4, (-1) + j5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void g(yp ypVar, long j, long j2) {
        ypVar.e = j;
        ypVar.g = j2;
        ypVar.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void h(yp ypVar, long j, long j2) {
        ypVar.d = j;
        ypVar.f = j2;
        ypVar.i();
    }

    private final void i() {
        this.h = f(this.f1366b, this.d, this.e, this.f, this.g, this.c);
    }
}
