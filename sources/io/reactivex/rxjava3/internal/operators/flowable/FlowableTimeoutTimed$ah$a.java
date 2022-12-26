package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import o.SwipeRefreshLayout;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
final class FlowableTimeoutTimed$ah$a<T> implements SwipeRefreshLayout.AnonymousClass5<T> {
    final SubscriptionArbiter ah$a;
    final registerConfigurationChangeListener<? super T> valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowableTimeoutTimed$ah$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, SubscriptionArbiter subscriptionArbiter) {
        this.valueOf = registerconfigurationchangelistener;
        this.ah$a = subscriptionArbiter;
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        this.ah$a.setSubscription(getsidecarversion);
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        this.valueOf.onNext(t);
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        this.valueOf.onError(th);
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        this.valueOf.onComplete();
    }
}
