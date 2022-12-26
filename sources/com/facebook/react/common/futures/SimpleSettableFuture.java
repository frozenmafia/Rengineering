package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes4.dex */
public class SimpleSettableFuture<T> implements Future<T> {
    private Exception ag$a;
    private T ah$a;
    private final CountDownLatch values = new CountDownLatch(1);

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    public void ag$a(T t) {
        ag$a();
        this.ah$a = t;
        this.values.countDown();
    }

    public void valueOf(Exception exc) {
        ag$a();
        this.ag$a = exc;
        this.values.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.values.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        this.values.await();
        if (this.ag$a != null) {
            throw new ExecutionException(this.ag$a);
        }
        return this.ah$a;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (!this.values.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for result");
        }
        if (this.ag$a != null) {
            throw new ExecutionException(this.ag$a);
        }
        return this.ah$a;
    }

    public T values() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    private void ag$a() {
        if (this.values.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }
}
