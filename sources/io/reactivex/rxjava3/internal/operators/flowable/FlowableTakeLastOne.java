package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o.SwipeRefreshLayout;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.required;
/* loaded from: classes7.dex */
public final class FlowableTakeLastOne<T> extends required<T, T> {
    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.ag$a.values(new TakeLastOneSubscriber(registerconfigurationchangelistener));
    }

    /* loaded from: classes7.dex */
    static final class TakeLastOneSubscriber<T> extends DeferredScalarSubscription<T> implements SwipeRefreshLayout.AnonymousClass5<T> {
        private static final long serialVersionUID = -5467847744262967226L;
        getSidecarVersion upstream;

        TakeLastOneSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
            super(registerconfigurationchangelistener);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
            if (SubscriptionHelper.validate(this.upstream, getsidecarversion)) {
                this.upstream = getsidecarversion;
                this.downstream.onSubscribe(this);
                getsidecarversion.request(Long.MAX_VALUE);
            }
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(T t) {
            this.value = t;
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            this.value = null;
            this.downstream.onError(th);
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            T t = this.value;
            if (t != null) {
                complete(t);
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, o.getSidecarVersion
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }
}
