package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.appendClause;
import o.appendColumns;
import o.groupBy;
import o.having;
/* loaded from: classes7.dex */
public final class SingleSubscribeOn<T> extends groupBy<T> {
    final having<? extends T> toString;
    final appendColumns valueOf;

    @Override // o.groupBy
    public void toString(appendClause<? super T> appendclause) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(appendclause, this.toString);
        appendclause.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.task.replace(this.valueOf.values(subscribeOnObserver));
    }

    /* loaded from: classes7.dex */
    static final class SubscribeOnObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements appendClause<T>, FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final appendClause<? super T> downstream;
        final having<? extends T> source;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnObserver(appendClause<? super T> appendclause, having<? extends T> havingVar) {
            this.downstream = appendclause;
            this.source = havingVar;
        }

        @Override // o.appendClause
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this, anonymousClass2);
        }

        @Override // o.appendClause
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // o.appendClause
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.values(this);
        }
    }
}
