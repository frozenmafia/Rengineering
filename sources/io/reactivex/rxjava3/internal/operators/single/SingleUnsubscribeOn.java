package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.decrement;
import o.getLoopers;
import o.onTransitionToIdle;
/* loaded from: classes7.dex */
public final class SingleUnsubscribeOn<T> extends onTransitionToIdle<T> {
    final decrement<T> ah$a;
    final getLoopers values;

    @Override // o.onTransitionToIdle
    public void toString(IdlingResource.ResourceCallback<? super T> resourceCallback) {
        this.ah$a.values(new UnsubscribeOnSingleObserver(resourceCallback, this.values));
    }

    /* loaded from: classes7.dex */
    static final class UnsubscribeOnSingleObserver<T> extends AtomicReference<dataStart> implements IdlingResource.ResourceCallback<T>, dataStart, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;
        final IdlingResource.ResourceCallback<? super T> downstream;
        dataStart ds;
        final getLoopers scheduler;

        UnsubscribeOnSingleObserver(IdlingResource.ResourceCallback<? super T> resourceCallback, getLoopers getloopers) {
            this.downstream = resourceCallback;
            this.scheduler = getloopers;
        }

        @Override // o.dataStart
        public void dispose() {
            dataStart andSet = getAndSet(DisposableHelper.DISPOSED);
            if (andSet != DisposableHelper.DISPOSED) {
                this.ds = andSet;
                this.scheduler.values(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.ds.dispose();
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.setOnce(this, datastart)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }
    }
}
