package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.appendColumns;
import o.builder;
import o.setArrowDimensions;
/* loaded from: classes7.dex */
public final class MaybeUnsubscribeOn<T> extends setArrowDimensions<T, T> {
    final appendColumns ag$a;

    @Override // o.deleteDatabaseFile
    public void values(builder<? super T> builderVar) {
        this.values.valueOf(new UnsubscribeOnMaybeObserver(builderVar, this.ag$a));
    }

    /* loaded from: classes7.dex */
    static final class UnsubscribeOnMaybeObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<T>, FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;
        final builder<? super T> downstream;
        FrameworkSQLiteDatabase.AnonymousClass2 ds;
        final appendColumns scheduler;

        UnsubscribeOnMaybeObserver(builder<? super T> builderVar, appendColumns appendcolumns) {
            this.downstream = builderVar;
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
            this.downstream.onComplete();
        }
    }
}
