package o;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes7.dex */
public class animateAdd<V> extends FutureTask<V> implements animateAddImpl<V> {
    private final canRestoreState ah$a;

    public static <V> animateAdd<V> ag$a(Callable<V> callable) {
        return new animateAdd<>(callable);
    }

    animateAdd(Callable<V> callable) {
        super(callable);
        this.ah$a = new canRestoreState();
    }

    @Override // o.animateAddImpl
    public void addListener(Runnable runnable, Executor executor) {
        this.ah$a.values(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 2147483647999999999L) {
            return (V) super.get(j, timeUnit);
        }
        return (V) super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        this.ah$a.valueOf();
    }
}
