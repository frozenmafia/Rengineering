package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ka {
    private Exception a;

    /* renamed from: b  reason: collision with root package name */
    private long f1128b;

    public final void a() {
        this.a = null;
    }

    public final void b(Exception exc) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
            this.f1128b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f1128b) {
            Exception exc2 = this.a;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.a;
            a();
            throw exc3;
        }
    }
}
