package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class axy extends ayp {
    private final Executor a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ axz f761b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public axy(axz axzVar, Executor executor) {
        this.f761b = axzVar;
        atc.k(executor);
        this.a = executor;
    }

    abstract void c(Object obj);

    @Override // com.google.ads.interactivemedia.v3.internal.ayp
    final void d(Throwable th) {
        axz.w(this.f761b);
        if (th instanceof ExecutionException) {
            this.f761b.o(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.f761b.cancel(false);
        } else {
            this.f761b.o(th);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayp
    final void e(Object obj) {
        axz.w(this.f761b);
        c(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.f761b.o(e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayp
    final boolean g() {
        return this.f761b.isDone();
    }
}
