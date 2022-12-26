package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class aeq implements Runnable {
    final /* synthetic */ aer a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f519b;

    public final void a() {
        if (this.f519b) {
            return;
        }
        this.f519b = true;
        this.a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f519b = false;
    }
}
