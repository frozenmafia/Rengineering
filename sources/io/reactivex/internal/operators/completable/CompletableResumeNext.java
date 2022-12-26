package io.reactivex.internal.operators.completable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteOpenHelperFactory;
import o.SlidingPaneLayout;
import o.isDraggable;
/* loaded from: classes7.dex */
public final class CompletableResumeNext extends isDraggable {
    final SlidingPaneLayout.TouchBlocker ag$a;
    final FrameworkSQLiteOpenHelperFactory<? super Throwable, ? extends SlidingPaneLayout.TouchBlocker> toString;

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        ResumeNextObserver resumeNextObserver = new ResumeNextObserver(savedState, this.toString);
        savedState.onSubscribe(resumeNextObserver);
        this.ag$a.ag$a(resumeNextObserver);
    }

    /* loaded from: classes7.dex */
    static final class ResumeNextObserver extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SlidingPaneLayout.SavedState, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 5018523762564524046L;
        final SlidingPaneLayout.SavedState downstream;
        final FrameworkSQLiteOpenHelperFactory<? super Throwable, ? extends SlidingPaneLayout.TouchBlocker> errorMapper;
        boolean once;

        ResumeNextObserver(SlidingPaneLayout.SavedState savedState, FrameworkSQLiteOpenHelperFactory<? super Throwable, ? extends SlidingPaneLayout.TouchBlocker> frameworkSQLiteOpenHelperFactory) {
            this.downstream = savedState;
            this.errorMapper = frameworkSQLiteOpenHelperFactory;
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.replace(this, anonymousClass2);
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onError(Throwable th) {
            if (this.once) {
                this.downstream.onError(th);
                return;
            }
            this.once = true;
            try {
                ((SlidingPaneLayout.TouchBlocker) Objects.requireNonNull(this.errorMapper.apply(th), "The errorMapper returned a null CompletableSource")).ag$a(this);
            } catch (Throwable th2) {
                FrameworkSQLiteDatabase.values(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }
    }
}
