package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.SupportSQLiteQuery;
import o.appendClause;
import o.having;
/* loaded from: classes7.dex */
public final class SingleToObservable<T> extends SupportSQLiteQuery<T> {
    final having<? extends T> toString;

    public SingleToObservable(having<? extends T> havingVar) {
        this.toString = havingVar;
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.values(ag$a((SupportSQLiteOpenHelper.Factory) factory));
    }

    public static <T> appendClause<T> ag$a(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        return new SingleToObservableObserver(factory);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements appendClause<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        SingleToObservableObserver(SupportSQLiteOpenHelper.Factory<? super T> factory) {
            super(factory);
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
            complete(t);
        }

        @Override // o.appendClause
        public void onError(Throwable th) {
            error(th);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }
    }
}
