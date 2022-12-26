package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import o.SupportSQLiteOpenHelper;
import o.getArrowHeight;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class FlowableCount<T> extends getArrowHeight<T, Long> {
    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super Long> registerconfigurationchangelistener) {
        this.valueOf.ah$a(new CountSubscriber(registerconfigurationchangelistener));
    }

    /* loaded from: classes7.dex */
    static final class CountSubscriber extends DeferredScalarSubscription<Long> implements SupportSQLiteOpenHelper<Object> {
        private static final long serialVersionUID = 4973004223787171406L;
        long count;
        getSidecarVersion upstream;

        CountSubscriber(registerConfigurationChangeListener<? super Long> registerconfigurationchangelistener) {
            super(registerconfigurationchangelistener);
        }

        @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
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

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, o.getSidecarVersion
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }
}
