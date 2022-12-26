package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes7.dex */
public abstract class onStateRestorationPolicyChanged$ah$a<V> extends onStateRestorationPolicyChanged<V> implements countItemsBefore$HaptikSDK$c<V> {
    @Override // o.countItemsBefore, java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return (V) super.get();
    }

    @Override // o.countItemsBefore, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (V) super.get(j, timeUnit);
    }

    @Override // o.countItemsBefore, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }

    @Override // o.countItemsBefore, java.util.concurrent.Future
    public final boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // o.countItemsBefore, o.animateAddImpl
    public final void addListener(Runnable runnable, Executor executor) {
        super.addListener(runnable, executor);
    }

    @Override // o.countItemsBefore, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return super.cancel(z);
    }
}
