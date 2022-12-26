package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import o.SupportSQLiteOpenHelper;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements SupportSQLiteOpenHelper<T> {
    private static final long serialVersionUID = 2984505488220891551L;
    protected boolean hasValue;
    protected getSidecarVersion upstream;

    public DeferredScalarSubscriber(registerConfigurationChangeListener<? super R> registerconfigurationchangelistener) {
        super(registerconfigurationchangelistener);
    }

    public void onSubscribe(getSidecarVersion getsidecarversion) {
        if (SubscriptionHelper.validate(this.upstream, getsidecarversion)) {
            this.upstream = getsidecarversion;
            this.downstream.onSubscribe(this);
            getsidecarversion.request(Long.MAX_VALUE);
        }
    }

    public void onError(Throwable th) {
        this.value = null;
        this.downstream.onError(th);
    }

    public void onComplete() {
        if (this.hasValue) {
            complete(this.value);
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
