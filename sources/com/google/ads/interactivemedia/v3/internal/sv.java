package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
public final class sv extends be {

    /* renamed from: b  reason: collision with root package name */
    private final ai f1275b;

    public sv(ai aiVar) {
        this.f1275b = aiVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int a(Object obj) {
        return obj == su.c ? 0 : -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int b() {
        return 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int c() {
        return 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final bc d(int i, bc bcVar, boolean z) {
        bcVar.n(z ? 0 : null, z ? su.c : null, C.TIME_UNSET, 0L, b.a, true);
        return bcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final bd e(int i, bd bdVar, long j) {
        bdVar.d(bd.a, this.f1275b, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0L);
        bdVar.l = true;
        return bdVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final Object f(int i) {
        return su.c;
    }
}
