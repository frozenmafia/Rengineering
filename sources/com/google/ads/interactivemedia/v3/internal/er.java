package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
/* loaded from: classes4.dex */
public final class er {
    private final wm a;

    /* renamed from: b  reason: collision with root package name */
    private final long f1036b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private int g;
    private boolean h;

    public er() {
        wm wmVar = new wm();
        i(2500, 0, "bufferForPlaybackMs", SessionDescription.SUPPORTED_SDP_VERSION);
        i(5000, 0, "bufferForPlaybackAfterRebufferMs", SessionDescription.SUPPORTED_SDP_VERSION);
        i(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        i(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(50000, 50000, "maxBufferMs", "minBufferMs");
        i(0, 0, "backBufferDurationMs", SessionDescription.SUPPORTED_SDP_VERSION);
        this.a = wmVar;
        this.f1036b = cp.t(50000L);
        this.c = cp.t(50000L);
        this.d = cp.t(2500L);
        this.e = cp.t(5000L);
        this.g = 13107200;
        this.f = cp.t(0L);
    }

    private static void i(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        af.v(z, str + " cannot be less than " + str2);
    }

    private final void j(boolean z) {
        this.g = 13107200;
        this.h = false;
        if (z) {
            this.a.c();
        }
    }

    public final long a() {
        return this.f;
    }

    public final void b() {
        j(false);
    }

    public final void c() {
        j(true);
    }

    public final void d() {
        j(true);
    }

    public final boolean e(long j, float f, boolean z, long j2) {
        long s = cp.s(j, f);
        long j3 = z ? this.e : this.d;
        if (j2 != C.TIME_UNSET) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || s >= j3 || this.a.a() >= this.g;
    }

    public final wm f() {
        return this.a;
    }

    public final void g(hg[] hgVarArr, vz[] vzVarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = hgVarArr.length;
            if (i < 2) {
                if (vzVarArr[i] != null) {
                    i2 += hgVarArr[i].b() != 1 ? DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE : 13107200;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.g = max;
                this.a.d(max);
                return;
            }
        }
    }

    public final boolean h(long j, float f) {
        int a = this.a.a();
        int i = this.g;
        long j2 = this.f1036b;
        if (f > 1.0f) {
            j2 = Math.min(cp.q(j2, f), this.c);
        }
        if (j < Math.max(j2, 500000L)) {
            boolean z = a < i;
            this.h = z;
            if (!z && j < 500000) {
                cc.e("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.c || a >= i) {
            this.h = false;
        }
        return this.h;
    }
}
