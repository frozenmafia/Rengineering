package com.google.common.collect;

import java.io.Serializable;
import o.getBackgroundThreadExecutor;
/* loaded from: classes5.dex */
class ImmutableEntry<K, V> extends getBackgroundThreadExecutor<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final K key;
    final V value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmutableEntry(K k, V v) {
        this.key = k;
        this.value = v;
    }

    @Override // o.getBackgroundThreadExecutor, java.util.Map.Entry
    public final K getKey() {
        return this.key;
    }

    @Override // o.getBackgroundThreadExecutor, java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // o.getBackgroundThreadExecutor, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
