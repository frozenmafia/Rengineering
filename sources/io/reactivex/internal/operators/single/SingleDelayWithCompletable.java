package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.appendClause;
import o.groupBy;
import o.having;
import o.onResize;
/* loaded from: classes7.dex */
public final class SingleDelayWithCompletable<T> extends groupBy<T> {
    final SlidingPaneLayout.TouchBlocker ah$a;
    final having<T> toString;

    @Override // o.groupBy
    public void toString(appendClause<? super T> appendclause) {
        this.ah$a.ag$a(new OtherObserver(appendclause, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class OtherObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SlidingPaneLayout.SavedState, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -8565274649390031272L;
        final appendClause<? super T> downstream;
        final having<T> source;

        OtherObserver(appendClause<? super T> appendclause, having<T> havingVar) {
            this.downstream = appendclause;
            this.source = havingVar;
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.setOnce(this, anonymousClass2)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onComplete() {
            this.source.values(new onResize(this, this.downstream));
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
