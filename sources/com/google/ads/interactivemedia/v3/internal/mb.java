package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class mb extends mg {
    final long a;

    /* renamed from: b  reason: collision with root package name */
    final long f1168b;
    final List c;
    final long d;
    private final long e;
    private final long f;

    public mb(lx lxVar, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(lxVar, j, j2);
        this.a = j3;
        this.f1168b = j4;
        this.c = list;
        this.d = j5;
        this.e = j6;
        this.f = j7;
    }

    public final long a(long j, long j2) {
        long c = c(j);
        if (c != -1) {
            return c;
        }
        return (int) (e((j2 - this.f) + this.d, j) - b(j, j2));
    }

    public final long b(long j, long j2) {
        if (c(j) == -1) {
            long j3 = this.e;
            if (j3 != C.TIME_UNSET) {
                return Math.max(this.a, e((j2 - this.f) - j3, j));
            }
        }
        return this.a;
    }

    public abstract long c(long j);

    public final long d(long j, long j2) {
        List list = this.c;
        if (list != null) {
            return (((me) list.get((int) (j - this.a))).f1169b * 1000000) / this.i;
        }
        long c = c(j2);
        if (c == -1 || j != (this.a + c) - 1) {
            return (this.f1168b * 1000000) / this.i;
        }
        return j2 - f(j);
    }

    public final long e(long j, long j2) {
        long j3 = this.a;
        long c = c(j2);
        if (c == 0) {
            return j3;
        }
        if (this.c == null) {
            long j4 = this.a + (j / ((this.f1168b * 1000000) / this.i));
            return j4 < j3 ? j3 : c != -1 ? Math.min(j4, (j3 + c) - 1) : j4;
        }
        long j5 = (c + j3) - 1;
        long j6 = j3;
        while (j6 <= j5) {
            long j7 = ((j5 - j6) / 2) + j6;
            int i = (f(j7) > j ? 1 : (f(j7) == j ? 0 : -1));
            if (i < 0) {
                j6 = j7 + 1;
            } else if (i <= 0) {
                return j7;
            } else {
                j5 = j7 - 1;
            }
        }
        return j6 == j3 ? j6 : j5;
    }

    public final long f(long j) {
        List list = this.c;
        return cp.w(list != null ? ((me) list.get((int) (j - this.a))).a - this.j : (j - this.a) * this.f1168b, 1000000L, this.i);
    }

    public abstract lx g(ma maVar, long j);

    public boolean h() {
        return this.c != null;
    }
}
