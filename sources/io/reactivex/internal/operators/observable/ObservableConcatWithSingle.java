package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.appendClause;
import o.having;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableConcatWithSingle<T> extends setProgressRotation<T, T> {
    final having<? extends T> valueOf;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new ConcatWithObserver(factory, this.valueOf));
    }

    /* loaded from: classes7.dex */
    static final class ConcatWithObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<T>, appendClause<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -1953724749712440952L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        boolean inSingle;
        having<? extends T> other;

        ConcatWithObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, having<? extends T> havingVar) {
            this.downstream = factory;
            this.other = havingVar;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (!DisposableHelper.setOnce(this, anonymousClass2) || this.inSingle) {
                return;
            }
            this.downstream.onSubscribe(this);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // o.appendClause
        public void onSuccess(T t) {
            this.downstream.onNext(t);
            this.downstream.onComplete();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            this.inSingle = true;
            DisposableHelper.replace(this, null);
            having<? extends T> havingVar = this.other;
            this.other = null;
            havingVar.values(this);
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
