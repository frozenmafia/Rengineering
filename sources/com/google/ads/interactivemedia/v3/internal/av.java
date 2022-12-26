package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class av {
    private final p a = new p();

    public final aw a() {
        return new aw(this.a.a());
    }

    public final void b(int i) {
        this.a.b(i);
    }

    public final void c(aw awVar) {
        q qVar;
        p pVar = this.a;
        qVar = awVar.a;
        for (int i = 0; i < qVar.b(); i++) {
            pVar.b(qVar.a(i));
        }
    }

    public final void d(int... iArr) {
        p pVar = this.a;
        for (int i = 0; i < 21; i++) {
            pVar.b(iArr[i]);
        }
    }

    public final void e(int i, boolean z) {
        p pVar = this.a;
        if (z) {
            pVar.b(i);
        }
    }
}
