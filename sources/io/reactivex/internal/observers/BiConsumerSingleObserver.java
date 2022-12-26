package io.reactivex.internal.observers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.appendClause;
import o.getReadableSupportDatabase;
import o.setProgressBackgroundColor;
/* loaded from: classes5.dex */
public final class BiConsumerSingleObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements appendClause<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = 4943102778943297569L;
    final getReadableSupportDatabase<? super T, ? super Throwable> onCallback;

    public BiConsumerSingleObserver(getReadableSupportDatabase<? super T, ? super Throwable> getreadablesupportdatabase) {
        this.onCallback = getreadablesupportdatabase;
    }

    @Override // o.appendClause
    public void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.accept(null, th);
        } catch (Throwable th2) {
            FrameworkSQLiteDatabase.values(th2);
            setProgressBackgroundColor.values(new CompositeException(th, th2));
        }
    }

    @Override // o.appendClause
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        DisposableHelper.setOnce(this, anonymousClass2);
    }

    @Override // o.appendClause
    public void onSuccess(T t) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.accept(t, null);
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            setProgressBackgroundColor.values(th);
        }
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }
}
