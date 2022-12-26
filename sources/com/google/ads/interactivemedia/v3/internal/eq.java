package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
public final class eq {
    private final long e;
    private final long f;
    private final float a = 0.97f;

    /* renamed from: b  reason: collision with root package name */
    private final float f1034b = 1.03f;
    private final long c = 1000;
    private final float d = 1.0E-7f;
    private final float g = 0.999f;
    private long h = C.TIME_UNSET;
    private long i = C.TIME_UNSET;
    private long k = C.TIME_UNSET;
    private long l = C.TIME_UNSET;

    /* renamed from: o  reason: collision with root package name */
    private float f1035o = 0.97f;
    private float n = 1.03f;
    private float p = 1.0f;
    private long q = C.TIME_UNSET;
    private long j = C.TIME_UNSET;
    private long m = C.TIME_UNSET;
    private long r = C.TIME_UNSET;
    private long s = C.TIME_UNSET;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ eq(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.e = j2;
        this.f = j3;
    }

    private static long f(long j, long j2, float f) {
        return (((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f);
    }

    private final void g() {
        long j = this.h;
        if (j != C.TIME_UNSET) {
            long j2 = this.i;
            if (j2 != C.TIME_UNSET) {
                j = j2;
            }
            long j3 = this.k;
            if (j3 != C.TIME_UNSET && j < j3) {
                j = j3;
            }
            long j4 = this.l;
            if (j4 != C.TIME_UNSET && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.j == j) {
            return;
        }
        this.j = j;
        this.m = j;
        this.r = C.TIME_UNSET;
        this.s = C.TIME_UNSET;
        this.q = C.TIME_UNSET;
    }

    public final long b() {
        return this.m;
    }

    public final void c() {
        long j = this.m;
        if (j == C.TIME_UNSET) {
            return;
        }
        long j2 = j + this.f;
        this.m = j2;
        long j3 = this.l;
        if (j3 != C.TIME_UNSET && j2 > j3) {
            this.m = j3;
        }
        this.q = C.TIME_UNSET;
    }

    public final void d(ac acVar) {
        this.h = cp.t(acVar.a);
        this.k = cp.t(acVar.f454b);
        this.l = cp.t(acVar.c);
        float f = acVar.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        this.f1035o = f;
        float f2 = acVar.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        this.n = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.h = C.TIME_UNSET;
        }
        g();
    }

    public final void e(long j) {
        this.i = j;
        g();
    }

    public final float a(long j, long j2) {
        long p;
        if (this.h != C.TIME_UNSET) {
            long j3 = j - j2;
            long j4 = this.r;
            if (j4 == C.TIME_UNSET) {
                this.r = j3;
                this.s = 0L;
            } else {
                long max = Math.max(j3, f(j4, j3, 0.999f));
                this.r = max;
                this.s = f(this.s, Math.abs(j3 - max), 0.999f);
            }
            if (this.q == C.TIME_UNSET || SystemClock.elapsedRealtime() - this.q >= 1000) {
                this.q = SystemClock.elapsedRealtime();
                long j5 = this.r + (this.s * 3);
                if (this.m > j5) {
                    float t = (float) cp.t(1000L);
                    long[] jArr = {j5, this.j, this.m - (((this.p - 1.0f) * t) + ((this.n - 1.0f) * t))};
                    atc.e(true);
                    p = jArr[0];
                    for (int i = 1; i < 3; i++) {
                        long j6 = jArr[i];
                        if (j6 > p) {
                            p = j6;
                        }
                    }
                    this.m = p;
                } else {
                    p = cp.p(j - (Math.max(0.0f, this.p - 1.0f) / 1.0E-7f), this.m, j5);
                    this.m = p;
                    long j7 = this.l;
                    if (j7 != C.TIME_UNSET && p > j7) {
                        this.m = j7;
                        p = j7;
                    }
                }
                long j8 = j - p;
                if (Math.abs(j8) < this.e) {
                    this.p = 1.0f;
                    return 1.0f;
                }
                float a = cp.a((((float) j8) * 1.0E-7f) + 1.0f, this.f1035o, this.n);
                this.p = a;
                return a;
            }
            return this.p;
        }
        return 1.0f;
    }
}
