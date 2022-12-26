package io.reactivex.rxjava3.internal.subscriptions;

import o.endVector;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public enum EmptySubscription implements endVector<Object> {
    INSTANCE;

    @Override // o.getSidecarVersion
    public void cancel() {
    }

    @Override // o.putByte
    public void clear() {
    }

    @Override // o.putByte
    public boolean isEmpty() {
        return true;
    }

    @Override // o.putByte
    public Object poll() {
        return null;
    }

    @Override // o.notNested
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

    @Override // o.putByte
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
