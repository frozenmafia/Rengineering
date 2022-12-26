package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.MemoryTrimType;
import o.Fragment;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class InstrumentedMemoryCache<K, V> implements MemoryCache<K, V> {
    private final MemoryCache<K, V> mDelegate;
    private final MemoryCacheTracker mTracker;

    public InstrumentedMemoryCache(MemoryCache<K, V> memoryCache, MemoryCacheTracker memoryCacheTracker) {
        this.mDelegate = memoryCache;
        this.mTracker = memoryCacheTracker;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public FragmentActivity.AnonymousClass1<V> get(K k) {
        FragmentActivity.AnonymousClass1<V> anonymousClass1 = this.mDelegate.get(k);
        if (anonymousClass1 == null) {
            this.mTracker.onCacheMiss(k);
        } else {
            this.mTracker.onCacheHit(k);
        }
        return anonymousClass1;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public V inspect(K k) {
        return this.mDelegate.inspect(k);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public void probe(K k) {
        this.mDelegate.probe(k);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public FragmentActivity.AnonymousClass1<V> cache(K k, FragmentActivity.AnonymousClass1<V> anonymousClass1) {
        this.mTracker.onCachePut(k);
        return this.mDelegate.cache(k, anonymousClass1);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public int removeAll(Fragment.InstantiationException<K> instantiationException) {
        return this.mDelegate.removeAll(instantiationException);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public boolean contains(Fragment.InstantiationException<K> instantiationException) {
        return this.mDelegate.contains((Fragment.InstantiationException) instantiationException);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public boolean contains(K k) {
        return this.mDelegate.contains((MemoryCache<K, V>) k);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public int getCount() {
        return this.mDelegate.getCount();
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public int getSizeInBytes() {
        return this.mDelegate.getSizeInBytes();
    }

    @Override // o.onNewIntent
    public void trim(MemoryTrimType memoryTrimType) {
        this.mDelegate.trim(memoryTrimType);
    }

    @Override // o.requireArguments
    public String getDebugData() {
        return this.mDelegate.getDebugData();
    }
}
