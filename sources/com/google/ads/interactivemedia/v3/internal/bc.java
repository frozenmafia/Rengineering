package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
public final class bc {
    public Object a;

    /* renamed from: b  reason: collision with root package name */
    public Object f793b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    private b g = b.a;

    public final int a(int i) {
        return this.g.a(i).f417b;
    }

    public final int b(long j) {
        return -1;
    }

    public final int c(long j) {
        return -1;
    }

    public final int d(int i) {
        return this.g.a(i).a();
    }

    public final int e(int i, int i2) {
        return this.g.a(i).b(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        bc bcVar = (bc) obj;
        return cp.V(this.a, bcVar.a) && cp.V(this.f793b, bcVar.f793b) && this.c == bcVar.c && this.d == bcVar.d && this.e == bcVar.e && this.f == bcVar.f && cp.V(this.g, bcVar.g);
    }

    public final long f(int i, int i2) {
        a a = this.g.a(i);
        return a.f417b != -1 ? a.e[i2] : C.TIME_UNSET;
    }

    public final long g() {
        return cp.x(this.e);
    }

    public final void h() {
        int i = this.g.f782b;
    }

    public final void i(int i) {
        long j = this.g.a(i).a;
    }

    public final void j() {
        long j = this.g.c;
    }

    public final void k(int i) {
        long j = this.g.a(i).f;
    }

    public final void l(int i) {
        boolean z = this.g.a(i).g;
    }

    public final bc m(Object obj, Object obj2, long j, long j2) {
        n(obj, obj2, j, j2, b.a, false);
        return this;
    }

    public final void n(Object obj, Object obj2, long j, long j2, b bVar, boolean z) {
        this.a = obj;
        this.f793b = obj2;
        this.c = 0;
        this.d = j;
        this.e = j2;
        this.g = bVar;
        this.f = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f793b;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i = this.c;
        long j = this.d;
        long j2 = this.e;
        return ((((((((((((hashCode + 217) * 31) + hashCode2) * 31) + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f ? 1 : 0)) * 31) + this.g.hashCode();
    }
}
