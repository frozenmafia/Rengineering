package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.sdkAdded;
/* loaded from: classes5.dex */
public class StrictSubscriber<T> extends AtomicInteger implements SwipeRefreshLayout.AnonymousClass5<T>, getSidecarVersion {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final registerConfigurationChangeListener<? super T> downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<getSidecarVersion> upstream = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();

    public StrictSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.downstream = registerconfigurationchangelistener;
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }

    @Override // o.getSidecarVersion
    public void cancel() {
        if (this.done) {
            return;
        }
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, getsidecarversion);
            return;
        }
        getsidecarversion.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        sdkAdded.values(this.downstream, t, this, this.error);
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        this.done = true;
        sdkAdded.ah$a(this.downstream, th, this, this.error);
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        this.done = true;
        sdkAdded.valueOf(this.downstream, this, this.error);
    }
}
