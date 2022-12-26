package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import o.dataStart;
/* loaded from: classes5.dex */
public abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements dataStart {
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;
    protected static final FutureTask<Void> FINISHED = new FutureTask<>(Functions.HaptikSDK$c, null);
    protected static final FutureTask<Void> DISPOSED = new FutureTask<>(Functions.HaptikSDK$c, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractDirectTask(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // o.dataStart
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == FINISHED || future == (futureTask = DISPOSED) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.runner != Thread.currentThread());
    }

    @Override // o.dataStart
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == FINISHED || future == DISPOSED;
    }

    public final void setFuture(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == FINISHED) {
                return;
            }
            if (future2 == DISPOSED) {
                future.cancel(this.runner != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public Runnable getWrappedRunnable() {
        return this.runnable;
    }
}
