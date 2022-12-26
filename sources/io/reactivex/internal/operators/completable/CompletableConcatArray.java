package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.isDraggable;
/* loaded from: classes7.dex */
public final class CompletableConcatArray extends isDraggable {
    final SlidingPaneLayout.TouchBlocker[] toString;

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(savedState, this.toString);
        savedState.onSubscribe(concatInnerObserver.sd);
        concatInnerObserver.next();
    }

    /* loaded from: classes7.dex */
    static final class ConcatInnerObserver extends AtomicInteger implements SlidingPaneLayout.SavedState {
        private static final long serialVersionUID = -7965400327305809232L;
        final SlidingPaneLayout.SavedState downstream;
        int index;
        final SequentialDisposable sd = new SequentialDisposable();
        final SlidingPaneLayout.TouchBlocker[] sources;

        ConcatInnerObserver(SlidingPaneLayout.SavedState savedState, SlidingPaneLayout.TouchBlocker[] touchBlockerArr) {
            this.downstream = savedState;
            this.sources = touchBlockerArr;
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            this.sd.replace(anonymousClass2);
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onComplete() {
            next();
        }

        void next() {
            if (!this.sd.isDisposed() && getAndIncrement() == 0) {
                SlidingPaneLayout.TouchBlocker[] touchBlockerArr = this.sources;
                while (!this.sd.isDisposed()) {
                    int i = this.index;
                    this.index = i + 1;
                    if (i == touchBlockerArr.length) {
                        this.downstream.onComplete();
                        return;
                    }
                    touchBlockerArr[i].ag$a(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }
}
