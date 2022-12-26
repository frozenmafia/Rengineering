package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
final class xj {
    private boolean c;
    private int e;
    private xi a = new xi();

    /* renamed from: b  reason: collision with root package name */
    private xi f1343b = new xi();
    private long d = C.TIME_UNSET;

    public final float a() {
        if (g()) {
            return (float) (1.0E9d / this.a.a());
        }
        return -1.0f;
    }

    public final int b() {
        return this.e;
    }

    public final long c() {
        return g() ? this.a.a() : C.TIME_UNSET;
    }

    public final long d() {
        return g() ? this.a.b() : C.TIME_UNSET;
    }

    public final void e(long j) {
        this.a.c(j);
        if (this.a.f()) {
            this.c = false;
        } else if (this.d != C.TIME_UNSET) {
            if (!this.c || this.f1343b.e()) {
                this.f1343b.d();
                this.f1343b.c(this.d);
            }
            this.c = true;
            this.f1343b.c(j);
        }
        if (this.c && this.f1343b.f()) {
            xi xiVar = this.a;
            this.a = this.f1343b;
            this.f1343b = xiVar;
            this.c = false;
        }
        this.d = j;
        this.e = this.a.f() ? 0 : this.e + 1;
    }

    public final void f() {
        this.a.d();
        this.f1343b.d();
        this.c = false;
        this.d = C.TIME_UNSET;
        this.e = 0;
    }

    public final boolean g() {
        return this.a.f();
    }
}
