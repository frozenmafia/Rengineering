package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
public final class lg {
    final uq a;

    /* renamed from: b  reason: collision with root package name */
    public final ma f1150b;
    public final lp c;
    public final le d;
    private final long e;
    private final long f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lg(long j, ma maVar, lp lpVar, uq uqVar, long j2, le leVar) {
        this.e = j;
        this.f1150b = maVar;
        this.c = lpVar;
        this.f = j2;
        this.a = uqVar;
        this.d = leVar;
    }

    public final long b(long j) {
        return this.d.c(this.e, j) + this.f;
    }

    public final long c() {
        return this.d.d() + this.f;
    }

    public final long d(long j) {
        return (b(j) + this.d.a(this.e, j)) - 1;
    }

    public final long e() {
        return this.d.f(this.e);
    }

    public final long f(long j) {
        return h(j) + this.d.b(j - this.f, this.e);
    }

    public final long g(long j) {
        return this.d.g(j, this.e) + this.f;
    }

    public final long h(long j) {
        return this.d.h(j - this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lg i(long j, ma maVar) throws rx {
        long g;
        le k = this.f1150b.k();
        le k2 = maVar.k();
        if (k == null) {
            return new lg(j, maVar, this.c, this.a, this.f, null);
        }
        if (k.j()) {
            long f = k.f(j);
            if (f == 0) {
                return new lg(j, maVar, this.c, this.a, this.f, k2);
            }
            long d = k.d();
            long h = k.h(d);
            long j2 = (f + d) - 1;
            long h2 = k.h(j2);
            long b2 = k.b(j2, j);
            long d2 = k2.d();
            long h3 = k2.h(d2);
            long j3 = this.f;
            int i = ((h2 + b2) > h3 ? 1 : ((h2 + b2) == h3 ? 0 : -1));
            if (i == 0) {
                g = j3 + ((j2 + 1) - d2);
            } else if (i < 0) {
                throw new rx();
            } else {
                if (h3 < h) {
                    g = j3 - (k2.g(h, j) - d);
                } else {
                    g = j3 + (k.g(h3, j) - d2);
                }
            }
            return new lg(j, maVar, this.c, this.a, g, k2);
        }
        return new lg(j, maVar, this.c, this.a, this.f, k2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lg j(le leVar) {
        return new lg(this.e, this.f1150b, this.c, this.a, this.f, leVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lg k(lp lpVar) {
        return new lg(this.e, this.f1150b, lpVar, this.a, this.f, this.d);
    }

    public final lx l(long j) {
        return this.d.i(j - this.f);
    }

    public final boolean m(long j, long j2) {
        return this.d.j() || j2 == C.TIME_UNSET || f(j) <= j2;
    }
}
