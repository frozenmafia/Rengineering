package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class yn implements zw {
    private final yq a;

    /* renamed from: b  reason: collision with root package name */
    private final long f1365b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public yn(yq yqVar, long j, long j2, long j3, long j4, long j5) {
        this.a = yqVar;
        this.f1365b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final long e() {
        return this.f1365b;
    }

    public final long f(long j) {
        return this.a.a(j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final zu g(long j) {
        zx zxVar = new zx(j, yp.f(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
        return new zu(zxVar, zxVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final boolean h() {
        return true;
    }
}
