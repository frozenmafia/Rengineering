package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.appendClause;
import o.appendColumns;
import o.groupBy;
import o.having;
/* loaded from: classes7.dex */
public final class SingleObserveOn<T> extends groupBy<T> {
    final having<T> ag$a;
    final appendColumns toString;

    @Override // o.groupBy
    public void toString(appendClause<? super T> appendclause) {
        this.ag$a.values(new ObserveOnSingleObserver(appendclause, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class ObserveOnSingleObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements appendClause<T>, FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final appendClause<? super T> downstream;
        Throwable error;
        final appendColumns scheduler;
        T value;

        ObserveOnSingleObserver(appendClause<? super T> appendclause, appendColumns appendcolumns) {
            this.downstream = appendclause;
            this.scheduler = appendcolumns;
        }

        @Override // o.appendClause
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.setOnce(this, anonymousClass2)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.appendClause
        public void onSuccess(T t) {
            this.value = t;
            DisposableHelper.replace(this, this.scheduler.values(this));
        }

        @Override // o.appendClause
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.values(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onSuccess((T) this.value);
            }
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
