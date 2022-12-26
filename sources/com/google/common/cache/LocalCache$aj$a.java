package com.google.common.cache;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;
import o.setBackgroundThreadExecutor;
/* loaded from: classes7.dex */
public interface LocalCache$aj$a<K, V> {
    int ag$a();

    LocalCache$aj$a<K, V> ah$a(ReferenceQueue<V> referenceQueue, V v, setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor);

    boolean ah$a();

    V ah$b() throws ExecutionException;

    V get();

    void toString(V v);

    setBackgroundThreadExecutor<K, V> valueOf();

    boolean values();
}
