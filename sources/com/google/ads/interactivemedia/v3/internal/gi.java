package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class gi {
    public ha a;

    /* renamed from: b  reason: collision with root package name */
    public int f1060b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    private boolean g;

    public gi(ha haVar) {
        this.a = haVar;
    }

    public final void a(int i) {
        this.g = 1 == ((this.g ? 1 : 0) | i);
        this.f1060b += i;
    }

    public final void b(int i) {
        this.g = true;
        this.e = true;
        this.f = i;
    }

    public final void c(ha haVar) {
        this.g |= this.a != haVar;
        this.a = haVar;
    }

    public final void d(int i) {
        if (this.c && this.d != 5) {
            af.u(i == 5);
            return;
        }
        this.g = true;
        this.c = true;
        this.d = i;
    }
}
