package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class cl implements bu {
    private static final List a = new ArrayList(50);

    /* renamed from: b  reason: collision with root package name */
    private final Handler f999b;

    public cl(Handler handler) {
        this.f999b = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void k(ck ckVar) {
        List list = a;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(ckVar);
            }
        }
    }

    private static ck l() {
        ck ckVar;
        List list = a;
        synchronized (list) {
            ckVar = list.isEmpty() ? new ck(null) : (ck) list.remove(list.size() - 1);
        }
        return ckVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bu
    public final bt a(int i) {
        ck l = l();
        l.c(this.f999b.obtainMessage(i));
        return l;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bu
    public final bt b(int i, Object obj) {
        ck l = l();
        l.c(this.f999b.obtainMessage(i, obj));
        return l;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bu
    public final boolean c() {
        return this.f999b.hasMessages(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bu
    public final bt d(int i, int i2) {
        ck l = l();
        l.c(this.f999b.obtainMessage(1, i, i2));
        return l;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bu
    public final void e(Runnable runnable) {
        this.f999b.post(runnable);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bu
    public final void f() {
        this.f999b.removeCallbacksAndMessages(null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bu
    public final void g() {
        this.f999b.removeMessages(2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bu
    public final void h(int i) {
        this.f999b.sendEmptyMessage(i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bu
    public final void i(long j) {
        this.f999b.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bu
    public final void j(bt btVar) {
        ((ck) btVar).b(this.f999b);
    }
}
