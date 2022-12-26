package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.appendClause;
import o.builder;
import o.groupBy;
import o.having;
/* loaded from: classes7.dex */
public final class MaybeSwitchIfEmptySingle<T> extends groupBy<T> {
    final SupportSQLiteOpenHelper.Configuration.Builder<T> toString;
    final having<? extends T> values;

    @Override // o.groupBy
    public void toString(appendClause<? super T> appendclause) {
        this.toString.valueOf(new SwitchIfEmptyMaybeObserver(appendclause, this.values));
    }

    /* loaded from: classes7.dex */
    static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 4603919676453758899L;
        final appendClause<? super T> downstream;
        final having<? extends T> other;

        SwitchIfEmptyMaybeObserver(appendClause<? super T> appendclause, having<? extends T> havingVar) {
            this.downstream = appendclause;
            this.other = havingVar;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.builder
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.setOnce(this, anonymousClass2)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.builder
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // o.builder
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.builder
        public void onComplete() {
            FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 = get();
            if (anonymousClass2 == DisposableHelper.DISPOSED || !compareAndSet(anonymousClass2, null)) {
                return;
            }
            this.other.values(new valueOf(this.downstream, this));
        }

        /* loaded from: classes7.dex */
        static final class valueOf<T> implements appendClause<T> {
            final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> ag$a;
            final appendClause<? super T> toString;

            valueOf(appendClause<? super T> appendclause, AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> atomicReference) {
                this.toString = appendclause;
                this.ag$a = atomicReference;
            }

            @Override // o.appendClause
            public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
                DisposableHelper.setOnce(this.ag$a, anonymousClass2);
            }

            @Override // o.appendClause
            public void onSuccess(T t) {
                this.toString.onSuccess(t);
            }

            @Override // o.appendClause
            public void onError(Throwable th) {
                this.toString.onError(th);
            }
        }
    }
}
