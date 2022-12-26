package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final /* synthetic */ class xz implements Runnable {
    public final /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1354b;
    private final /* synthetic */ int c;

    public /* synthetic */ xz(yc ycVar, bl blVar, int i) {
        this.c = i;
        this.a = ycVar;
        this.f1354b = blVar;
    }

    public /* synthetic */ xz(yc ycVar, eo eoVar, int i) {
        this.c = i;
        this.a = ycVar;
        this.f1354b = eoVar;
    }

    public /* synthetic */ xz(yc ycVar, Exception exc, int i) {
        this.c = i;
        this.f1354b = ycVar;
        this.a = exc;
    }

    public /* synthetic */ xz(yc ycVar, String str, int i) {
        this.c = i;
        this.f1354b = ycVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            ((yc) this.a).k((eo) this.f1354b);
        } else if (i == 1) {
            ((yc) this.f1354b).o((Exception) this.a);
        } else if (i == 2) {
            ((yc) this.a).i((eo) this.f1354b);
        } else if (i == 3) {
            ((yc) this.a).p((bl) this.f1354b);
        } else {
            ((yc) this.f1354b).h((String) this.a);
        }
    }
}
