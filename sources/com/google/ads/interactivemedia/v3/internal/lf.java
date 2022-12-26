package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
public final class lf implements le {
    private final yu a;

    /* renamed from: b  reason: collision with root package name */
    private final long f1149b;

    public lf(yu yuVar, long j) {
        this.a = yuVar;
        this.f1149b = j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long a(long j, long j2) {
        return this.a.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long b(long j, long j2) {
        return this.a.d[(int) j];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long c(long j, long j2) {
        return 0L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long d() {
        return 0L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long e(long j, long j2) {
        return C.TIME_UNSET;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long f(long j) {
        return this.a.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long g(long j, long j2) {
        return this.a.a(j + this.f1149b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final long h(long j) {
        return this.a.e[(int) j] - this.f1149b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final lx i(long j) {
        yu yuVar = this.a;
        int i = (int) j;
        return new lx(null, yuVar.c[i], yuVar.f1369b[i]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.le
    public final boolean j() {
        return true;
    }
}
