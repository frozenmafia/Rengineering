package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final /* synthetic */ class hy implements bw {
    public final /* synthetic */ hu a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1086b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    private final /* synthetic */ int e;

    public /* synthetic */ hy(hu huVar, int i, long j, long j2, int i2) {
        this.e = i2;
        this.a = huVar;
        this.f1086b = i;
        this.c = j;
        this.d = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bw
    public final void a(Object obj) {
        if (this.e != 0) {
            hv hvVar = (hv) obj;
            return;
        }
        ((hv) obj).c(this.a, this.f1086b, this.c);
    }
}
