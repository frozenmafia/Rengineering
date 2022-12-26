package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public class dy {
    private int a;

    public final void a(int i) {
        this.a = i | this.a;
    }

    public void b() {
        this.a = 0;
    }

    public final void c(int i) {
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d(int i) {
        return (this.a & i) == i;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean g() {
        return d(4);
    }

    public final boolean h() {
        return d(1);
    }
}
