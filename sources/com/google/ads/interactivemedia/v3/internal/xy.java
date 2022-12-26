package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final /* synthetic */ class xy implements Runnable {
    public final /* synthetic */ yc a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f1353b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ xy(yc ycVar, int i, long j, int i2) {
        this.d = i2;
        this.a = ycVar;
        this.c = i;
        this.f1353b = j;
    }

    public /* synthetic */ xy(yc ycVar, long j, int i, int i2) {
        this.d = i2;
        this.a = ycVar;
        this.f1353b = j;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            this.a.j(this.c, this.f1353b);
        } else {
            this.a.n(this.f1353b, this.c);
        }
    }
}
