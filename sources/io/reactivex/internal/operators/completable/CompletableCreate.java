package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.AppInitializer;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.isDraggable;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class CompletableCreate extends isDraggable {
    final SlidingPaneLayout.PanelSlideListener ah$a;

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        Emitter emitter = new Emitter(savedState);
        savedState.onSubscribe(emitter);
        try {
            this.ah$a.valueOf(emitter);
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            emitter.onError(th);
        }
    }

    /* loaded from: classes7.dex */
    static final class Emitter extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SlidingPaneLayout.SavedState.AnonymousClass1, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -2467358622224974244L;
        final SlidingPaneLayout.SavedState downstream;

        Emitter(SlidingPaneLayout.SavedState savedState) {
            this.downstream = savedState;
        }

        public void onComplete() {
            FrameworkSQLiteDatabase.AnonymousClass2 andSet;
            if (get() == DisposableHelper.DISPOSED || (andSet = getAndSet(DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                this.downstream.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        public void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            setProgressBackgroundColor.values(th);
        }

        public boolean tryOnError(Throwable th) {
            FrameworkSQLiteDatabase.AnonymousClass2 andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == DisposableHelper.DISPOSED || (andSet = getAndSet(DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED) {
                return false;
            }
            try {
                this.downstream.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        public void setDisposable(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.set(this, anonymousClass2);
        }

        public void setCancellable(AppInitializer appInitializer) {
            setDisposable(new CancellableDisposable(appInitializer));
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }
}
