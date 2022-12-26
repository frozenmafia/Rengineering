package com.google.common.cache;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import o.setBackgroundThreadExecutor;
/* loaded from: classes7.dex */
class LocalCache$HaptikSDK$a<K, V> extends SoftReference<V> implements LocalCache$aj$a<K, V> {
    final setBackgroundThreadExecutor<K, V> ah$a;

    public int ag$a() {
        return 1;
    }

    @Override // com.google.common.cache.LocalCache$aj$a
    public boolean ah$a() {
        return true;
    }

    @Override // com.google.common.cache.LocalCache$aj$a
    public void toString(V v) {
    }

    @Override // com.google.common.cache.LocalCache$aj$a
    public boolean values() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocalCache$HaptikSDK$a(ReferenceQueue<V> referenceQueue, V v, setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor) {
        super(v, referenceQueue);
        this.ah$a = setbackgroundthreadexecutor;
    }

    @Override // com.google.common.cache.LocalCache$aj$a
    public setBackgroundThreadExecutor<K, V> valueOf() {
        return this.ah$a;
    }

    public LocalCache$aj$a<K, V> ah$a(ReferenceQueue<V> referenceQueue, V v, setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor) {
        return new LocalCache$HaptikSDK$a(referenceQueue, v, setbackgroundthreadexecutor);
    }

    @Override // com.google.common.cache.LocalCache$aj$a
    public V ah$b() {
        return get();
    }
}
