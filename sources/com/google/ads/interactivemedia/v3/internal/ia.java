package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final /* synthetic */ class ia implements bw {
    public final /* synthetic */ hu a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1089b;
    public final /* synthetic */ boolean c;
    private final /* synthetic */ int d;

    public /* synthetic */ ia(hu huVar, int i, boolean z, int i2) {
        this.d = i2;
        this.a = huVar;
        this.f1089b = i;
        this.c = z;
    }

    public /* synthetic */ ia(hu huVar, boolean z, int i, int i2) {
        this.d = i2;
        this.a = huVar;
        this.c = z;
        this.f1089b = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bw
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            hv hvVar = (hv) obj;
        } else if (i != 1) {
            hv hvVar2 = (hv) obj;
        } else {
            ((hv) obj).e(this.f1089b);
        }
    }
}
