package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.getLoopers;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableThrottleLatest<T> extends startObject<T, T> {
    final boolean ag$a;
    final long ah$a;
    final getLoopers toString;
    final TimeUnit values;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        this.valueOf.subscribe(new ThrottleLatestObserver(idlingResource, this.ah$a, this.values, this.toString.ag$a(), this.ag$a));
    }

    /* loaded from: classes7.dex */
    static final class ThrottleLatestObserver<T> extends AtomicInteger implements IdlingResource<T>, dataStart, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final IdlingResource<? super T> downstream;
        final boolean emitLast;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        dataStart upstream;
        final getLoopers.toString worker;

        ThrottleLatestObserver(IdlingResource<? super T> idlingResource, long j, TimeUnit timeUnit, getLoopers.toString tostring, boolean z) {
            this.downstream = idlingResource;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = tostring;
            this.emitLast = z;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.validate(this.upstream, datastart)) {
                this.upstream = datastart;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.IdlingResource
        public void onNext(T t) {
            this.latest.set(t);
            drain();
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // o.IdlingResource
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // o.dataStart
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.timerFired = true;
            drain();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.latest;
            IdlingResource<? super T> idlingResource = this.downstream;
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                if (z && this.error != null) {
                    atomicReference.lazySet(null);
                    idlingResource.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                boolean z2 = atomicReference.get() == null;
                if (z) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z2 && this.emitLast) {
                        idlingResource.onNext(andSet);
                    }
                    idlingResource.onComplete();
                    this.worker.dispose();
                    return;
                }
                if (z2) {
                    if (this.timerFired) {
                        this.timerRunning = false;
                        this.timerFired = false;
                    }
                } else if (!this.timerRunning || this.timerFired) {
                    idlingResource.onNext(atomicReference.getAndSet(null));
                    this.timerFired = false;
                    this.timerRunning = true;
                    this.worker.valueOf(this, this.timeout, this.unit);
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }
    }
}
