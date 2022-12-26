package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.dataStart;
import o.getSidecarVersion;
/* loaded from: classes7.dex */
public final class AsyncSubscription extends AtomicLong implements getSidecarVersion, dataStart {
    private static final long serialVersionUID = 7028635084060361255L;
    final AtomicReference<getSidecarVersion> actual;
    final AtomicReference<dataStart> resource;

    public AsyncSubscription() {
        this.resource = new AtomicReference<>();
        this.actual = new AtomicReference<>();
    }

    public AsyncSubscription(dataStart datastart) {
        this();
        this.resource.lazySet(datastart);
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.actual, this, j);
    }

    @Override // o.getSidecarVersion
    public void cancel() {
        dispose();
    }

    @Override // o.dataStart
    public void dispose() {
        SubscriptionHelper.cancel(this.actual);
        DisposableHelper.dispose(this.resource);
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return this.actual.get() == SubscriptionHelper.CANCELLED;
    }

    public boolean setResource(dataStart datastart) {
        return DisposableHelper.set(this.resource, datastart);
    }

    public boolean replaceResource(dataStart datastart) {
        return DisposableHelper.replace(this.resource, datastart);
    }

    public void setSubscription(getSidecarVersion getsidecarversion) {
        SubscriptionHelper.deferredSetOnce(this.actual, this, getsidecarversion);
    }
}
