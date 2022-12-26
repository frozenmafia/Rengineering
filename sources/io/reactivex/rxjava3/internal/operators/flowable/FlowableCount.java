package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o.SwipeRefreshLayout;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.required;
/* loaded from: classes7.dex */
public final class FlowableCount<T> extends required<T, Long> {
    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super Long> registerconfigurationchangelistener) {
        this.ag$a.values(new CountSubscriber(registerconfigurationchangelistener));
    }

    /* loaded from: classes7.dex */
    static final class CountSubscriber extends DeferredScalarSubscription<Long> implements SwipeRefreshLayout.AnonymousClass5<Object> {
        private static final long serialVersionUID = 4973004223787171406L;
        long count;
        getSidecarVersion upstream;

        CountSubscriber(registerConfigurationChangeListener<? super Long> registerconfigurationchangelistener) {
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
        public void onNext(Object obj) {
            this.count++;
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            complete(Long.valueOf(this.count));
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, o.getSidecarVersion
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }
}
