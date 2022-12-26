package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.addSourceSha;
import o.dataStart;
import o.registerLooperAsIdlingResource;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableSampleWithObservable<T> extends startObject<T, T> {
    final registerLooperAsIdlingResource<?> ag$a;
    final boolean toString;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        addSourceSha addsourcesha = new addSourceSha(idlingResource);
        if (this.toString) {
            this.valueOf.subscribe(new SampleMainEmitLast(addsourcesha, this.ag$a));
        } else {
            this.valueOf.subscribe(new SampleMainNoLast(addsourcesha, this.ag$a));
        }
    }

    /* loaded from: classes7.dex */
    static abstract class SampleMainObserver<T> extends AtomicReference<T> implements IdlingResource<T>, dataStart {
        private static final long serialVersionUID = -3517602651313910099L;
        final IdlingResource<? super T> downstream;
        final AtomicReference<dataStart> other = new AtomicReference<>();
        final registerLooperAsIdlingResource<?> sampler;
        dataStart upstream;

        abstract void completion();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract void run();

        SampleMainObserver(IdlingResource<? super T> idlingResource, registerLooperAsIdlingResource<?> registerlooperasidlingresource) {
            this.downstream = idlingResource;
            this.sampler = registerlooperasidlingresource;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.validate(this.upstream, datastart)) {
                this.upstream = datastart;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new IdlingResource<Object>(this) { // from class: io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable$ah$a
                        final ObservableSampleWithObservable.SampleMainObserver<T> values;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.values = this;
                        }

                        @Override // o.IdlingResource
                        public void onSubscribe(dataStart datastart2) {
                            this.values.setOther(datastart2);
                        }

                        @Override // o.IdlingResource
                        public void onNext(Object obj) {
                            this.values.run();
                        }

                        @Override // o.IdlingResource
                        public void onError(Throwable th) {
                            this.values.error(th);
                        }

                        @Override // o.IdlingResource
                        public void onComplete() {
                            this.values.complete();
                        }
                    });
                }
            }
        }

        @Override // o.IdlingResource
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.other);
            this.downstream.onError(th);
        }

        @Override // o.IdlingResource
        public void onComplete() {
            DisposableHelper.dispose(this.other);
            completion();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean setOther(dataStart datastart) {
            return DisposableHelper.setOnce(this.other, datastart);
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this.other);
            this.upstream.dispose();
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.other.get() == DisposableHelper.DISPOSED;
        }

        public void error(Throwable th) {
            this.upstream.dispose();
            this.downstream.onError(th);
        }

        public void complete() {
            this.upstream.dispose();
            completion();
        }

        void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }
    }

    /* loaded from: classes7.dex */
    static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        SampleMainNoLast(IdlingResource<? super T> idlingResource, registerLooperAsIdlingResource<?> registerlooperasidlingresource) {
            super(idlingResource, registerlooperasidlingresource);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void completion() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void run() {
            emit();
        }
    }

    /* loaded from: classes7.dex */
    static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final AtomicInteger wip;

        SampleMainEmitLast(IdlingResource<? super T> idlingResource, registerLooperAsIdlingResource<?> registerlooperasidlingresource) {
            super(idlingResource, registerlooperasidlingresource);
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void completion() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void run() {
            if (this.wip.getAndIncrement() == 0) {
                do {
                    boolean z = this.done;
                    emit();
                    if (z) {
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }
    }
}
