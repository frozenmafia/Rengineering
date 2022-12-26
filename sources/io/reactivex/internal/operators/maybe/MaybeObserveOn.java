package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.appendColumns;
import o.builder;
import o.setArrowDimensions;
/* loaded from: classes7.dex */
public final class MaybeObserveOn<T> extends setArrowDimensions<T, T> {
    final appendColumns ag$a;

    @Override // o.deleteDatabaseFile
    public void values(builder<? super T> builderVar) {
        this.values.valueOf(new ObserveOnMaybeObserver(builderVar, this.ag$a));
    }

    /* loaded from: classes7.dex */
    static final class ObserveOnMaybeObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<T>, FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final builder<? super T> downstream;
        Throwable error;
        final appendColumns scheduler;
        T value;

        ObserveOnMaybeObserver(builder<? super T> builderVar, appendColumns appendcolumns) {
            this.downstream = builderVar;
            this.scheduler = appendcolumns;
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
            this.value = t;
            DisposableHelper.replace(this, this.scheduler.values(this));
        }

        @Override // o.builder
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.values(this));
        }

        @Override // o.builder
        public void onComplete() {
            DisposableHelper.replace(this, this.scheduler.values(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            T t = this.value;
            if (t != null) {
                this.value = null;
                this.downstream.onSuccess(t);
                return;
            }
            this.downstream.onComplete();
        }
    }
}
