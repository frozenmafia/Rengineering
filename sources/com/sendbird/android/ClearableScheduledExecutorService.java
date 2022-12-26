package com.sendbird.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes5.dex */
class ClearableScheduledExecutorService implements ScheduledExecutorService {
    private final List<Future<?>> futures = new ArrayList();
    private final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    private <T> Future<T> addFuture(Future<T> future) {
        synchronized (this) {
            this.futures.add(future);
        }
        return future;
    }

    private <T> ScheduledFuture<T> addScheduledFuture(ScheduledFuture<T> scheduledFuture) {
        synchronized (this) {
            this.futures.add(scheduledFuture);
        }
        return scheduledFuture;
    }

    private <T> List<Future<T>> addFutures(List<Future<T>> list) {
        synchronized (this) {
            this.futures.addAll(list);
        }
        return list;
    }

    public void cancelAllJobs() {
        synchronized (this) {
            cancelAllJobs(false);
        }
    }

    public void cancelAllJobs(boolean z) {
        synchronized (this) {
            for (Future<?> future : this.futures) {
                future.cancel(z);
            }
            this.futures.clear();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return addScheduledFuture(this.scheduledExecutorService.schedule(runnable, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return addScheduledFuture(this.scheduledExecutorService.schedule(callable, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return addScheduledFuture(this.scheduledExecutorService.scheduleAtFixedRate(runnable, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return addScheduledFuture(this.scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.scheduledExecutorService.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.scheduledExecutorService.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.scheduledExecutorService.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.scheduledExecutorService.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.scheduledExecutorService.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return addFuture(this.scheduledExecutorService.submit(callable));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return addFuture(this.scheduledExecutorService.submit(runnable, t));
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return addFuture(this.scheduledExecutorService.submit(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return addFutures(this.scheduledExecutorService.invokeAll(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return addFutures(this.scheduledExecutorService.invokeAll(collection, j, timeUnit));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.scheduledExecutorService.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.scheduledExecutorService.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        addFuture(this.scheduledExecutorService.schedule(runnable, 0L, TimeUnit.MILLISECONDS));
    }
}
