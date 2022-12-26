package io.reactivex.rxjava3.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import o.endVector;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements endVector<T> {
    static final int CANCELLED = 2;
    static final int NO_REQUEST = 0;
    static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    final registerConfigurationChangeListener<? super T> subscriber;
    final T value;

    @Override // o.notNested
    public int requestFusion(int i) {
        return i & 1;
    }

    public ScalarSubscription(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, T t) {
        this.subscriber = registerconfigurationchangelistener;
        this.value = t;
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
        if (SubscriptionHelper.validate(j) && compareAndSet(0, 1)) {
            registerConfigurationChangeListener<? super T> registerconfigurationchangelistener = this.subscriber;
            registerconfigurationchangelistener.onNext((T) this.value);
            if (get() != 2) {
                registerconfigurationchangelistener.onComplete();
            }
        }
    }

    @Override // o.getSidecarVersion
    public void cancel() {
        lazySet(2);
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    @Override // o.putByte
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // o.putByte
    public T poll() {
        if (get() == 0) {
            lazySet(1);
            return this.value;
        }
        return null;
    }

    @Override // o.putByte
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // o.putByte
    public void clear() {
        lazySet(1);
    }
}
