package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.appendClause;
import o.appendColumns;
import o.groupBy;
import o.having;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class SingleTimeout<T> extends groupBy<T> {
    final having<T> ag$a;
    final long ah$a;
    final TimeUnit toString;
    final having<? extends T> valueOf;
    final appendColumns values;

    @Override // o.groupBy
    public void toString(appendClause<? super T> appendclause) {
        TimeoutMainObserver timeoutMainObserver = new TimeoutMainObserver(appendclause, this.valueOf, this.ah$a, this.toString);
        appendclause.onSubscribe(timeoutMainObserver);
        DisposableHelper.replace(timeoutMainObserver.task, this.values.valueOf(timeoutMainObserver, this.ah$a, this.toString));
        this.ag$a.values(timeoutMainObserver);
    }

    /* loaded from: classes7.dex */
    static final class TimeoutMainObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements appendClause<T>, Runnable, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 37497744973048446L;
        final appendClause<? super T> downstream;
        final TimeoutFallbackObserver<T> fallback;
        having<? extends T> other;
        final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> task = new AtomicReference<>();
        final long timeout;
        final TimeUnit unit;

        /* loaded from: classes7.dex */
        static final class TimeoutFallbackObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements appendClause<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            final appendClause<? super T> downstream;

            TimeoutFallbackObserver(appendClause<? super T> appendclause) {
                this.downstream = appendclause;
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
        }

        TimeoutMainObserver(appendClause<? super T> appendclause, having<? extends T> havingVar, long j, TimeUnit timeUnit) {
            this.downstream = appendclause;
            this.other = havingVar;
            this.timeout = j;
            this.unit = timeUnit;
            if (havingVar != null) {
                this.fallback = new TimeoutFallbackObserver<>(appendclause);
            } else {
                this.fallback = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 = get();
            if (anonymousClass2 == DisposableHelper.DISPOSED || !compareAndSet(anonymousClass2, DisposableHelper.DISPOSED)) {
                return;
            }
            if (anonymousClass2 != null) {
                anonymousClass2.dispose();
            }
            having<? extends T> havingVar = this.other;
            if (havingVar == null) {
                this.downstream.onError(new TimeoutException(ExceptionHelper.valueOf(this.timeout, this.unit)));
                return;
            }
            this.other = null;
            havingVar.values(this.fallback);
        }

        @Override // o.appendClause
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.setOnce(this, anonymousClass2);
        }

        @Override // o.appendClause
        public void onSuccess(T t) {
            FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 = get();
            if (anonymousClass2 == DisposableHelper.DISPOSED || !compareAndSet(anonymousClass2, DisposableHelper.DISPOSED)) {
                return;
            }
            DisposableHelper.dispose(this.task);
            this.downstream.onSuccess(t);
        }

        @Override // o.appendClause
        public void onError(Throwable th) {
            FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 = get();
            if (anonymousClass2 != DisposableHelper.DISPOSED && compareAndSet(anonymousClass2, DisposableHelper.DISPOSED)) {
                DisposableHelper.dispose(this.task);
                this.downstream.onError(th);
                return;
            }
            setProgressBackgroundColor.values(th);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.task);
            TimeoutFallbackObserver<T> timeoutFallbackObserver = this.fallback;
            if (timeoutFallbackObserver != null) {
                DisposableHelper.dispose(timeoutFallbackObserver);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }
}
