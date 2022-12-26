package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.appendColumns;
import o.isDraggable;
/* loaded from: classes7.dex */
public final class CompletableObserveOn extends isDraggable {
    final SlidingPaneLayout.TouchBlocker ag$a;
    final appendColumns valueOf;

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        this.ag$a.ag$a(new ObserveOnCompletableObserver(savedState, this.valueOf));
    }

    /* loaded from: classes7.dex */
    static final class ObserveOnCompletableObserver extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SlidingPaneLayout.SavedState, FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final SlidingPaneLayout.SavedState downstream;
        Throwable error;
        final appendColumns scheduler;

        ObserveOnCompletableObserver(SlidingPaneLayout.SavedState savedState, appendColumns appendcolumns) {
            this.downstream = savedState;
            this.scheduler = appendcolumns;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.setOnce(this, anonymousClass2)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.values(this));
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onComplete() {
            DisposableHelper.replace(this, this.scheduler.values(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            this.downstream.onComplete();
        }
    }
}
