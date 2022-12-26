package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
public final class zv implements zw, abu {
    private final long a;

    /* renamed from: b  reason: collision with root package name */
    private final zu f1388b;

    public zv(long j) {
        this(j, 0L);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abu
    public final long a() {
        return -1L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abu
    public final long b(long j) {
        return 0L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final long e() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final zu g(long j) {
        return this.f1388b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final boolean h() {
        return false;
    }

    public zv(long j, long j2) {
        this.a = j;
        zx zxVar = j2 == 0 ? zx.a : new zx(0L, j2);
        this.f1388b = new zu(zxVar, zxVar);
    }

    public zv() {
        this(C.TIME_UNSET);
    }
}
