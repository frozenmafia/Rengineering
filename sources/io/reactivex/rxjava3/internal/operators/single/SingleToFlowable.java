package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.decrement;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class SingleToFlowable<T> extends SwipeRefreshLayout.AnonymousClass2<T> {
    final decrement<? extends T> values;

    public SingleToFlowable(decrement<? extends T> decrementVar) {
        this.values = decrementVar;
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.values.values(new SingleToFlowableObserver(registerconfigurationchangelistener));
    }

    /* loaded from: classes7.dex */
    static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements IdlingResource.ResourceCallback<T> {
        private static final long serialVersionUID = 187782011903685568L;
        dataStart upstream;

        SingleToFlowableObserver(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
            super(registerconfigurationchangelistener);
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.validate(this.upstream, datastart)) {
                this.upstream = datastart;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            complete(t);
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, o.getSidecarVersion
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }
    }
}
