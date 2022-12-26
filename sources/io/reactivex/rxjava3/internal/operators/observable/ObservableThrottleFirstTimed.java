package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.addSourceSha;
import o.dataStart;
import o.getLoopers;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableThrottleFirstTimed<T> extends startObject<T, T> {
    final TimeUnit ag$a;
    final long ah$a;
    final getLoopers values;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        this.valueOf.subscribe(new DebounceTimedObserver(new addSourceSha(idlingResource), this.ah$a, this.ag$a, this.values.ag$a()));
    }

    /* loaded from: classes7.dex */
    static final class DebounceTimedObserver<T> extends AtomicReference<dataStart> implements IdlingResource<T>, dataStart, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        final IdlingResource<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final TimeUnit unit;
        dataStart upstream;
        final getLoopers.toString worker;

        DebounceTimedObserver(IdlingResource<? super T> idlingResource, long j, TimeUnit timeUnit, getLoopers.toString tostring) {
            this.downstream = idlingResource;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = tostring;
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
            if (this.gate) {
                return;
            }
            this.gate = true;
            this.downstream.onNext(t);
            dataStart datastart = get();
            if (datastart != null) {
                datastart.dispose();
            }
            DisposableHelper.replace(this, this.worker.valueOf(this, this.timeout, this.unit));
        }

        @Override // java.lang.Runnable
        public void run() {
            this.gate = false;
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // o.IdlingResource
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // o.dataStart
        public void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.worker.isDisposed();
        }
    }
}
