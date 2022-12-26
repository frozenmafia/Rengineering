package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
/* loaded from: classes4.dex */
final class akr {

    /* renamed from: b  reason: collision with root package name */
    private akq f609b;
    private final Handler a = new Handler();
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(akq akqVar, Handler handler, long j) {
        akqVar.a();
        e(akqVar, handler, 200L);
    }

    private static void e(final akq akqVar, final Handler handler, long j) {
        handler.postDelayed(new Runnable(handler, 200L) { // from class: com.google.ads.interactivemedia.v3.internal.akp

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Handler f608b;
            public final /* synthetic */ long c = 200;

            @Override // java.lang.Runnable
            public final void run() {
                akr.a(akq.this, this.f608b, 200L);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(akq akqVar) {
        this.f609b = akqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.f609b.a();
        e(this.f609b, this.a, 200L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.c) {
            this.c = false;
            this.a.removeCallbacksAndMessages(null);
        }
    }
}
