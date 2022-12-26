package com.google.common.cache;

import java.util.AbstractMap;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final RemovalCause cause;

    public static <K, V> RemovalNotification<K, V> create(K k, V v, RemovalCause removalCause) {
        return new RemovalNotification<>(k, v, removalCause);
    }

    private RemovalNotification(K k, V v, RemovalCause removalCause) {
        super(k, v);
        this.cause = (RemovalCause) markViewHoldersUpdated.toString(removalCause);
    }

    public RemovalCause getCause() {
        return this.cause;
    }

    public boolean wasEvicted() {
        return this.cause.wasEvicted();
    }
}
