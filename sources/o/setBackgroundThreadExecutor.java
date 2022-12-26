package o;

import com.google.common.cache.LocalCache$aj$a;
/* loaded from: classes7.dex */
public interface setBackgroundThreadExecutor<K, V> {
    long getAccessTime();

    int getHash();

    K getKey();

    setBackgroundThreadExecutor<K, V> getNext();

    setBackgroundThreadExecutor<K, V> getNextInAccessQueue();

    setBackgroundThreadExecutor<K, V> getNextInWriteQueue();

    setBackgroundThreadExecutor<K, V> getPreviousInAccessQueue();

    setBackgroundThreadExecutor<K, V> getPreviousInWriteQueue();

    LocalCache$aj$a<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long j);

    void setNextInAccessQueue(setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor);

    void setNextInWriteQueue(setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor);

    void setPreviousInAccessQueue(setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor);

    void setPreviousInWriteQueue(setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor);

    void setValueReference(LocalCache$aj$a<K, V> localCache$aj$a);

    void setWriteTime(long j);
}
