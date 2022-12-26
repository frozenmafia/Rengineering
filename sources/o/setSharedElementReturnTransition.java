package o;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes4.dex */
public class setSharedElementReturnTransition<V> implements RunnableFuture<V>, ScheduledFuture<V> {
    private final Handler toString;
    private final FutureTask<V> values;

    public setSharedElementReturnTransition(Handler handler, Callable<V> callable) {
        this.toString = handler;
        this.values = new FutureTask<>(callable);
    }

    public setSharedElementReturnTransition(Handler handler, Runnable runnable, V v) {
        this.toString = handler;
        this.values = new FutureTask<>(runnable, v);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Comparable
    /* renamed from: ag$a */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.values.run();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.values.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.values.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.values.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return this.values.get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.values.get(j, timeUnit);
    }
}
