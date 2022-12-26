package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import java.util.concurrent.TimeoutException;
/* loaded from: classes4.dex */
public final class hd {
    private final hc a;

    /* renamed from: b  reason: collision with root package name */
    private final hb f1077b;
    private final bm c;
    private final be d;
    private int e;
    private Object f;
    private final Looper g;
    private final int h;
    private final long i = C.TIME_UNSET;
    private final boolean j = true;
    private boolean k;
    private boolean l;
    private boolean m;

    public hd(hb hbVar, hc hcVar, be beVar, int i, bm bmVar, Looper looper) {
        this.f1077b = hbVar;
        this.a = hcVar;
        this.d = beVar;
        this.g = looper;
        this.c = bmVar;
        this.h = i;
    }

    public final int a() {
        return this.h;
    }

    public final int b() {
        return this.e;
    }

    public final long c() {
        return C.TIME_UNSET;
    }

    public final Looper d() {
        return this.g;
    }

    public final be e() {
        return this.d;
    }

    public final hc f() {
        return this.a;
    }

    public final Object g() {
        return this.f;
    }

    public final void h(boolean z) {
        synchronized (this) {
            this.l = z | this.l;
            this.m = true;
            notifyAll();
        }
    }

    public final boolean i() {
        return true;
    }

    public final void j(long j) throws InterruptedException, TimeoutException {
        synchronized (this) {
            af.w(this.k);
            af.w(this.g.getThread() != Thread.currentThread());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j;
            while (!this.m) {
                if (j2 > 0) {
                    wait(j2);
                    j2 = (elapsedRealtime + j) - SystemClock.elapsedRealtime();
                } else {
                    throw new TimeoutException("Message delivery timed out.");
                }
            }
        }
    }

    public final void k() {
        synchronized (this) {
        }
    }

    public final void l() {
        af.w(!this.k);
        af.u(true);
        this.k = true;
        this.f1077b.m(this);
    }

    public final void m(Object obj) {
        af.w(!this.k);
        this.f = obj;
    }

    public final void n(int i) {
        af.w(!this.k);
        this.e = i;
    }
}
