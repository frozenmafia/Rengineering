package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.TimestampAdjuster;
/* loaded from: classes4.dex */
public final class cn {
    private long a;

    /* renamed from: b  reason: collision with root package name */
    private long f1001b;
    private long c;
    private final ThreadLocal d = new ThreadLocal();

    public cn(long j) {
        h(j);
    }

    public static long f(long j) {
        return (j * 1000000) / 90000;
    }

    public static long g(long j) {
        return (j * 90000) / 1000000;
    }

    public final long a(long j) {
        synchronized (this) {
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            if (this.f1001b == C.TIME_UNSET) {
                long j2 = this.a;
                if (j2 == TimestampAdjuster.MODE_SHARED) {
                    Long l = (Long) this.d.get();
                    af.s(l);
                    j2 = l.longValue();
                }
                this.f1001b = j2 - j;
                notifyAll();
            }
            this.c = j;
            return j + this.f1001b;
        }
    }

    public final long b(long j) {
        synchronized (this) {
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            long j2 = this.c;
            if (j2 != C.TIME_UNSET) {
                long g = g(j2);
                long j3 = (4294967296L + g) / 8589934592L;
                long j4 = (((-1) + j3) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - g) < Math.abs(j - g)) {
                    j = j4;
                }
            }
            return a(f(j));
        }
    }

    public final long c() {
        synchronized (this) {
            long j = this.a;
            return (j == Long.MAX_VALUE || j == TimestampAdjuster.MODE_SHARED) ? C.TIME_UNSET : j;
        }
    }

    public final long d() {
        long c;
        synchronized (this) {
            long j = this.c;
            c = j != C.TIME_UNSET ? j + this.f1001b : c();
        }
        return c;
    }

    public final long e() {
        long j;
        synchronized (this) {
            j = this.f1001b;
        }
        return j;
    }

    public final void h(long j) {
        synchronized (this) {
            this.a = j;
            this.f1001b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.c = C.TIME_UNSET;
        }
    }

    public final void i(boolean z, long j) throws InterruptedException {
        synchronized (this) {
            af.w(this.a == TimestampAdjuster.MODE_SHARED);
            if (this.f1001b != C.TIME_UNSET) {
                return;
            }
            if (z) {
                this.d.set(Long.valueOf(j));
                return;
            }
            while (this.f1001b == C.TIME_UNSET) {
                wait();
            }
        }
    }
}
