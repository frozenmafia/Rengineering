package o;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
class setContentMimeTypes implements ExecutorService {
    private long ah$a = 0;
    ExecutorService valueOf = Executors.newSingleThreadExecutor();

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.valueOf.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        Objects.requireNonNull(runnable, "PostAsyncSafelyExecutor#execute: task can't ne null");
        if (Thread.currentThread().getId() == this.ah$a) {
            runnable.run();
        } else {
            this.valueOf.execute(new Runnable() { // from class: o.setContentMimeTypes.3
                @Override // java.lang.Runnable
                public void run() {
                    setContentMimeTypes.this.ah$a = Thread.currentThread().getId();
                    runnable.run();
                }
            });
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAll: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAll: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAny: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAny: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.valueOf.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.valueOf.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.valueOf.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.valueOf.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(final Callable<T> callable) {
        Objects.requireNonNull(callable, "PostAsyncSafelyExecutor#submit: task can't ne null");
        if (Thread.currentThread().getId() == this.ah$a) {
            try {
                callable.call();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        return this.valueOf.submit(new Callable<T>() { // from class: o.setContentMimeTypes.1
            /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public T call() throws Exception {
                setContentMimeTypes.this.ah$a = Thread.currentThread().getId();
                return callable.call();
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        Objects.requireNonNull(runnable, "PostAsyncSafelyExecutor#submit: task can't ne null");
        FutureTask futureTask = new FutureTask(runnable, t);
        execute(futureTask);
        return futureTask;
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        Objects.requireNonNull(runnable, "PostAsyncSafelyExecutor#submit: task can't ne null");
        FutureTask futureTask = new FutureTask(runnable, null);
        execute(futureTask);
        return futureTask;
    }
}
