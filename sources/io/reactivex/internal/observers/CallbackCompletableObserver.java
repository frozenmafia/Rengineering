package io.reactivex.internal.observers;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteOpenHelper;
import o.FrameworkSQLiteStatement;
import o.SlidingPaneLayout;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class CallbackCompletableObserver extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SlidingPaneLayout.SavedState, FrameworkSQLiteDatabase.AnonymousClass2, FrameworkSQLiteStatement<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;
    final FrameworkSQLiteOpenHelper.OpenHelper onComplete;
    final FrameworkSQLiteStatement<? super Throwable> onError;

    public CallbackCompletableObserver(FrameworkSQLiteOpenHelper.OpenHelper openHelper) {
        this.onError = this;
        this.onComplete = openHelper;
    }

    public CallbackCompletableObserver(FrameworkSQLiteStatement<? super Throwable> frameworkSQLiteStatement, FrameworkSQLiteOpenHelper.OpenHelper openHelper) {
        this.onError = frameworkSQLiteStatement;
        this.onComplete = openHelper;
    }

    @Override // o.FrameworkSQLiteStatement
    public void accept(Throwable th) {
        setProgressBackgroundColor.values(new OnErrorNotImplementedException(th));
    }

    @Override // o.SlidingPaneLayout.SavedState
    public void onComplete() {
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            setProgressBackgroundColor.values(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // o.SlidingPaneLayout.SavedState
    public void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            FrameworkSQLiteDatabase.values(th2);
            setProgressBackgroundColor.values(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // o.SlidingPaneLayout.SavedState
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        DisposableHelper.setOnce(this, anonymousClass2);
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
        return this.onError != this;
    }
}
