package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteOpenHelper;
import o.FrameworkSQLiteStatement;
import o.builder;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class MaybeCallbackObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = -6076952298809384986L;
    final FrameworkSQLiteOpenHelper.OpenHelper onComplete;
    final FrameworkSQLiteStatement<? super Throwable> onError;
    final FrameworkSQLiteStatement<? super T> onSuccess;

    public MaybeCallbackObserver(FrameworkSQLiteStatement<? super T> frameworkSQLiteStatement, FrameworkSQLiteStatement<? super Throwable> frameworkSQLiteStatement2, FrameworkSQLiteOpenHelper.OpenHelper openHelper) {
        this.onSuccess = frameworkSQLiteStatement;
        this.onError = frameworkSQLiteStatement2;
        this.onComplete = openHelper;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // o.builder
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        DisposableHelper.setOnce(this, anonymousClass2);
    }

    @Override // o.builder
    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            setProgressBackgroundColor.values(th);
        }
    }

    @Override // o.builder
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            FrameworkSQLiteDatabase.values(th2);
            setProgressBackgroundColor.values(new CompositeException(th, th2));
        }
    }

    @Override // o.builder
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            setProgressBackgroundColor.values(th);
        }
    }

    public boolean hasCustomOnError() {
        return this.onError != Functions.getSignupData;
    }
}
