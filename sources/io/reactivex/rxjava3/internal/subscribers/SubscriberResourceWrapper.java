package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<dataStart> implements SwipeRefreshLayout.AnonymousClass5<T>, dataStart, getSidecarVersion {
    private static final long serialVersionUID = -8612022020200669122L;
    final registerConfigurationChangeListener<? super T> downstream;
    final AtomicReference<getSidecarVersion> upstream = new AtomicReference<>();

    public SubscriberResourceWrapper(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.downstream = registerconfigurationchangelistener;
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        if (SubscriptionHelper.setOnce(this.upstream, getsidecarversion)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            this.upstream.get().request(j);
        }
    }

    @Override // o.dataStart
    public void dispose() {
        SubscriptionHelper.cancel(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // o.getSidecarVersion
    public void cancel() {
        dispose();
    }

    public void setResource(dataStart datastart) {
        DisposableHelper.set(this, datastart);
    }
}
