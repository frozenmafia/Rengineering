package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
/* loaded from: classes4.dex */
public final class bd {
    public static final Object a = new Object();
    private static final ai r;

    /* renamed from: b  reason: collision with root package name */
    public Object f798b = a;
    public ai c = r;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    @Deprecated
    public boolean j;
    public ac k;
    public boolean l;
    public long m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public int f799o;
    public int p;
    public long q;

    static {
        v vVar = new v();
        vVar.b("bundled.androidx.media3.common.Timeline");
        vVar.c(Uri.EMPTY);
        r = vVar.a();
    }

    public final long a() {
        return cp.x(this.m);
    }

    public final long b() {
        return cp.x(this.n);
    }

    public final boolean c() {
        af.w(this.j == (this.k != null));
        return this.k != null;
    }

    public final void d(Object obj, ai aiVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, ac acVar, long j4, long j5, int i, long j6) {
        this.f798b = obj;
        this.c = aiVar != null ? aiVar : r;
        this.d = obj2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z;
        this.i = z2;
        this.j = acVar != null;
        this.k = acVar;
        this.m = j4;
        this.n = j5;
        this.f799o = 0;
        this.p = i;
        this.q = j6;
        this.l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        bd bdVar = (bd) obj;
        return cp.V(this.f798b, bdVar.f798b) && cp.V(this.c, bdVar.c) && cp.V(this.d, bdVar.d) && cp.V(this.k, bdVar.k) && this.e == bdVar.e && this.f == bdVar.f && this.g == bdVar.g && this.h == bdVar.h && this.i == bdVar.i && this.l == bdVar.l && this.m == bdVar.m && this.n == bdVar.n && this.f799o == bdVar.f799o && this.p == bdVar.p && this.q == bdVar.q;
    }

    public final int hashCode() {
        int hashCode = this.f798b.hashCode();
        int hashCode2 = this.c.hashCode();
        Object obj = this.d;
        int hashCode3 = obj == null ? 0 : obj.hashCode();
        ac acVar = this.k;
        int hashCode4 = acVar != null ? acVar.hashCode() : 0;
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        boolean z = this.h;
        boolean z2 = this.i;
        boolean z3 = this.l;
        long j4 = this.m;
        long j5 = this.n;
        int i = this.f799o;
        int i2 = this.p;
        long j6 = this.q;
        return ((((((((((((((((((((((((((((hashCode + 217) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + i) * 31) + i2) * 31) + ((int) ((j6 >>> 32) ^ j6));
    }
}
