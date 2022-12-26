package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class arm implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final arw a;

    /* renamed from: b  reason: collision with root package name */
    private final String f688b;
    private final String c;
    private final LinkedBlockingQueue d;
    private final HandlerThread e;
    private final arh f;
    private final long g;
    private final int h;

    public arm(Context context, int i, String str, String str2, arh arhVar) {
        this.f688b = str;
        this.h = i;
        this.c = str2;
        this.f = arhVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.e = handlerThread;
        handlerThread.start();
        this.g = System.currentTimeMillis();
        arw arwVar = new arw(context, handlerThread.getLooper(), this, this, 19621000);
        this.a = arwVar;
        this.d = new LinkedBlockingQueue();
        arwVar.checkAvailabilityAndConnect();
    }

    static asg b() {
        return new asg();
    }

    private final void e(int i, long j) {
        f(i, j, null);
    }

    private final void f(int i, long j, Exception exc) {
        this.f.c(i, System.currentTimeMillis() - j, exc);
    }

    protected final asb a() {
        try {
            return this.a.a();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public final asg c() {
        asg asgVar;
        try {
            asgVar = (asg) this.d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            f(2009, this.g, e);
            asgVar = null;
        }
        e(3004, this.g);
        if (asgVar != null) {
            if (asgVar.c == 7) {
                arh.g(afe.c);
            } else {
                arh.g(afe.f525b);
            }
        }
        return asgVar == null ? b() : asgVar;
    }

    public final void d() {
        arw arwVar = this.a;
        if (arwVar != null) {
            if (arwVar.isConnected() || this.a.isConnecting()) {
                this.a.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        asb a = a();
        if (a != null) {
            try {
                asg f = a.f(new asf(this.h, this.f688b, this.c));
                e(5011, this.g);
                this.d.put(f);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            e(4012, this.g);
            this.d.put(b());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            e(4011, this.g);
            this.d.put(b());
        } catch (InterruptedException unused) {
        }
    }
}
