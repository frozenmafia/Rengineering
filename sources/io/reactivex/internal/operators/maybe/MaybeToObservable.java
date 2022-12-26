package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.SupportSQLiteQuery;
import o.builder;
/* loaded from: classes5.dex */
public final class MaybeToObservable<T> extends SupportSQLiteQuery<T> {
    final SupportSQLiteOpenHelper.Configuration.Builder<T> values;

    public MaybeToObservable(SupportSQLiteOpenHelper.Configuration.Builder<T> builder) {
        this.values = builder;
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.values.valueOf(ag$a((SupportSQLiteOpenHelper.Factory) factory));
    }

    public static <T> builder<T> ag$a(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        return new MaybeToObservableObserver(factory);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements builder<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        MaybeToObservableObserver(SupportSQLiteOpenHelper.Factory<? super T> factory) {
            super(factory);
        }

        @Override // o.builder
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.upstream, anonymousClass2)) {
                this.upstream = anonymousClass2;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.builder
        public void onSuccess(T t) {
            complete(t);
        }

        @Override // o.builder
        public void onError(Throwable th) {
            error(th);
        }

        @Override // o.builder
        public void onComplete() {
            complete();
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }
    }
}
