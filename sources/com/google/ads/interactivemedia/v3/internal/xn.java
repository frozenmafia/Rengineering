package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class xn extends HandlerThread implements Handler.Callback {
    private bq a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f1346b;
    private Error c;
    private RuntimeException d;
    private xo e;

    public xn() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final xo a(int i) {
        boolean z;
        start();
        this.f1346b = new Handler(getLooper(), this);
        this.a = new bq(this.f1346b);
        synchronized (this) {
            z = false;
            this.f1346b.obtainMessage(1, i, 0).sendToTarget();
            while (this.e == null && this.d == null && this.c == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.d;
        if (runtimeException == null) {
            Error error = this.c;
            if (error == null) {
                xo xoVar = this.e;
                af.s(xoVar);
                return xoVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void b() {
        af.s(this.f1346b);
        this.f1346b.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    af.s(this.a);
                    this.a.c();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                try {
                    int i2 = message.arg1;
                    af.s(this.a);
                    this.a.b(i2);
                    this.e = new xo(this, this.a.a(), i2 != 0);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    cc.c("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.d = e;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (br e2) {
                cc.c("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.d = new IllegalStateException(e2);
                synchronized (this) {
                    notify();
                }
            } catch (Error e3) {
                cc.c("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.c = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
