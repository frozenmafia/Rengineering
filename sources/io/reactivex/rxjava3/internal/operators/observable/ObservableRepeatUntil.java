package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import o.FlatBufferBuilder;
import o.IdlingResource;
import o.addLong;
import o.dataStart;
import o.registerLooperAsIdlingResource;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableRepeatUntil<T> extends startObject<T, T> {
    final addLong ag$a;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        idlingResource.onSubscribe(sequentialDisposable);
        new RepeatUntilObserver(idlingResource, this.ag$a, sequentialDisposable, this.valueOf).subscribeNext();
    }

    /* loaded from: classes7.dex */
    static final class RepeatUntilObserver<T> extends AtomicInteger implements IdlingResource<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final IdlingResource<? super T> downstream;
        final registerLooperAsIdlingResource<? extends T> source;
        final addLong stop;
        final SequentialDisposable upstream;

        RepeatUntilObserver(IdlingResource<? super T> idlingResource, addLong addlong, SequentialDisposable sequentialDisposable, registerLooperAsIdlingResource<? extends T> registerlooperasidlingresource) {
            this.downstream = idlingResource;
            this.upstream = sequentialDisposable;
            this.source = registerlooperasidlingresource;
            this.stop = addlong;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            this.upstream.replace(datastart);
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
            try {
                if (this.stop.getAsBoolean()) {
                    this.downstream.onComplete();
                } else {
                    subscribeNext();
                }
            } catch (Throwable th) {
                FlatBufferBuilder.ah$a(th);
                this.downstream.onError(th);
            }
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }
}
