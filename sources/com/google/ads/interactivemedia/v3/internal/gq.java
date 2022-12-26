package com.google.ads.interactivemedia.v3.internal;

import androidx.databinding.library.baseAdapters.BR;
/* loaded from: classes4.dex */
final class gq {
    public final ta a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1068b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gq(ta taVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        af.u(!z4 || z2);
        af.u(!z3 || z2);
        af.u(true);
        this.a = taVar;
        this.f1068b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = false;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final gq a(long j) {
        return j == this.c ? this : new gq(this.a, this.f1068b, j, this.d, this.e, false, this.g, this.h, this.i);
    }

    public final gq b(long j) {
        return j == this.f1068b ? this : new gq(this.a, j, this.c, this.d, this.e, false, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gq gqVar = (gq) obj;
        return this.f1068b == gqVar.f1068b && this.c == gqVar.c && this.d == gqVar.d && this.e == gqVar.e && this.g == gqVar.g && this.h == gqVar.h && this.i == gqVar.i && cp.V(this.a, gqVar.a);
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + BR.userTeamVM) * 31) + ((int) this.f1068b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 961) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
