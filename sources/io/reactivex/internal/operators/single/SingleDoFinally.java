package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteOpenHelper;
import o.appendClause;
import o.groupBy;
import o.having;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class SingleDoFinally<T> extends groupBy<T> {
    final having<T> valueOf;
    final FrameworkSQLiteOpenHelper.OpenHelper values;

    @Override // o.groupBy
    public void toString(appendClause<? super T> appendclause) {
        this.valueOf.values(new DoFinallyObserver(appendclause, this.values));
    }

    /* loaded from: classes7.dex */
    static final class DoFinallyObserver<T> extends AtomicInteger implements appendClause<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 4109457741734051389L;
        final appendClause<? super T> downstream;
        final FrameworkSQLiteOpenHelper.OpenHelper onFinally;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        DoFinallyObserver(appendClause<? super T> appendclause, FrameworkSQLiteOpenHelper.OpenHelper openHelper) {
            this.downstream = appendclause;
            this.onFinally = openHelper;
        }

        @Override // o.appendClause
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.upstream, anonymousClass2)) {
                this.upstream = anonymousClass2;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.appendClause
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
            runFinally();
        }

        @Override // o.appendClause
        public void onError(Throwable th) {
            this.downstream.onError(th);
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
