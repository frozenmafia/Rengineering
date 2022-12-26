package o;

import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes.dex */
public final class getStartingEndTrim<T> extends SupportSQLiteQuery<T> implements i<T> {
    private final T toString;

    public getStartingEndTrim(T t) {
        this.toString = t;
    }

    @Override // o.SupportSQLiteQuery
    protected void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(factory, this.toString);
        factory.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }

    @Override // o.i, java.util.concurrent.Callable
    public T call() {
        return this.toString;
    }
}
