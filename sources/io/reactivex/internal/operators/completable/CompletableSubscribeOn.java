package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.appendColumns;
import o.isDraggable;
/* loaded from: classes.dex */
public final class CompletableSubscribeOn extends isDraggable {
    final appendColumns toString;
    final SlidingPaneLayout.TouchBlocker valueOf;

    public CompletableSubscribeOn(SlidingPaneLayout.TouchBlocker touchBlocker, appendColumns appendcolumns) {
        this.valueOf = touchBlocker;
        this.toString = appendcolumns;
    }

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(savedState, this.valueOf);
        savedState.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.task.replace(this.toString.values(subscribeOnObserver));
    }

    /* loaded from: classes5.dex */
    static final class SubscribeOnObserver extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SlidingPaneLayout.SavedState, FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final SlidingPaneLayout.SavedState downstream;
        final SlidingPaneLayout.TouchBlocker source;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnObserver(SlidingPaneLayout.SavedState savedState, SlidingPaneLayout.TouchBlocker touchBlocker) {
            this.downstream = savedState;
            this.source = touchBlocker;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.ag$a(this);
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this, anonymousClass2);
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }
}
