package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public abstract class h implements az {
    protected final bd a = new bd();

    private final void v() {
        s();
    }

    public final int a() {
        be o2 = o();
        if (o2.p()) {
            return -1;
        }
        int h = h();
        v();
        t();
        return o2.j(h, 0, false);
    }

    public final int b() {
        be o2 = o();
        if (o2.p()) {
            return -1;
        }
        int h = h();
        v();
        t();
        return o2.q(h);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final boolean c() {
        be o2 = o();
        return !o2.p() && o2.o(h(), this.a).i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final boolean d() {
        be o2 = o();
        return !o2.p() && o2.o(h(), this.a).c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.az
    public final boolean e() {
        be o2 = o();
        return !o2.p() && o2.o(h(), this.a).h;
    }
}
