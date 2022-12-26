package o;

import io.reactivex.internal.subscriptions.EmptySubscription;
/* loaded from: classes5.dex */
public final class setSizeParameters extends SimpleSQLiteQuery<Object> implements i<Object> {
    public static final SimpleSQLiteQuery<Object> ah$a = new setSizeParameters();

    @Override // o.i, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    private setSizeParameters() {
    }

    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super Object> registerconfigurationchangelistener) {
        EmptySubscription.complete(registerconfigurationchangelistener);
    }
}
