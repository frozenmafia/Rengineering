package com.sendbird.android;

import com.sendbird.android.log.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes5.dex */
public class CancelableExecutorService implements ExecutorService {
    private final ExecutorService executorService;
    private final List<Future<?>> futures = new ArrayList();

    CancelableExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    private <T> Future<T> addFuture(Future<T> future) {
        synchronized (this.futures) {
            this.futures.add(future);
        }
        return future;
    }

    private <T> List<Future<T>> addFutures(List<Future<T>> list) {
        synchronized (this.futures) {
            this.futures.addAll(list);
        }
        return list;
    }

    public void cancelAll() {
        cancelAll(false);
    }

    public void cancelAll(boolean z) {
        Logger.d("CancelableExecutorService::cancelAll(%s), jobSize=%s", Boolean.valueOf(z), Integer.valueOf(this.futures.size()));
        synchronized (this.futures) {
            for (Future<?> future : this.futures) {
                future.cancel(z);
            }
            this.futures.clear();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.executorService.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.executorService.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.executorService.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.executorService.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.executorService.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return addFuture(this.executorService.submit(callable));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return addFuture(this.executorService.submit(runnable, t));
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return addFuture(this.executorService.submit(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return addFutures(this.executorService.invokeAll(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return addFutures(this.executorService.invokeAll(collection, j, timeUnit));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.executorService.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.executorService.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        throw new UnsupportedOperationException("execute operation not supported");
    }

    public static CancelableExecutorService newSingleThreadExecutor() {
        return new CancelableExecutorService(Executors.newSingleThreadExecutor());
    }

    public static CancelableExecutorService newCachedThreadExecutor() {
        return new CancelableExecutorService(Executors.newCachedThreadPool());
    }

    public static CancelableExecutorService newFixedThreadExecutor(int i) {
        return new CancelableExecutorService(Executors.newFixedThreadPool(i));
    }
}
