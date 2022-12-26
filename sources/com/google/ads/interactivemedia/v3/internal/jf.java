package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final /* synthetic */ class jf implements Runnable {
    public final /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1115b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jf(jh jhVar, s sVar, ep epVar, int i) {
        this.d = i;
        this.a = jhVar;
        this.f1115b = sVar;
        this.c = epVar;
    }

    public /* synthetic */ jf(nj njVar, nk nkVar, Exception exc, int i) {
        this.d = i;
        this.f1115b = njVar;
        this.c = nkVar;
        this.a = exc;
    }

    public /* synthetic */ jf(tf tfVar, tg tgVar, sx sxVar, int i) {
        this.d = i;
        this.c = tfVar;
        this.a = tgVar;
        this.f1115b = sxVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.ads.interactivemedia.v3.internal.nk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, com.google.ads.interactivemedia.v3.internal.tg] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            Object obj = this.a;
            jh jhVar = (jh) obj;
            jhVar.n((s) this.f1115b, (ep) this.c);
        } else if (i == 1) {
            Object obj2 = this.f1115b;
            nj njVar = (nj) obj2;
            this.c.an(njVar.a, njVar.f1185b, (Exception) this.a);
        } else {
            Object obj3 = this.c;
            tf tfVar = (tf) obj3;
            this.a.ae(tfVar.a, tfVar.f1280b, (sx) this.f1115b);
        }
    }
}
