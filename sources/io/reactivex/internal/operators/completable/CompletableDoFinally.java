package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteOpenHelper;
import o.SlidingPaneLayout;
import o.isDraggable;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class CompletableDoFinally extends isDraggable {
    final FrameworkSQLiteOpenHelper.OpenHelper valueOf;
    final SlidingPaneLayout.TouchBlocker values;

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        this.values.ag$a(new DoFinallyObserver(savedState, this.valueOf));
    }

    /* loaded from: classes7.dex */
    static final class DoFinallyObserver extends AtomicInteger implements SlidingPaneLayout.SavedState, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 4109457741734051389L;
        final SlidingPaneLayout.SavedState downstream;
        final FrameworkSQLiteOpenHelper.OpenHelper onFinally;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        DoFinallyObserver(SlidingPaneLayout.SavedState savedState, FrameworkSQLiteOpenHelper.OpenHelper openHelper) {
            this.downstream = savedState;
            this.onFinally = openHelper;
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.upstream, anonymousClass2)) {
                this.upstream = anonymousClass2;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    FrameworkSQLiteDatabase.values(th);
                    setProgressBackgroundColor.values(th);
                }
            }
        }
    }
}
