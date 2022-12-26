package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.appendClause;
import o.groupBy;
import o.having;
import o.onResize;
/* loaded from: classes7.dex */
public final class SingleDelayWithSingle<T, U> extends groupBy<T> {
    final having<U> ag$a;
    final having<T> valueOf;

    @Override // o.groupBy
    public void toString(appendClause<? super T> appendclause) {
        this.ag$a.values(new OtherObserver(appendclause, this.valueOf));
    }

    /* loaded from: classes7.dex */
    static final class OtherObserver<T, U> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements appendClause<U>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -8565274649390031272L;
        final appendClause<? super T> downstream;
        final having<T> source;

        OtherObserver(appendClause<? super T> appendclause, having<T> havingVar) {
            this.downstream = appendclause;
            this.source = havingVar;
        }

        @Override // o.appendClause
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.setOnce(this, anonymousClass2)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.appendClause
        public void onSuccess(U u) {
            this.source.values(new onResize(this, this.downstream));
        }

        @Override // o.appendClause
        public void onError(Throwable th) {
            this.downstream.onError(th);
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
