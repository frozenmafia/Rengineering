package com.google.common.cache;

import com.google.common.cache.LocalCache;
import o.setBackgroundThreadExecutor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class LocalCache$HaptikSDK$d<K, V> extends LocalCache.valueOf<K, V> {
    final int HaptikSDK$b;
    final setBackgroundThreadExecutor<K, V> HaptikSDK$c;
    volatile LocalCache$aj$a<K, V> ah$b = LocalCache.ah$a();
    final K invoke;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocalCache$HaptikSDK$d(K k, int i, setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor) {
        this.invoke = k;
        this.HaptikSDK$b = i;
        this.HaptikSDK$c = setbackgroundthreadexecutor;
    }

    @Override // com.google.common.cache.LocalCache.valueOf, o.setBackgroundThreadExecutor
    public K getKey() {
        return this.invoke;
    }

    @Override // com.google.common.cache.LocalCache.valueOf, o.setBackgroundThreadExecutor
    public LocalCache$aj$a<K, V> getValueReference() {
        return this.ah$b;
    }

    @Override // com.google.common.cache.LocalCache.valueOf, o.setBackgroundThreadExecutor
    public void setValueReference(LocalCache$aj$a<K, V> localCache$aj$a) {
        this.ah$b = localCache$aj$a;
    }

    @Override // com.google.common.cache.LocalCache.valueOf, o.setBackgroundThreadExecutor
    public int getHash() {
        return this.HaptikSDK$b;
    }

    @Override // com.google.common.cache.LocalCache.valueOf, o.setBackgroundThreadExecutor
    public setBackgroundThreadExecutor<K, V> getNext() {
        return this.HaptikSDK$c;
    }
}
