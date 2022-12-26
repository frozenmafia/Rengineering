package com.appsamurai.storyly.exoplayer2.core.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.appsamurai.storyly.exoplayer2.common.util.EGLSurfaceTexture;
import com.appsamurai.storyly.exoplayer2.common.util.GlUtil;
import o.FingerprintManagerCompat;
import o.SupportMenuItem;
/* loaded from: classes3.dex */
public final class PlaceholderSurface extends Surface {
    private static boolean ag$a;
    private static int ah$a;
    private final values toString;
    private boolean valueOf;
    public final boolean values;

    public static boolean ah$a(Context context) {
        boolean z;
        synchronized (PlaceholderSurface.class) {
            if (!ag$a) {
                ah$a = values(context);
                ag$a = true;
            }
            z = ah$a != 0;
        }
        return z;
    }

    public static PlaceholderSurface toString(Context context, boolean z) {
        FingerprintManagerCompat.ah$a(!z || ah$a(context));
        return new values().valueOf(z ? ah$a : 0);
    }

    private PlaceholderSurface(values valuesVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.toString = valuesVar;
        this.values = z;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.toString) {
            if (!this.valueOf) {
                this.toString.values();
                this.valueOf = true;
            }
        }
    }

    private static int values(Context context) {
        if (GlUtil.ah$a(context)) {
            return GlUtil.values() ? 1 : 2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class values extends HandlerThread implements Handler.Callback {
        private RuntimeException ag$a;
        private EGLSurfaceTexture ah$a;
        private Handler toString;
        private PlaceholderSurface valueOf;
        private Error values;

        public values() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public PlaceholderSurface valueOf(int i) {
            boolean z;
            start();
            this.toString = new Handler(getLooper(), this);
            this.ah$a = new EGLSurfaceTexture(this.toString);
            synchronized (this) {
                z = false;
                this.toString.obtainMessage(1, i, 0).sendToTarget();
                while (this.valueOf == null && this.ag$a == null && this.values == null) {
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
            RuntimeException runtimeException = this.ag$a;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.values;
            if (error != null) {
                throw error;
            }
            return (PlaceholderSurface) FingerprintManagerCompat.toString(this.valueOf);
        }

        public void values() {
            FingerprintManagerCompat.toString(this.toString);
            this.toString.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        ag$a();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    toString(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    SupportMenuItem.toString("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.values = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    SupportMenuItem.toString("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.ag$a = e2;
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

        private void toString(int i) {
            FingerprintManagerCompat.toString(this.ah$a);
            this.ah$a.values(i);
            this.valueOf = new PlaceholderSurface(this, this.ah$a.ag$a(), i != 0);
        }

        private void ag$a() {
            FingerprintManagerCompat.toString(this.ah$a);
            this.ah$a.values();
        }
    }
}
