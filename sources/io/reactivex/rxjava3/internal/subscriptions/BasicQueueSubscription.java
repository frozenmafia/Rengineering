package io.reactivex.rxjava3.internal.subscriptions;

import java.util.concurrent.atomic.AtomicLong;
import o.endVector;
/* loaded from: classes7.dex */
public abstract class BasicQueueSubscription<T> extends AtomicLong implements endVector<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // o.putByte
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
