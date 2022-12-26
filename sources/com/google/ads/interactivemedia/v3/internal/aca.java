package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class aca {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public int f455b;
    public int c;
    public long d;
    private final boolean e;
    private final ci f;
    private final ci g;
    private int h;
    private int i;

    public aca(ci ciVar, ci ciVar2, boolean z) throws as {
        this.g = ciVar;
        this.f = ciVar2;
        this.e = z;
        ciVar2.F(12);
        this.a = ciVar2.l();
        ciVar.F(12);
        this.i = ciVar.l();
        fy.k(ciVar.e() == 1, "first_chunk must be 1");
        this.f455b = -1;
    }

    public final boolean a() {
        int i = this.f455b + 1;
        this.f455b = i;
        if (i == this.a) {
            return false;
        }
        this.d = this.e ? this.f.q() : this.f.p();
        if (this.f455b == this.h) {
            this.c = this.g.l();
            this.g.G(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? (-1) + this.g.l() : -1;
        }
        return true;
    }
}
