package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import o.IdlingRegistry;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class MaybeToFlowable<T> extends SwipeRefreshLayout.AnonymousClass2<T> {
    final SwipeRefreshLayout.SavedState<T> ag$a;

    public MaybeToFlowable(SwipeRefreshLayout.SavedState<T> savedState) {
        this.ag$a = savedState;
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.ag$a.ag$a(new MaybeToFlowableSubscriber(registerconfigurationchangelistener));
    }

    /* loaded from: classes7.dex */
    static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements IdlingRegistry<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        dataStart upstream;

        MaybeToFlowableSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
            super(registerconfigurationchangelistener);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.validate(this.upstream, datastart)) {
                this.upstream = datastart;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            complete(t);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.IdlingRegistry
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, o.getSidecarVersion
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }
    }
}
