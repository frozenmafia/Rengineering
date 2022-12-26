package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class by {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    private p f992b = new p();
    private boolean c;
    private boolean d;

    public by(Object obj) {
        this.a = obj;
    }

    public final void a(int i, bw bwVar) {
        if (this.d) {
            return;
        }
        if (i != -1) {
            this.f992b.b(i);
        }
        this.c = true;
        bwVar.a(this.a);
    }

    public final void b(bx bxVar) {
        if (this.d || !this.c) {
            return;
        }
        q a = this.f992b.a();
        this.f992b = new p();
        this.c = false;
        bxVar.a(this.a, a);
    }

    public final void c(bx bxVar) {
        this.d = true;
        if (this.c) {
            bxVar.a(this.a, this.f992b.a());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((by) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
