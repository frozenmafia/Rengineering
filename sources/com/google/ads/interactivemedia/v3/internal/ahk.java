package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
/* loaded from: classes4.dex */
final class ahk implements Runnable {
    private final /* synthetic */ int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ahk(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        if (this.a == 0) {
            handler = ahn.c;
            if (handler != null) {
                handler2 = ahn.c;
                runnable = ahn.d;
                handler2.post(runnable);
                handler3 = ahn.c;
                runnable2 = ahn.e;
                handler3.postDelayed(runnable2, 200L);
                return;
            }
            return;
        }
        ahn.f(ahn.c());
    }
}
