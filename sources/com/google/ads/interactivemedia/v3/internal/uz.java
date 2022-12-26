package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public abstract class uz extends up {

    /* renamed from: o  reason: collision with root package name */
    public final long f1309o;

    public uz(cx cxVar, db dbVar, s sVar, int i, long j, long j2, long j3) {
        super(cxVar, dbVar, 1, sVar, i, j, j2);
        af.s(sVar);
        this.f1309o = j3;
    }

    public abstract boolean g();

    public long s() {
        long j = this.f1309o;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }
}
