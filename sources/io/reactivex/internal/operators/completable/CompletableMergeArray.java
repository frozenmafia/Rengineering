package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.isDraggable;
import o.orderBy;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class CompletableMergeArray extends isDraggable {
    final SlidingPaneLayout.TouchBlocker[] valueOf;

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        SlidingPaneLayout.TouchBlocker[] touchBlockerArr;
        orderBy orderby = new orderBy();
        InnerCompletableObserver innerCompletableObserver = new InnerCompletableObserver(savedState, new AtomicBoolean(), orderby, this.valueOf.length + 1);
        savedState.onSubscribe(orderby);
        for (SlidingPaneLayout.TouchBlocker touchBlocker : this.valueOf) {
            if (orderby.isDisposed()) {
                return;
            }
            if (touchBlocker == null) {
                orderby.dispose();
                innerCompletableObserver.onError(new NullPointerException("A completable source is null"));
                return;
            }
            touchBlocker.ag$a(innerCompletableObserver);
        }
        innerCompletableObserver.onComplete();
    }

    /* loaded from: classes7.dex */
    static final class InnerCompletableObserver extends AtomicInteger implements SlidingPaneLayout.SavedState {
        private static final long serialVersionUID = -8360547806504310570L;
        final SlidingPaneLayout.SavedState downstream;
        final AtomicBoolean once;
        final orderBy set;

        InnerCompletableObserver(SlidingPaneLayout.SavedState savedState, AtomicBoolean atomicBoolean, orderBy orderby, int i) {
            this.downstream = savedState;
            this.once = atomicBoolean;
            this.set = orderby;
            lazySet(i);
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            this.set.values(anonymousClass2);
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onError(Throwable th) {
            this.set.dispose();
            if (this.once.compareAndSet(false, true)) {
                this.downstream.onError(th);
            } else {
                setProgressBackgroundColor.values(th);
            }
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onComplete() {
            if (decrementAndGet() == 0 && this.once.compareAndSet(false, true)) {
                this.downstream.onComplete();
            }
        }
    }
}
