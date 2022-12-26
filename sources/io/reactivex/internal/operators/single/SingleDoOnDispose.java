package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteOpenHelper;
import o.appendClause;
import o.groupBy;
import o.having;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class SingleDoOnDispose<T> extends groupBy<T> {
    final FrameworkSQLiteOpenHelper.OpenHelper toString;
    final having<T> valueOf;

    @Override // o.groupBy
    public void toString(appendClause<? super T> appendclause) {
        this.valueOf.values(new DoOnDisposeObserver(appendclause, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class DoOnDisposeObserver<T> extends AtomicReference<FrameworkSQLiteOpenHelper.OpenHelper> implements appendClause<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -8583764624474935784L;
        final appendClause<? super T> downstream;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        DoOnDisposeObserver(appendClause<? super T> appendclause, FrameworkSQLiteOpenHelper.OpenHelper openHelper) {
            this.downstream = appendclause;
            lazySet(openHelper);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            FrameworkSQLiteOpenHelper.OpenHelper andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th) {
                    FrameworkSQLiteDatabase.values(th);
                    setProgressBackgroundColor.values(th);
                }
                this.upstream.dispose();
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.upstream.isDisposed();
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
        }

        @Override // o.appendClause
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }
    }
}
