package io.reactivex.internal.operators.completable;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.isDraggable;
import o.orderBy;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class CompletableMergeIterable extends isDraggable {
    final Iterable<? extends SlidingPaneLayout.TouchBlocker> valueOf;

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        orderBy orderby = new orderBy();
        savedState.onSubscribe(orderby);
        try {
            Iterator it = (Iterator) Objects.requireNonNull(this.valueOf.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            MergeCompletableObserver mergeCompletableObserver = new MergeCompletableObserver(savedState, orderby, atomicInteger);
            while (!orderby.isDisposed()) {
                try {
                    if (it.hasNext()) {
                        if (orderby.isDisposed()) {
                            return;
                        }
                        try {
                            SlidingPaneLayout.TouchBlocker touchBlocker = (SlidingPaneLayout.TouchBlocker) Objects.requireNonNull(it.next(), "The iterator returned a null CompletableSource");
                            if (orderby.isDisposed()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            touchBlocker.ag$a(mergeCompletableObserver);
                        } catch (Throwable th) {
                            FrameworkSQLiteDatabase.values(th);
                            orderby.dispose();
                            mergeCompletableObserver.onError(th);
                            return;
                        }
                    } else {
                        mergeCompletableObserver.onComplete();
                        return;
                    }
                } catch (Throwable th2) {
                    FrameworkSQLiteDatabase.values(th2);
                    orderby.dispose();
                    mergeCompletableObserver.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            FrameworkSQLiteDatabase.values(th3);
            savedState.onError(th3);
        }
    }

    /* loaded from: classes7.dex */
    static final class MergeCompletableObserver extends AtomicBoolean implements SlidingPaneLayout.SavedState {
        private static final long serialVersionUID = -7730517613164279224L;
        final SlidingPaneLayout.SavedState downstream;
        final orderBy set;
        final AtomicInteger wip;

        MergeCompletableObserver(SlidingPaneLayout.SavedState savedState, orderBy orderby, AtomicInteger atomicInteger) {
            this.downstream = savedState;
            this.set = orderby;
            this.wip = atomicInteger;
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            this.set.values(anonymousClass2);
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onError(Throwable th) {
            this.set.dispose();
            if (compareAndSet(false, true)) {
                this.downstream.onError(th);
            } else {
                setProgressBackgroundColor.values(th);
            }
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onComplete() {
            if (this.wip.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.downstream.onComplete();
            }
        }
    }
}
