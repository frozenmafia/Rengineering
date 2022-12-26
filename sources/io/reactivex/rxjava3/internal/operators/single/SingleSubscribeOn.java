package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.decrement;
import o.getLoopers;
import o.onTransitionToIdle;
/* loaded from: classes7.dex */
public final class SingleSubscribeOn<T> extends onTransitionToIdle<T> {
    final getLoopers toString;
    final decrement<? extends T> valueOf;

    @Override // o.onTransitionToIdle
    public void toString(IdlingResource.ResourceCallback<? super T> resourceCallback) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(resourceCallback, this.valueOf);
        resourceCallback.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.task.replace(this.toString.values(subscribeOnObserver));
    }

    /* loaded from: classes7.dex */
    static final class SubscribeOnObserver<T> extends AtomicReference<dataStart> implements IdlingResource.ResourceCallback<T>, dataStart, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final IdlingResource.ResourceCallback<? super T> downstream;
        final decrement<? extends T> source;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnObserver(IdlingResource.ResourceCallback<? super T> resourceCallback, decrement<? extends T> decrementVar) {
            this.downstream = resourceCallback;
            this.source = decrementVar;
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            DisposableHelper.setOnce(this, datastart);
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.values(this);
        }
    }
}
