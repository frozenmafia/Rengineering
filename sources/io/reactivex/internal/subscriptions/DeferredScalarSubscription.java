package io.reactivex.internal.subscriptions;

import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    static final int CANCELLED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2151279923272604993L;
    protected final registerConfigurationChangeListener<? super T> downstream;
    protected T value;

    public DeferredScalarSubscription(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.downstream = registerconfigurationchangelistener;
    }

    @Override // o.getSidecarVersion
    public final void request(long j) {
        T t;
        if (SubscriptionHelper.validate(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (t = this.value) == null) {
                        return;
                    }
                    this.value = null;
                    registerConfigurationChangeListener<? super T> registerconfigurationchangelistener = this.downstream;
                    registerconfigurationchangelistener.onNext(t);
                    if (get() != 4) {
                        registerconfigurationchangelistener.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void complete(T t) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                registerConfigurationChangeListener<? super T> registerconfigurationchangelistener = this.downstream;
                registerconfigurationchangelistener.onNext(t);
                if (get() != 4) {
                    registerconfigurationchangelistener.onComplete();
                    return;
                }
                return;
            }
            this.value = t;
            if (compareAndSet(0, 1)) {
                return;
            }
            i = get();
            if (i == 4) {
                this.value = null;
                return;
            }
        }
        this.value = t;
        lazySet(16);
        registerConfigurationChangeListener<? super T> registerconfigurationchangelistener2 = this.downstream;
        registerconfigurationchangelistener2.onNext(t);
        if (get() != 4) {
            registerconfigurationchangelistener2.onComplete();
        }
    }

    @Override // o.e
    public final int requestFusion(int i) {
        if ((i & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }

    @Override // o.elevationSupported
    public final T poll() {
        if (get() == 16) {
            lazySet(32);
            T t = this.value;
            this.value = null;
            return t;
        }
        return null;
    }

    @Override // o.elevationSupported
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // o.elevationSupported
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public void cancel() {
        set(4);
        this.value = null;
    }

    public final boolean isCancelled() {
        return get() == 4;
    }

    public final boolean tryCancel() {
        return getAndSet(4) != 4;
    }
}
