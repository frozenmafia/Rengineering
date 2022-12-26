package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import o.AsyncListUtil;
import o.flushTileCache;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
public final class EvictingQueue<E> extends flushTileCache<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Queue<E> delegate;
    final int maxSize;

    private EvictingQueue(int i) {
        markViewHoldersUpdated.values(i >= 0, "maxSize (%s) must >= 0", i);
        this.delegate = new ArrayDeque(i);
        this.maxSize = i;
    }

    public static <E> EvictingQueue<E> create(int i) {
        return new EvictingQueue<>(i);
    }

    public int remainingCapacity() {
        return this.maxSize - size();
    }

    @Override // o.flushTileCache, o.updateRange, o.removeTile
    public Queue<E> delegate() {
        return this.delegate;
    }

    @Override // o.flushTileCache, java.util.Queue
    public boolean offer(E e) {
        return add(e);
    }

    @Override // o.updateRange, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        markViewHoldersUpdated.toString(e);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e);
        return true;
    }

    @Override // o.updateRange, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size >= this.maxSize) {
            clear();
            return AsyncListUtil.DataCallback.ah$a((Collection) this, AsyncListUtil.DataCallback.toString(collection, size - this.maxSize));
        }
        return standardAddAll(collection);
    }

    @Override // o.updateRange, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return super.toArray();
    }
}
