package io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;
import o.StartupLogger;
/* loaded from: classes5.dex */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements StartupLogger<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // o.elevationSupported
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
