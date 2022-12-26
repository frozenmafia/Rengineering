package o;

import io.reactivex.internal.subscriptions.ScalarSubscription;
/* loaded from: classes5.dex */
public final class getEndTrim<T> extends SimpleSQLiteQuery<T> implements i<T> {
    private final T values;

    public getEndTrim(T t) {
        this.values = t;
    }

    @Override // o.SimpleSQLiteQuery
    protected void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        registerconfigurationchangelistener.onSubscribe(new ScalarSubscription(registerconfigurationchangelistener, this.values));
    }

    @Override // o.i, java.util.concurrent.Callable
    public T call() {
        return this.values;
    }
}
