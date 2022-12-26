package com.facebook.imagepipeline.memory;

import java.util.HashSet;
import java.util.Set;
/* loaded from: classes4.dex */
public abstract class LruBucketsPoolBackend<T> implements PoolBackend<T> {
    private final Set<T> mCurrentItems = new HashSet();
    private final BucketMap<T> mMap = new BucketMap<>();

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    public T get(int i) {
        return maybeRemoveFromCurrentItems(this.mMap.acquire(i));
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    public void put(T t) {
        boolean add;
        synchronized (this) {
            add = this.mCurrentItems.add(t);
        }
        if (add) {
            this.mMap.release(getSize(t), t);
        }
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    public T pop() {
        return maybeRemoveFromCurrentItems(this.mMap.removeFromEnd());
    }

    private T maybeRemoveFromCurrentItems(T t) {
        if (t != null) {
            synchronized (this) {
                this.mCurrentItems.remove(t);
            }
        }
        return t;
    }

    int valueCount() {
        return this.mMap.valueCount();
    }
}
