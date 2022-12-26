package io.reactivex.internal.observers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteOpenHelper;
import o.FrameworkSQLiteStatement;
import o.SupportSQLiteOpenHelper;
import o.setProgressBackgroundColor;
/* loaded from: classes.dex */
public final class LambdaObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = -7251123623727029452L;
    final FrameworkSQLiteOpenHelper.OpenHelper onComplete;
    final FrameworkSQLiteStatement<? super Throwable> onError;
    final FrameworkSQLiteStatement<? super T> onNext;
    final FrameworkSQLiteStatement<? super FrameworkSQLiteDatabase.AnonymousClass2> onSubscribe;

    public LambdaObserver(FrameworkSQLiteStatement<? super T> frameworkSQLiteStatement, FrameworkSQLiteStatement<? super Throwable> frameworkSQLiteStatement2, FrameworkSQLiteOpenHelper.OpenHelper openHelper, FrameworkSQLiteStatement<? super FrameworkSQLiteDatabase.AnonymousClass2> frameworkSQLiteStatement3) {
        this.onNext = frameworkSQLiteStatement;
        this.onError = frameworkSQLiteStatement2;
        this.onComplete = openHelper;
        this.onSubscribe = frameworkSQLiteStatement3;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (DisposableHelper.setOnce(this, anonymousClass2)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                FrameworkSQLiteDatabase.values(th);
                anonymousClass2.dispose();
                onError(th);
            }
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.onNext.accept(t);
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onError.accept(th);
                return;
            } catch (Throwable th2) {
                FrameworkSQLiteDatabase.values(th2);
                setProgressBackgroundColor.values(new CompositeException(th, th2));
                return;
            }
        }
        setProgressBackgroundColor.values(th);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
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
