package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import o.IdlingResource;
import o.dataStart;
import o.registerLooperAsIdlingResource;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableRepeat<T> extends startObject<T, T> {
    final long values;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        idlingResource.onSubscribe(sequentialDisposable);
        long j = this.values;
        new RepeatObserver(idlingResource, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, sequentialDisposable, this.valueOf).subscribeNext();
    }

    /* loaded from: classes7.dex */
    static final class RepeatObserver<T> extends AtomicInteger implements IdlingResource<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final IdlingResource<? super T> downstream;
        long remaining;
        final SequentialDisposable sd;
        final registerLooperAsIdlingResource<? extends T> source;

        RepeatObserver(IdlingResource<? super T> idlingResource, long j, SequentialDisposable sequentialDisposable, registerLooperAsIdlingResource<? extends T> registerlooperasidlingresource) {
            this.downstream = idlingResource;
            this.sd = sequentialDisposable;
            this.source = registerlooperasidlingresource;
            this.remaining = j;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            this.sd.replace(datastart);
        }

        @Override // o.IdlingResource
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.IdlingResource
        public void onComplete() {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.sd.isDisposed()) {
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
