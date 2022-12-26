package com.google.common.collect;

import o.getBackgroundThreadExecutor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class LinkedListMultimap$ah$b<K, V> extends getBackgroundThreadExecutor<K, V> {
    V HaptikSDK$c;
    final K ag$a;
    LinkedListMultimap$ah$b<K, V> ah$a;
    LinkedListMultimap$ah$b<K, V> toString;
    LinkedListMultimap$ah$b<K, V> valueOf;
    LinkedListMultimap$ah$b<K, V> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkedListMultimap$ah$b(K k, V v) {
        this.ag$a = k;
        this.HaptikSDK$c = v;
    }

    @Override // o.getBackgroundThreadExecutor, java.util.Map.Entry
    public K getKey() {
        return this.ag$a;
    }

    @Override // o.getBackgroundThreadExecutor, java.util.Map.Entry
    public V getValue() {
        return this.HaptikSDK$c;
    }

    @Override // o.getBackgroundThreadExecutor, java.util.Map.Entry
    public V setValue(V v) {
        V v2 = this.HaptikSDK$c;
        this.HaptikSDK$c = v;
        return v2;
    }
}
