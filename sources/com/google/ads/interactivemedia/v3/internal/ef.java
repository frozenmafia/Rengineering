package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
/* loaded from: classes4.dex */
public abstract class ef extends be {

    /* renamed from: b  reason: collision with root package name */
    private final int f1025b;
    private final ue c;

    public ef(ue ueVar) {
        this.c = ueVar;
        this.f1025b = ueVar.c();
    }

    private final int A(int i, boolean z) {
        if (z) {
            return this.c.d(i);
        }
        if (i >= this.f1025b - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int B(int i, boolean z) {
        if (z) {
            return this.c.e(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    public static Object x(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object y(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int a(Object obj) {
        int a;
        if (obj instanceof Pair) {
            Object y = y(obj);
            Object x = x(obj);
            int r = r(y);
            if (r == -1 || (a = w(r).a(x)) == -1) {
                return -1;
            }
            return u(r) + a;
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final bc d(int i, bc bcVar, boolean z) {
        int s = s(i);
        int v = v(s);
        w(s).d(i - u(s), bcVar, z);
        bcVar.c += v;
        if (z) {
            Object z2 = z(s);
            Object obj = bcVar.f793b;
            af.s(obj);
            bcVar.f793b = Pair.create(z2, obj);
        }
        return bcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final bd e(int i, bd bdVar, long j) {
        int t = t(i);
        int v = v(t);
        int u = u(t);
        w(t).e(i - v, bdVar, j);
        Object z = z(t);
        if (!bd.a.equals(bdVar.f798b)) {
            z = Pair.create(z, bdVar.f798b);
        }
        bdVar.f798b = z;
        bdVar.f799o += u;
        bdVar.p += u;
        return bdVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final Object f(int i) {
        int s = s(i);
        return Pair.create(z(s), w(s).f(i - u(s)));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int g(boolean z) {
        if (this.f1025b == 0) {
            return -1;
        }
        int a = z ? this.c.a() : 0;
        while (w(a).p()) {
            a = A(a, z);
            if (a == -1) {
                return -1;
            }
        }
        return v(a) + w(a).g(z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int h(boolean z) {
        int i = this.f1025b;
        if (i == 0) {
            return -1;
        }
        int b2 = z ? this.c.b() : i - 1;
        while (w(b2).p()) {
            b2 = B(b2, z);
            if (b2 == -1) {
                return -1;
            }
        }
        return v(b2) + w(b2).h(z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int j(int i, int i2, boolean z) {
        int t = t(i);
        int v = v(t);
        int j = w(t).j(i - v, i2 == 2 ? 0 : i2, z);
        if (j != -1) {
            return v + j;
        }
        int A = A(t, z);
        while (A != -1 && w(A).p()) {
            A = A(A, z);
        }
        if (A != -1) {
            return v(A) + w(A).g(z);
        }
        if (i2 == 2) {
            return g(z);
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final bc n(Object obj, bc bcVar) {
        Object y = y(obj);
        Object x = x(obj);
        int r = r(y);
        int v = v(r);
        w(r).n(x, bcVar);
        bcVar.c += v;
        bcVar.f793b = obj;
        return bcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int q(int i) {
        int t = t(i);
        int v = v(t);
        int q = w(t).q(i - v);
        if (q != -1) {
            return v + q;
        }
        int B = B(t, false);
        while (B != -1 && w(B).p()) {
            B = B(B, false);
        }
        if (B != -1) {
            return v(B) + w(B).h(false);
        }
        return -1;
    }

    protected abstract int r(Object obj);

    protected abstract int s(int i);

    protected abstract int t(int i);

    protected abstract int u(int i);

    protected abstract int v(int i);

    protected abstract be w(int i);

    protected abstract Object z(int i);
}
