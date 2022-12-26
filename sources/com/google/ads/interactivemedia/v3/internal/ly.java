package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
import java.util.List;
/* loaded from: classes4.dex */
public final class ly extends ma implements le {
    final mb a;

    public ly(s sVar, List list, mb mbVar, List list2, List list3, List list4) {
        super(sVar, list, mbVar, list2);
        this.a = mbVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long a(long j, long j2) {
        return this.a.a(j, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long b(long j, long j2) {
        return this.a.d(j, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long c(long j, long j2) {
        return this.a.b(j, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long d() {
        return this.a.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long e(long j, long j2) {
        mb mbVar = this.a;
        if (mbVar.c != null) {
            return C.TIME_UNSET;
        }
        long b2 = mbVar.b(j, j2) + mbVar.a(j, j2);
        return (mbVar.f(b2) + mbVar.d(b2, j)) - mbVar.d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long f(long j) {
        return this.a.c(j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long g(long j, long j2) {
        return this.a.e(j, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long h(long j) {
        return this.a.f(j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final lx i(long j) {
        return this.a.g(this, j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final boolean j() {
        return this.a.h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ma
    public final le k() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ma
    public final lx l() {
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ma
    public final void m() {
    }
}
