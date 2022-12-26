package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSubscribeOn;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.getLoopers;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableSubscribeOn<T> extends startObject<T, T> {
    final getLoopers values;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        final SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(idlingResource);
        idlingResource.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.setDisposable(this.values.values(new Runnable(subscribeOnObserver) { // from class: io.reactivex.rxjava3.internal.operators.observable.ObservableSubscribeOn$ah$a
            private final ObservableSubscribeOn.SubscribeOnObserver<T> ah$a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.ah$a = subscribeOnObserver;
            }

            @Override // java.lang.Runnable
            public void run() {
                ObservableSubscribeOn.this.valueOf.subscribe(this.ah$a);
            }
        }));
    }

    /* loaded from: classes7.dex */
    static final class SubscribeOnObserver<T> extends AtomicReference<dataStart> implements IdlingResource<T>, dataStart {
        private static final long serialVersionUID = 8094547886072529208L;
        final IdlingResource<? super T> downstream;
        final AtomicReference<dataStart> upstream = new AtomicReference<>();

        SubscribeOnObserver(IdlingResource<? super T> idlingResource) {
            this.downstream = idlingResource;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            DisposableHelper.setOnce(this.upstream, datastart);
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
            this.downstream.onComplete();
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        void setDisposable(dataStart datastart) {
            DisposableHelper.setOnce(this, datastart);
        }
    }
}
