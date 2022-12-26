package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.operators.flowable.FlowablePublishMulticast;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import o.SupportSQLiteOpenHelper;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
final class FlowablePublishMulticast$ag$a<R> implements SupportSQLiteOpenHelper<R>, getSidecarVersion {
    final registerConfigurationChangeListener<? super R> ag$a;
    getSidecarVersion ah$a;
    final FlowablePublishMulticast.toString<?> valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowablePublishMulticast$ag$a(registerConfigurationChangeListener<? super R> registerconfigurationchangelistener, FlowablePublishMulticast.toString<?> tostring) {
        this.ag$a = registerconfigurationchangelistener;
        this.valueOf = tostring;
    }

    @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        if (SubscriptionHelper.validate(this.ah$a, getsidecarversion)) {
            this.ah$a = getsidecarversion;
            this.ag$a.onSubscribe(this);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(R r) {
        this.ag$a.onNext(r);
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        this.ag$a.onError(th);
        this.valueOf.dispose();
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        this.ag$a.onComplete();
        this.valueOf.dispose();
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
        this.ah$a.request(j);
    }

    @Override // o.getSidecarVersion
    public void cancel() {
        this.ah$a.cancel();
        this.valueOf.dispose();
    }
}
