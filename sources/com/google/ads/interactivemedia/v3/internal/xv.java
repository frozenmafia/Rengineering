package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
final class xv implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: b  reason: collision with root package name */
    private static final xv f1349b = new xv();
    public volatile long a = C.TIME_UNSET;
    private final Handler c;
    private final HandlerThread d;
    private Choreographer e;
    private int f;

    private xv() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.d = handlerThread;
        handlerThread.start();
        Handler z = cp.z(handlerThread.getLooper(), this);
        this.c = z;
        z.sendEmptyMessage(0);
    }

    public static xv a() {
        return f1349b;
    }

    public final void b() {
        this.c.sendEmptyMessage(1);
    }

    public final void c() {
        this.c.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a = j;
        Choreographer choreographer = this.e;
        af.s(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.e = Choreographer.getInstance();
            } catch (RuntimeException e) {
                cc.f("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        } else if (i == 1) {
            Choreographer choreographer = this.e;
            if (choreographer != null) {
                int i2 = this.f + 1;
                this.f = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            Choreographer choreographer2 = this.e;
            if (choreographer2 != null) {
                int i3 = this.f - 1;
                this.f = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.a = C.TIME_UNSET;
                }
            }
            return true;
        }
    }
}
