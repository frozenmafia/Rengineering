package o;

import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.Objects;
import java.util.concurrent.Callable;
/* loaded from: classes5.dex */
public final class getCenterRadius<T> extends SimpleSQLiteQuery<T> {
    final Callable<? extends Throwable> valueOf;

    public getCenterRadius(Callable<? extends Throwable> callable) {
        this.valueOf = callable;
    }

    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        try {
            th = (Throwable) Objects.requireNonNull(this.valueOf.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            FrameworkSQLiteDatabase.values(th);
        }
        EmptySubscription.error(th, registerconfigurationchangelistener);
    }
}
