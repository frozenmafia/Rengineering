package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.appendColumns;
import o.isRefreshing;
import o.setProgressRotation;
/* loaded from: classes7.dex */
public final class ObservableSampleTimed<T> extends setProgressRotation<T, T> {
    final appendColumns ag$a;
    final long ah$a;
    final TimeUnit valueOf;
    final boolean values;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        isRefreshing isrefreshing = new isRefreshing(factory);
        if (this.values) {
            this.toString.subscribe(new SampleTimedEmitLast(isrefreshing, this.ah$a, this.valueOf, this.ag$a));
        } else {
            this.toString.subscribe(new SampleTimedNoLast(isrefreshing, this.ah$a, this.valueOf, this.ag$a));
        }
    }

    /* loaded from: classes7.dex */
    static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final SupportSQLiteOpenHelper.Factory<? super T> downstream;
        final long period;
        final appendColumns scheduler;
        final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> timer = new AtomicReference<>();
        final TimeUnit unit;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        abstract void complete();

        SampleTimedObserver(SupportSQLiteOpenHelper.Factory<? super T> factory, long j, TimeUnit timeUnit, appendColumns appendcolumns) {
            this.downstream = factory;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = appendcolumns;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.upstream, anonymousClass2)) {
                this.upstream = anonymousClass2;
                this.downstream.onSubscribe(this);
                appendColumns appendcolumns = this.scheduler;
                long j = this.period;
                DisposableHelper.replace(this.timer, appendcolumns.ah$a(this, j, j, this.unit));
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            cancelTimer();
            this.downstream.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            cancelTimer();
            complete();
        }

        void cancelTimer() {
            DisposableHelper.dispose(this.timer);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            cancelTimer();
            this.upstream.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }
    }

    /* loaded from: classes7.dex */
    static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(SupportSQLiteOpenHelper.Factory<? super T> factory, long j, TimeUnit timeUnit, appendColumns appendcolumns) {
            super(factory, j, timeUnit, appendcolumns);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        void complete() {
            this.downstream.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            emit();
        }
    }

    /* loaded from: classes7.dex */
    static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip;

        SampleTimedEmitLast(SupportSQLiteOpenHelper.Factory<? super T> factory, long j, TimeUnit timeUnit, appendColumns appendcolumns) {
            super(factory, j, timeUnit, appendcolumns);
            this.wip = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        void complete() {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                emit();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }
    }
}
