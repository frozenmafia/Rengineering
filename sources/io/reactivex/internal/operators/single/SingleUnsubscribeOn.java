package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.appendClause;
import o.appendColumns;
import o.groupBy;
import o.having;
/* loaded from: classes7.dex */
public final class SingleUnsubscribeOn<T> extends groupBy<T> {
    final appendColumns toString;
    final having<T> valueOf;

    @Override // o.groupBy
    public void toString(appendClause<? super T> appendclause) {
        this.valueOf.values(new UnsubscribeOnSingleObserver(appendclause, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class UnsubscribeOnSingleObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements appendClause<T>, FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;
        final appendClause<? super T> downstream;
        FrameworkSQLiteDatabase.AnonymousClass2 ds;
        final appendColumns scheduler;

        UnsubscribeOnSingleObserver(appendClause<? super T> appendclause, appendColumns appendcolumns) {
            this.downstream = appendclause;
            this.scheduler = appendcolumns;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            FrameworkSQLiteDatabase.AnonymousClass2 andSet = getAndSet(DisposableHelper.DISPOSED);
            if (andSet != DisposableHelper.DISPOSED) {
                this.ds = andSet;
                this.scheduler.values(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.ds.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.appendClause
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.setOnce(this, anonymousClass2)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.appendClause
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // o.appendClause
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }
    }
}
