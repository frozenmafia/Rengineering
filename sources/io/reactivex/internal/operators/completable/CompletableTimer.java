package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.appendColumns;
import o.isDraggable;
/* loaded from: classes7.dex */
public final class CompletableTimer extends isDraggable {
    final TimeUnit ag$a;
    final appendColumns ah$a;
    final long valueOf;

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        TimerDisposable timerDisposable = new TimerDisposable(savedState);
        savedState.onSubscribe(timerDisposable);
        timerDisposable.setFuture(this.ah$a.valueOf(timerDisposable, this.valueOf, this.ag$a));
    }

    /* loaded from: classes7.dex */
    static final class TimerDisposable extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;
        final SlidingPaneLayout.SavedState downstream;

        TimerDisposable(SlidingPaneLayout.SavedState savedState) {
            this.downstream = savedState;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.downstream.onComplete();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        void setFuture(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.replace(this, anonymousClass2);
        }
    }
}
