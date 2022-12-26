package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public class axp extends AbstractExecutorService implements ayr {
    private final ExecutorService a;

    public axp() {
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: a */
    public final ayq submit(Callable callable) {
        return (ayq) super.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return ayx.q(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return (ayq) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + this.a + "]";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public axp(ExecutorService executorService) {
        this();
        atc.k(executorService);
        this.a = executorService;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return ayx.p(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (ayq) super.submit(runnable, obj);
    }
}
