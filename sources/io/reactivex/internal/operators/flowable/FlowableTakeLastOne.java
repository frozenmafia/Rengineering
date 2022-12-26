package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import o.SupportSQLiteOpenHelper;
import o.getArrowHeight;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class FlowableTakeLastOne<T> extends getArrowHeight<T, T> {
    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.valueOf.ah$a(new TakeLastOneSubscriber(registerconfigurationchangelistener));
    }

    /* loaded from: classes7.dex */
    static final class TakeLastOneSubscriber<T> extends DeferredScalarSubscription<T> implements SupportSQLiteOpenHelper<T> {
        private static final long serialVersionUID = -5467847744262967226L;
        getSidecarVersion upstream;

        TakeLastOneSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
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

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, o.getSidecarVersion
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }
}
