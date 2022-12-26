package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class resetAnimation<V> implements animateAddImpl<V> {
    private final V ah$a;
    static final animateAddImpl<?> valueOf = new resetAnimation(null);
    private static final java.util.logging.Logger toString = java.util.logging.Logger.getLogger(resetAnimation.class.getName());

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public resetAnimation(V v) {
        this.ah$a = v;
    }

    @Override // o.animateAddImpl
    public void addListener(Runnable runnable, Executor executor) {
        markViewHoldersUpdated.valueOf(runnable, "Runnable was null.");
        markViewHoldersUpdated.valueOf(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            java.util.logging.Logger logger = toString;
            Level level = Level.SEVERE;
            String valueOf2 = String.valueOf(runnable);
            String valueOf3 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 57 + String.valueOf(valueOf3).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf2);
            sb.append(" with executor ");
            sb.append(valueOf3);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.ah$a;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        markViewHoldersUpdated.toString(timeUnit);
        return get();
    }

    public String toString() {
        String obj = super.toString();
        String valueOf2 = String.valueOf(this.ah$a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + String.valueOf(valueOf2).length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf2);
        sb.append("]]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class values<V> extends countItemsBefore$ah$b<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public values(Throwable th) {
            values(th);
        }
    }
}
