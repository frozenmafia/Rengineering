package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.appendColumns;
import o.isDraggable;
/* loaded from: classes7.dex */
public final class CompletableDelay extends isDraggable {
    final TimeUnit ag$a;
    final long ah$a;
    final boolean toString;
    final SlidingPaneLayout.TouchBlocker valueOf;
    final appendColumns values;

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        this.valueOf.ag$a(new Delay(savedState, this.ah$a, this.ag$a, this.values, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class Delay extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SlidingPaneLayout.SavedState, Runnable, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError;
        final SlidingPaneLayout.SavedState downstream;
        Throwable error;
        final appendColumns scheduler;
        final TimeUnit unit;

        Delay(SlidingPaneLayout.SavedState savedState, long j, TimeUnit timeUnit, appendColumns appendcolumns, boolean z) {
            this.downstream = savedState;
            this.delay = j;
            this.unit = timeUnit;
            this.scheduler = appendcolumns;
            this.delayError = z;
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.setOnce(this, anonymousClass2)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onComplete() {
            DisposableHelper.replace(this, this.scheduler.valueOf(this, this.delay, this.unit));
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.valueOf(this, this.delayError ? this.delay : 0L, this.unit));
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            this.error = null;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }
    }
}
