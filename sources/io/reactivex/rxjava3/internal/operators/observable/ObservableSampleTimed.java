package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.addSourceSha;
import o.dataStart;
import o.getLoopers;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableSampleTimed<T> extends startObject<T, T> {
    final boolean ag$a;
    final TimeUnit ah$a;
    final getLoopers toString;
    final long values;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        addSourceSha addsourcesha = new addSourceSha(idlingResource);
        if (this.ag$a) {
            this.valueOf.subscribe(new SampleTimedEmitLast(addsourcesha, this.values, this.ah$a, this.toString));
        } else {
            this.valueOf.subscribe(new SampleTimedNoLast(addsourcesha, this.values, this.ah$a, this.toString));
        }
    }

    /* loaded from: classes7.dex */
    static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements IdlingResource<T>, dataStart, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final IdlingResource<? super T> downstream;
        final long period;
        final getLoopers scheduler;
        final AtomicReference<dataStart> timer = new AtomicReference<>();
        final TimeUnit unit;
        dataStart upstream;

        abstract void complete();

        SampleTimedObserver(IdlingResource<? super T> idlingResource, long j, TimeUnit timeUnit, getLoopers getloopers) {
            this.downstream = idlingResource;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = getloopers;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.validate(this.upstream, datastart)) {
                this.upstream = datastart;
                this.downstream.onSubscribe(this);
                getLoopers getloopers = this.scheduler;
                long j = this.period;
                DisposableHelper.replace(this.timer, getloopers.ag$a(this, j, j, this.unit));
            }
        }

        @Override // o.IdlingResource
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            cancelTimer();
            this.downstream.onError(th);
        }

        @Override // o.IdlingResource
        public void onComplete() {
            cancelTimer();
            complete();
        }

        void cancelTimer() {
            DisposableHelper.dispose(this.timer);
        }

        @Override // o.dataStart
        public void dispose() {
            cancelTimer();
            this.upstream.dispose();
        }

        @Override // o.dataStart
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

        SampleTimedNoLast(IdlingResource<? super T> idlingResource, long j, TimeUnit timeUnit, getLoopers getloopers) {
            super(idlingResource, j, timeUnit, getloopers);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
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

        SampleTimedEmitLast(IdlingResource<? super T> idlingResource, long j, TimeUnit timeUnit, getLoopers getloopers) {
            super(idlingResource, j, timeUnit, getloopers);
            this.wip = new AtomicInteger(1);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
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
