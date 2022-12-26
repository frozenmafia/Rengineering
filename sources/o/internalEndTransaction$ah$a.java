package o;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class internalEndTransaction$ah$a<V> implements RoomDatabase<V> {
    private static final java.util.logging.Logger values = java.util.logging.Logger.getLogger(internalEndTransaction$ah$a.class.getName());

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws ExecutionException;

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    private internalEndTransaction$ah$a() {
    }

    @Override // o.RoomDatabase
    public void values(Runnable runnable, Executor executor) {
        Objects.requireNonNull(runnable, "Runnable was null.");
        Objects.requireNonNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            java.util.logging.Logger logger = values;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        assertNotMainThread.valueOf(timeUnit);
        return get();
    }
}
