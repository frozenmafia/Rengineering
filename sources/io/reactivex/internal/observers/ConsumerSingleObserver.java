package io.reactivex.internal.observers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteStatement;
import o.appendClause;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class ConsumerSingleObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements appendClause<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = -7012088219455310787L;
    final FrameworkSQLiteStatement<? super Throwable> onError;
    final FrameworkSQLiteStatement<? super T> onSuccess;

    public ConsumerSingleObserver(FrameworkSQLiteStatement<? super T> frameworkSQLiteStatement, FrameworkSQLiteStatement<? super Throwable> frameworkSQLiteStatement2) {
        this.onSuccess = frameworkSQLiteStatement;
        this.onError = frameworkSQLiteStatement2;
    }

    @Override // o.appendClause
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
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
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
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

    public boolean hasCustomOnError() {
        return this.onError != Functions.getSignupData;
    }
}
