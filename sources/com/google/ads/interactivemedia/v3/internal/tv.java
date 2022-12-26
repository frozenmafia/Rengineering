package com.google.ads.interactivemedia.v3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
/* loaded from: classes4.dex */
final class tv implements wg {
    public long a;

    /* renamed from: b  reason: collision with root package name */
    public long f1289b;
    public tv c;
    public bdj d;

    public tv(long j) {
        d(j);
    }

    public final int a(long j) {
        long j2 = this.a;
        int i = this.d.f805b;
        return (int) (j - j2);
    }

    public final tv b() {
        this.d = null;
        tv tvVar = this.c;
        this.c = null;
        return tvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wg
    public final wg c() {
        tv tvVar = this.c;
        if (tvVar == null || tvVar.d == null) {
            return null;
        }
        return tvVar;
    }

    public final void d(long j) {
        af.w(this.d == null);
        this.a = j;
        this.f1289b = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wg
    public final bdj e() {
        bdj bdjVar = this.d;
        af.s(bdjVar);
        return bdjVar;
    }
}
