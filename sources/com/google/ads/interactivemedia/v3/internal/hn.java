package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
/* loaded from: classes4.dex */
public final class hn implements go {
    private final bm a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1082b;
    private long c;
    private long d;
    private au e = au.a;

    public hn(bm bmVar) {
        this.a = bmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.go
    public final long a() {
        long a;
        long j = this.c;
        if (this.f1082b) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
            au auVar = this.e;
            if (auVar.f720b == 1.0f) {
                a = cp.t(elapsedRealtime);
            } else {
                a = auVar.a(elapsedRealtime);
            }
            return j + a;
        }
        return j;
    }

    public final void b(long j) {
        this.c = j;
        if (this.f1082b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.go
    public final au c() {
        return this.e;
    }

    public final void d() {
        if (this.f1082b) {
            return;
        }
        this.d = SystemClock.elapsedRealtime();
        this.f1082b = true;
    }

    public final void e() {
        if (this.f1082b) {
            b(a());
            this.f1082b = false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.go
    public final void g(au auVar) {
        if (this.f1082b) {
            b(a());
        }
        this.e = auVar;
    }
}
