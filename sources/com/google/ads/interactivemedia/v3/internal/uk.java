package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public abstract class uk extends uz {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1300b;
    private int[] c;
    private zj d;

    public uk(cx cxVar, db dbVar, s sVar, int i, long j, long j2, long j3, long j4, long j5) {
        super(cxVar, dbVar, sVar, i, j, j2, j5);
        this.a = j3;
        this.f1300b = j4;
    }

    public final int a(int i) {
        return ((int[]) af.t(this.c))[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zj c() {
        zj zjVar = this.d;
        af.t(zjVar);
        return zjVar;
    }

    public final void d(zj zjVar) {
        this.d = zjVar;
        this.c = zjVar.b();
    }
}
