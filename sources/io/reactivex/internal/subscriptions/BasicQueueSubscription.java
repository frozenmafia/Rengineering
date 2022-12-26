package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicLong;
import o.dependencies;
/* loaded from: classes7.dex */
public abstract class BasicQueueSubscription<T> extends AtomicLong implements dependencies<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // o.elevationSupported
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
