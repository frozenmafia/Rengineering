package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class qu extends MediaCodec.Callback {

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f1237b;
    private Handler c;
    private MediaFormat h;
    private MediaFormat i;
    private MediaCodec.CodecException j;
    private long k;
    private boolean l;
    private IllegalStateException m;
    private final Object a = new Object();
    private final qy d = new qy();
    private final qy e = new qy();
    private final ArrayDeque f = new ArrayDeque();
    private final ArrayDeque g = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: package-private */
    public qu(HandlerThread handlerThread) {
        this.f1237b = handlerThread;
    }

    public static /* synthetic */ void d(qu quVar) {
        synchronized (quVar.a) {
            if (quVar.l) {
                return;
            }
            long j = quVar.k - 1;
            quVar.k = j;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                return;
            }
            if (i < 0) {
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (quVar.a) {
                    quVar.m = illegalStateException;
                }
                return;
            }
            quVar.i();
        }
    }

    private final void h(MediaFormat mediaFormat) {
        this.e.b(-2);
        this.g.add(mediaFormat);
    }

    private final void i() {
        if (!this.g.isEmpty()) {
            this.i = (MediaFormat) this.g.getLast();
        }
        this.d.c();
        this.e.c();
        this.f.clear();
        this.g.clear();
        this.j = null;
    }

    private final void j() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException != null) {
            this.m = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.j;
        if (codecException == null) {
            return;
        }
        this.j = null;
        throw codecException;
    }

    private final boolean k() {
        return this.k > 0 || this.l;
    }

    public final int a() {
        synchronized (this.a) {
            int i = -1;
            if (k()) {
                return -1;
            }
            j();
            if (!this.d.d()) {
                i = this.d.a();
            }
            return i;
        }
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            if (k()) {
                return -1;
            }
            j();
            if (this.e.d()) {
                return -1;
            }
            int a = this.e.a();
            if (a >= 0) {
                af.t(this.h);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (a == -2) {
                this.h = (MediaFormat) this.g.remove();
                a = -2;
            }
            return a;
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.a) {
            mediaFormat = this.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.a) {
            this.k++;
            Handler handler = this.c;
            int i = cp.a;
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.qt
                @Override // java.lang.Runnable
                public final void run() {
                    qu.d(qu.this);
                }
            });
        }
    }

    public final void f(MediaCodec mediaCodec) {
        af.w(this.c == null);
        this.f1237b.start();
        Handler handler = new Handler(this.f1237b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    public final void g() {
        synchronized (this.a) {
            this.l = true;
            this.f1237b.quit();
            i();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.d.b(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            MediaFormat mediaFormat = this.i;
            if (mediaFormat != null) {
                h(mediaFormat);
                this.i = null;
            }
            this.e.b(i);
            this.f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            h(mediaFormat);
            this.i = null;
        }
    }
}
