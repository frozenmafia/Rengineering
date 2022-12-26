package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import o.getSidecarVersion;
/* loaded from: classes7.dex */
public final class BooleanSubscription extends AtomicBoolean implements getSidecarVersion {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // o.getSidecarVersion
    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    @Override // o.getSidecarVersion
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
