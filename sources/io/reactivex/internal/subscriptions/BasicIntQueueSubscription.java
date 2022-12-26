package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import o.dependencies;
/* loaded from: classes5.dex */
public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements dependencies<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // o.elevationSupported
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
