package o;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes4.dex */
class getInitialTextAfterCursor implements ExecutorService {
    private final int ah$a;
    ExecutorService values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getInitialTextAfterCursor() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.ah$a = availableProcessors;
        int i = availableProcessors * 2;
        this.values = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.values.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.values.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.values.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.values.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.values.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.values.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.values.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.values.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.values.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.values.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.values.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.values.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.values.submit(runnable);
    }
}
