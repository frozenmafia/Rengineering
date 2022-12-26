package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final /* synthetic */ class fs implements bw {
    public final /* synthetic */ int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1048b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ fs(int i, ay ayVar, ay ayVar2, int i2) {
        this.d = i2;
        this.a = i;
        this.f1048b = ayVar;
        this.c = ayVar2;
    }

    public /* synthetic */ fs(hu huVar, ai aiVar, int i, int i2) {
        this.d = i2;
        this.c = huVar;
        this.f1048b = aiVar;
        this.a = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bw
    public final void a(Object obj) {
        if (this.d != 0) {
            hv hvVar = (hv) obj;
            return;
        }
        int i = this.a;
        Object obj2 = this.f1048b;
        Object obj3 = this.c;
        int i2 = gb.d;
        ((ax) obj).o((ay) obj2, (ay) obj3, i);
    }
}
