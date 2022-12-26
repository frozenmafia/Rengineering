package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ayf implements Runnable {
    final Future a;

    /* renamed from: b  reason: collision with root package name */
    final aye f766b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ayf(Future future, aye ayeVar) {
        this.a = future;
        this.f766b = ayeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable a;
        Future future = this.a;
        if (!(future instanceof ayz) || (a = aza.a((ayz) future)) == null) {
            try {
                this.f766b.b(ayu.c(this.a));
                return;
            } catch (Error e) {
                e = e;
                this.f766b.a(e);
                return;
            } catch (RuntimeException e2) {
                e = e2;
                this.f766b.a(e);
                return;
            } catch (ExecutionException e3) {
                this.f766b.a(e3.getCause());
                return;
            }
        }
        this.f766b.a(a);
    }

    public final String toString() {
        return atc.n(this).a(this.f766b).toString();
    }
}
