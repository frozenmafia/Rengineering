package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class et implements go {
    private final hn a;

    /* renamed from: b  reason: collision with root package name */
    private final es f1037b;
    private hg c;
    private go d;
    private boolean e = true;
    private boolean f;

    public et(es esVar, bm bmVar) {
        this.f1037b = esVar;
        this.a = new hn(bmVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.go
    public final long a() {
        throw null;
    }

    public final long b(boolean z) {
        hg hgVar = this.c;
        if (hgVar == null || hgVar.N() || (!this.c.O() && (z || this.c.G()))) {
            this.e = true;
            if (this.f) {
                this.a.d();
            }
        } else {
            go goVar = this.d;
            af.s(goVar);
            long a = goVar.a();
            if (this.e) {
                if (a < this.a.a()) {
                    this.a.e();
                } else {
                    this.e = false;
                    if (this.f) {
                        this.a.d();
                    }
                }
            }
            this.a.b(a);
            au c = goVar.c();
            if (!c.equals(this.a.c())) {
                this.a.g(c);
                this.f1037b.a(c);
            }
        }
        if (this.e) {
            return this.a.a();
        }
        go goVar2 = this.d;
        af.s(goVar2);
        return goVar2.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.go
    public final au c() {
        go goVar = this.d;
        return goVar != null ? goVar.c() : this.a.c();
    }

    public final void d(hg hgVar) {
        if (hgVar == this.c) {
            this.d = null;
            this.c = null;
            this.e = true;
        }
    }

    public final void e(hg hgVar) throws eu {
        go goVar;
        go j = hgVar.j();
        if (j == null || j == (goVar = this.d)) {
            return;
        }
        if (goVar == null) {
            this.d = j;
            this.c = hgVar;
            j.g(this.a.c());
            return;
        }
        throw eu.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
    }

    public final void f(long j) {
        this.a.b(j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.go
    public final void g(au auVar) {
        go goVar = this.d;
        if (goVar != null) {
            goVar.g(auVar);
            auVar = this.d.c();
        }
        this.a.g(auVar);
    }

    public final void h() {
        this.f = true;
        this.a.d();
    }

    public final void i() {
        this.f = false;
        this.a.e();
    }
}
