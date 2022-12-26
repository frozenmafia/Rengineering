package com.nytimes.android.external.cache;

import com.nytimes.android.external.cache.LocalCache;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public interface LocalCache$ah$b<K, V> {
    long getAccessTime();

    int getHash();

    K getKey();

    LocalCache$ah$b<K, V> getNext();

    LocalCache$ah$b<K, V> getNextInAccessQueue();

    LocalCache$ah$b<K, V> getNextInWriteQueue();

    LocalCache$ah$b<K, V> getPreviousInAccessQueue();

    LocalCache$ah$b<K, V> getPreviousInWriteQueue();

    LocalCache.ak<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long j);

    void setNextInAccessQueue(LocalCache$ah$b<K, V> localCache$ah$b);

    void setNextInWriteQueue(LocalCache$ah$b<K, V> localCache$ah$b);

    void setPreviousInAccessQueue(LocalCache$ah$b<K, V> localCache$ah$b);

    void setPreviousInWriteQueue(LocalCache$ah$b<K, V> localCache$ah$b);

    void setValueReference(LocalCache.ak<K, V> akVar);

    void setWriteTime(long j);
}
