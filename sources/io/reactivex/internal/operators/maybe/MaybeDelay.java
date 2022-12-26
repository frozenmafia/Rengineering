package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.appendColumns;
import o.builder;
import o.setArrowDimensions;
/* loaded from: classes7.dex */
public final class MaybeDelay<T> extends setArrowDimensions<T, T> {
    final long ag$a;
    final TimeUnit ah$a;
    final appendColumns valueOf;

    @Override // o.deleteDatabaseFile
    public void values(builder<? super T> builderVar) {
        this.values.valueOf(new DelayMaybeObserver(builderVar, this.ag$a, this.ah$a, this.valueOf));
    }

    /* loaded from: classes7.dex */
    static final class DelayMaybeObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<T>, FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = 5566860102500855068L;
        final long delay;
        final builder<? super T> downstream;
        Throwable error;
        final appendColumns scheduler;
        final TimeUnit unit;
        T value;

        DelayMaybeObserver(builder<? super T> builderVar, long j, TimeUnit timeUnit, appendColumns appendcolumns) {
            this.downstream = builderVar;
            this.delay = j;
            this.unit = timeUnit;
            this.scheduler = appendcolumns;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
                return;
            }
            T t = this.value;
            if (t != null) {
                this.downstream.onSuccess(t);
            } else {
                this.downstream.onComplete();
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

        @Override // o.builder
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.setOnce(this, anonymousClass2)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.builder
        public void onSuccess(T t) {
            this.value = t;
            schedule();
        }

        @Override // o.builder
        public void onError(Throwable th) {
            this.error = th;
            schedule();
        }

        @Override // o.builder
        public void onComplete() {
            schedule();
        }

        void schedule() {
            DisposableHelper.replace(this, this.scheduler.valueOf(this, this.delay, this.unit));
        }
    }
}
