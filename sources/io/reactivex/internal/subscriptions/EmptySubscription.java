package io.reactivex.internal.subscriptions;

import o.dependencies;
import o.registerConfigurationChangeListener;
/* loaded from: classes5.dex */
public enum EmptySubscription implements dependencies<Object> {
    INSTANCE;

    @Override // o.getSidecarVersion
    public void cancel() {
    }

    @Override // o.elevationSupported
    public void clear() {
    }

    @Override // o.elevationSupported
    public boolean isEmpty() {
        return true;
    }

    @Override // o.elevationSupported
    public Object poll() {
        return null;
    }

    @Override // o.e
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    public static void error(Throwable th, registerConfigurationChangeListener<?> registerconfigurationchangelistener) {
        registerconfigurationchangelistener.onSubscribe(INSTANCE);
        registerconfigurationchangelistener.onError(th);
    }

    public static void complete(registerConfigurationChangeListener<?> registerconfigurationchangelistener) {
        registerconfigurationchangelistener.onSubscribe(INSTANCE);
        registerconfigurationchangelistener.onComplete();
    }

    @Override // o.elevationSupported
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
