package o;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.Objects;
import java.util.concurrent.Callable;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes.dex */
public final class getShowArrow<T> extends SupportSQLiteQuery<T> implements Callable<T> {
    final Callable<? extends T> ag$a;

    public getShowArrow(Callable<? extends T> callable) {
        this.ag$a = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(factory);
        factory.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            deferredScalarDisposable.complete(Objects.requireNonNull(this.ag$a.call(), "Callable returned null"));
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            if (!deferredScalarDisposable.isDisposed()) {
                factory.onError(th);
            } else {
                setProgressBackgroundColor.values(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) Objects.requireNonNull(this.ag$a.call(), "The callable returned a null value");
    }
}
