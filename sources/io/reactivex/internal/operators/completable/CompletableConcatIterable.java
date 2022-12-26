package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.isDraggable;
/* loaded from: classes7.dex */
public final class CompletableConcatIterable extends isDraggable {
    final Iterable<? extends SlidingPaneLayout.TouchBlocker> ah$a;

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        try {
            ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(savedState, (Iterator) Objects.requireNonNull(this.ah$a.iterator(), "The iterator returned is null"));
            savedState.onSubscribe(concatInnerObserver.sd);
            concatInnerObserver.next();
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            EmptyDisposable.error(th, savedState);
        }
    }

    /* loaded from: classes7.dex */
    static final class ConcatInnerObserver extends AtomicInteger implements SlidingPaneLayout.SavedState {
        private static final long serialVersionUID = -7965400327305809232L;
        final SlidingPaneLayout.SavedState downstream;
        final SequentialDisposable sd = new SequentialDisposable();
        final Iterator<? extends SlidingPaneLayout.TouchBlocker> sources;

        ConcatInnerObserver(SlidingPaneLayout.SavedState savedState, Iterator<? extends SlidingPaneLayout.TouchBlocker> it) {
            this.downstream = savedState;
            this.sources = it;
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
                Iterator<? extends SlidingPaneLayout.TouchBlocker> it = this.sources;
                while (!this.sd.isDisposed()) {
                    try {
                        if (!it.hasNext()) {
                            this.downstream.onComplete();
                            return;
                        }
                        try {
                            ((SlidingPaneLayout.TouchBlocker) Objects.requireNonNull(it.next(), "The CompletableSource returned is null")).ag$a(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            FrameworkSQLiteDatabase.values(th);
                            this.downstream.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        FrameworkSQLiteDatabase.values(th2);
                        this.downstream.onError(th2);
                        return;
                    }
                }
            }
        }
    }
}
