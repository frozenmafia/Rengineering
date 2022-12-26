package o;

import java.util.concurrent.Callable;
import o.FrameworkSQLiteDatabase;
/* loaded from: classes7.dex */
public final class getStrokeWidth<T> extends deleteDatabaseFile<T> implements Callable<T> {
    final Callable<? extends T> ah$a;

    public getStrokeWidth(Callable<? extends T> callable) {
        this.ah$a = callable;
    }

    @Override // o.deleteDatabaseFile
    protected void values(builder<? super T> builderVar) {
        FrameworkSQLiteDatabase.AnonymousClass2 values = isDelegate.values();
        builderVar.onSubscribe(values);
        if (values.isDisposed()) {
            return;
        }
        try {
            Object obj = (T) this.ah$a.call();
            if (values.isDisposed()) {
                return;
            }
            if (obj == null) {
                builderVar.onComplete();
            } else {
                builderVar.onSuccess(obj);
            }
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            if (!values.isDisposed()) {
                builderVar.onError(th);
            } else {
                setProgressBackgroundColor.values(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return this.ah$a.call();
    }
}
