package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes4.dex */
public abstract class ayc extends aui implements Future, ayq {
    protected ayc() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ayc(byte[] bArr) {
        this();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aui
    protected /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    protected abstract ayq b();

    /* JADX INFO: Access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Future c() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return c().cancel(z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayq
    public final void g(Runnable runnable, Executor executor) {
        b().g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return c().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return c().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return c().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return c().get(j, timeUnit);
    }
}
