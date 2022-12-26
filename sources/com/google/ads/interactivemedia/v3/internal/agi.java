package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
/* loaded from: classes4.dex */
public final class agi {
    private boolean a;

    public agi() {
    }

    public agi(byte[] bArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context) {
        com.google.ads.interactivemedia.v3.impl.data.i.e(context, "Application Context cannot be null");
        if (this.a) {
            return;
        }
        this.a = true;
        agy.b().c(context);
        agu.a().c(context);
        ahh.f(context);
        agv.b().c(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.a;
    }

    public final void c() throws InterruptedException {
        synchronized (this) {
            while (!this.a) {
                wait();
            }
        }
    }

    public final void d() {
        synchronized (this) {
            boolean z = false;
            while (!this.a) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }

    public final boolean f() {
        synchronized (this) {
            if (this.a) {
                return false;
            }
            this.a = true;
            notifyAll();
            return true;
        }
    }

    public final void g() {
        synchronized (this) {
            this.a = false;
        }
    }
}
