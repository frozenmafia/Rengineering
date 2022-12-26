package com.nytimes.android.external.cache;

import com.nytimes.android.external.cache.LocalCache;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class LocalCache$HaptikSDK$e<K, V> extends SoftReference<V> implements LocalCache.ak<K, V> {
    final LocalCache$ah$b<K, V> ag$a;

    public int ag$a() {
        return 1;
    }

    @Override // com.nytimes.android.external.cache.LocalCache.ak
    public void ah$a(V v) {
    }

    @Override // com.nytimes.android.external.cache.LocalCache.ak
    public boolean ah$a() {
        return true;
    }

    @Override // com.nytimes.android.external.cache.LocalCache.ak
    public boolean valueOf() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocalCache$HaptikSDK$e(ReferenceQueue<V> referenceQueue, V v, LocalCache$ah$b<K, V> localCache$ah$b) {
        super(v, referenceQueue);
        this.ag$a = localCache$ah$b;
    }

    @Override // com.nytimes.android.external.cache.LocalCache.ak
    public LocalCache$ah$b<K, V> values() {
        return this.ag$a;
    }

    public LocalCache.ak<K, V> values(ReferenceQueue<V> referenceQueue, V v, LocalCache$ah$b<K, V> localCache$ah$b) {
        return new LocalCache$HaptikSDK$e(referenceQueue, v, localCache$ah$b);
    }

    @Override // com.nytimes.android.external.cache.LocalCache.ak
    public V HaptikSDK$c() {
        return get();
    }
}
