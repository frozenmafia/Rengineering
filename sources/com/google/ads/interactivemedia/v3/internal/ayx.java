package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
/* loaded from: classes4.dex */
final class ayx extends aym implements RunnableFuture {

    /* renamed from: b  reason: collision with root package name */
    private volatile ayp f771b;

    ayx(Callable callable) {
        super((char[]) null);
        this.f771b = new ayw(this, callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ayx p(Callable callable) {
        return new ayx(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ayx q(Runnable runnable, Object obj) {
        return new ayx(Executors.callable(runnable, obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.axm
    public final String e() {
        ayp aypVar = this.f771b;
        if (aypVar != null) {
            return "task=[" + aypVar + "]";
        }
        return super.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axm
    protected final void h() {
        ayp aypVar;
        if (k() && (aypVar = this.f771b) != null) {
            aypVar.h();
        }
        this.f771b = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        ayp aypVar = this.f771b;
        if (aypVar != null) {
            aypVar.run();
        }
        this.f771b = null;
    }
}
