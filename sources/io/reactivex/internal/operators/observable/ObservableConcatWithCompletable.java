package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.SupportSQLiteOpenHelper;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableConcatWithCompletable<T> extends setProgressRotation<T, T> {
    final SlidingPaneLayout.TouchBlocker ag$a;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new ConcatWithObserver(factory, this.ag$a));
    }

    /* loaded from: classes7.dex */
    static final class ConcatWithObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<T>, SlidingPaneLayout.SavedState, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -1953724749712440952L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        boolean inCompletable;
        SlidingPaneLayout.TouchBlocker other;

        ConcatWithObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, SlidingPaneLayout.TouchBlocker touchBlocker) {
            this.downstream = factory;
            this.other = touchBlocker;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (!DisposableHelper.setOnce(this, anonymousClass2) || this.inCompletable) {
                return;
            }
            this.downstream.onSubscribe(this);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            if (this.inCompletable) {
                this.downstream.onComplete();
                return;
            }
            this.inCompletable = true;
            DisposableHelper.replace(this, null);
            SlidingPaneLayout.TouchBlocker touchBlocker = this.other;
            this.other = null;
            touchBlocker.ag$a(this);
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
