package o;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public class setSharedElementEnterTransition extends AbstractExecutorService implements setReturnTransition {
    private final Handler ah$a;

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    public setSharedElementEnterTransition(Handler handler) {
        this.ah$a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.ah$a.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* renamed from: values */
    public <T> setSharedElementReturnTransition<T> newTaskFor(Runnable runnable, T t) {
        return new setSharedElementReturnTransition<>(this.ah$a, runnable, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* renamed from: ah$a */
    public <T> setSharedElementReturnTransition<T> newTaskFor(Callable<T> callable) {
        return new setSharedElementReturnTransition<>(this.ah$a, callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: ah$a */
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, null);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: ah$a */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        runnable.getClass();
        setSharedElementReturnTransition<T> newTaskFor = newTaskFor(runnable, t);
        execute(newTaskFor);
        return newTaskFor;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: toString */
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        callable.getClass();
        setSharedElementReturnTransition<T> newTaskFor = newTaskFor(callable);
        execute(newTaskFor);
        return newTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        setSharedElementReturnTransition newTaskFor = newTaskFor(runnable, null);
        this.ah$a.postDelayed(newTaskFor, timeUnit.toMillis(j));
        return newTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        setSharedElementReturnTransition newTaskFor = newTaskFor(callable);
        this.ah$a.postDelayed(newTaskFor, timeUnit.toMillis(j));
        return newTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public boolean ag$a() {
        return Thread.currentThread() == this.ah$a.getLooper().getThread();
    }
}
