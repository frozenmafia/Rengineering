package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.isDraggable;
/* loaded from: classes7.dex */
public final class CompletableAndThenCompletable extends isDraggable {
    final SlidingPaneLayout.TouchBlocker valueOf;
    final SlidingPaneLayout.TouchBlocker values;

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        this.values.ag$a(new SourceObserver(savedState, this.valueOf));
    }

    /* loaded from: classes7.dex */
    static final class SourceObserver extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SlidingPaneLayout.SavedState, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -4101678820158072998L;
        final SlidingPaneLayout.SavedState actualObserver;
        final SlidingPaneLayout.TouchBlocker next;

        SourceObserver(SlidingPaneLayout.SavedState savedState, SlidingPaneLayout.TouchBlocker touchBlocker) {
            this.actualObserver = savedState;
            this.next = touchBlocker;
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.setOnce(this, anonymousClass2)) {
                this.actualObserver.onSubscribe(this);
            }
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onError(Throwable th) {
            this.actualObserver.onError(th);
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onComplete() {
            SlidingPaneLayout.TouchBlocker touchBlocker = this.next;
            final SlidingPaneLayout.SavedState savedState = this.actualObserver;
            touchBlocker.ag$a(new SlidingPaneLayout.SavedState(this, savedState) { // from class: io.reactivex.internal.operators.completable.CompletableAndThenCompletable$ag$a
                final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> valueOf;
                final SlidingPaneLayout.SavedState values;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.valueOf = this;
                    this.values = savedState;
                }

                @Override // o.SlidingPaneLayout.SavedState
                public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
                    DisposableHelper.replace(this.valueOf, anonymousClass2);
                }

                @Override // o.SlidingPaneLayout.SavedState
                public void onComplete() {
                    this.values.onComplete();
                }

                @Override // o.SlidingPaneLayout.SavedState
                public void onError(Throwable th) {
                    this.values.onError(th);
                }
            });
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }
}
