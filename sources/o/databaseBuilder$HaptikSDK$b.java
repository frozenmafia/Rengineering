package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes5.dex */
public abstract class databaseBuilder$HaptikSDK$b<V> extends databaseBuilder<V> {
    @Override // o.databaseBuilder, java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return (V) super.get();
    }

    @Override // o.databaseBuilder, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (V) super.get(j, timeUnit);
    }

    @Override // o.databaseBuilder, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }

    @Override // o.databaseBuilder, java.util.concurrent.Future
    public final boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // o.databaseBuilder, o.RoomDatabase
    public final void values(Runnable runnable, Executor executor) {
        super.values(runnable, executor);
    }
}
