package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.isDraggable;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class CompletableTakeUntilCompletable extends isDraggable {
    final isDraggable ag$a;
    final SlidingPaneLayout.TouchBlocker toString;

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(savedState);
        savedState.onSubscribe(takeUntilMainObserver);
        this.toString.ag$a(takeUntilMainObserver.other);
        this.ag$a.ag$a(takeUntilMainObserver);
    }

    /* loaded from: classes7.dex */
    static final class TakeUntilMainObserver extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SlidingPaneLayout.SavedState, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 3533011714830024923L;
        final SlidingPaneLayout.SavedState downstream;
        final OtherObserver other = new OtherObserver(this);
        final AtomicBoolean once = new AtomicBoolean();

        TakeUntilMainObserver(SlidingPaneLayout.SavedState savedState) {
            this.downstream = savedState;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            if (this.once.compareAndSet(false, true)) {
                DisposableHelper.dispose(this);
                DisposableHelper.dispose(this.other);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.once.get();
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this, anonymousClass2);
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onComplete() {
            if (this.once.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.other);
                this.downstream.onComplete();
            }
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onError(Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.other);
                this.downstream.onError(th);
                return;
            }
            setProgressBackgroundColor.values(th);
        }

        void innerComplete() {
            if (this.once.compareAndSet(false, true)) {
                DisposableHelper.dispose(this);
                this.downstream.onComplete();
            }
        }

        void innerError(Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                DisposableHelper.dispose(this);
                this.downstream.onError(th);
                return;
            }
            setProgressBackgroundColor.values(th);
        }

        /* loaded from: classes7.dex */
        static final class OtherObserver extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SlidingPaneLayout.SavedState {
            private static final long serialVersionUID = 5176264485428790318L;
            final TakeUntilMainObserver parent;

            OtherObserver(TakeUntilMainObserver takeUntilMainObserver) {
                this.parent = takeUntilMainObserver;
            }

            @Override // o.SlidingPaneLayout.SavedState
            public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
                DisposableHelper.setOnce(this, anonymousClass2);
            }

            @Override // o.SlidingPaneLayout.SavedState
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // o.SlidingPaneLayout.SavedState
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }
        }
    }
}
