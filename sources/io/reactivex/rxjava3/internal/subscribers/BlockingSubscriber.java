package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.getSidecarVersion;
/* loaded from: classes7.dex */
public final class BlockingSubscriber<T> extends AtomicReference<getSidecarVersion> implements SwipeRefreshLayout.AnonymousClass5<T>, getSidecarVersion {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingSubscriber(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        if (SubscriptionHelper.setOnce(this, getsidecarversion)) {
            this.queue.offer(NotificationLite.subscription(this));
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
        get().request(j);
    }

    @Override // o.getSidecarVersion
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public boolean isCancelled() {
        return get() == SubscriptionHelper.CANCELLED;
    }
}
