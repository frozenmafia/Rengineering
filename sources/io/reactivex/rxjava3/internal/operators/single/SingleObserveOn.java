package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.decrement;
import o.getLoopers;
import o.onTransitionToIdle;
/* loaded from: classes7.dex */
public final class SingleObserveOn<T> extends onTransitionToIdle<T> {
    final getLoopers ah$a;
    final decrement<T> values;

    @Override // o.onTransitionToIdle
    public void toString(IdlingResource.ResourceCallback<? super T> resourceCallback) {
        this.values.values(new ObserveOnSingleObserver(resourceCallback, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class ObserveOnSingleObserver<T> extends AtomicReference<dataStart> implements IdlingResource.ResourceCallback<T>, dataStart, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final IdlingResource.ResourceCallback<? super T> downstream;
        Throwable error;
        final getLoopers scheduler;
        T value;

        ObserveOnSingleObserver(IdlingResource.ResourceCallback<? super T> resourceCallback, getLoopers getloopers) {
            this.downstream = resourceCallback;
            this.scheduler = getloopers;
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.setOnce(this, datastart)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            this.value = t;
            DisposableHelper.replace(this, this.scheduler.values(this));
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.values(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onSuccess((T) this.value);
            }
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }
}
