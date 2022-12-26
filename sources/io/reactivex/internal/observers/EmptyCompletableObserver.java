package io.reactivex.internal.observers;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.setProgressBackgroundColor;
/* loaded from: classes.dex */
public final class EmptyCompletableObserver extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SlidingPaneLayout.SavedState, FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = -7545121636549663526L;

    public boolean hasCustomOnError() {
        return false;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // o.SlidingPaneLayout.SavedState
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // o.SlidingPaneLayout.SavedState
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        setProgressBackgroundColor.values(new OnErrorNotImplementedException(th));
    }

    @Override // o.SlidingPaneLayout.SavedState
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        DisposableHelper.setOnce(this, anonymousClass2);
    }
}
