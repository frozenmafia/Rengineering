package io.reactivex.internal.observers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteOpenHelper;
import o.FrameworkSQLiteStatement;
import o.SupportSQLiteOpenHelper;
import o.initializeComponent;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = -4403180040475402120L;
    boolean done;
    final FrameworkSQLiteOpenHelper.OpenHelper onComplete;
    final FrameworkSQLiteStatement<? super Throwable> onError;
    final initializeComponent<? super T> onNext;

    public ForEachWhileObserver(initializeComponent<? super T> initializecomponent, FrameworkSQLiteStatement<? super Throwable> frameworkSQLiteStatement, FrameworkSQLiteOpenHelper.OpenHelper openHelper) {
        this.onNext = initializecomponent;
        this.onError = frameworkSQLiteStatement;
        this.onComplete = openHelper;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        DisposableHelper.setOnce(this, anonymousClass2);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            if (this.onNext.test(t)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            dispose();
            onError(th);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        if (this.done) {
            setProgressBackgroundColor.values(th);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            FrameworkSQLiteDatabase.values(th2);
            setProgressBackgroundColor.values(new CompositeException(th, th2));
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
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
        return DisposableHelper.isDisposed(get());
    }
}
