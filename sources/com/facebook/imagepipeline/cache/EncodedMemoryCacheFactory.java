package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.PooledByteBuffer;
import o.requireActivity;
/* loaded from: classes4.dex */
public class EncodedMemoryCacheFactory {
    public static InstrumentedMemoryCache<requireActivity, PooledByteBuffer> get(MemoryCache<requireActivity, PooledByteBuffer> memoryCache, final ImageCacheStatsTracker imageCacheStatsTracker) {
        imageCacheStatsTracker.registerEncodedMemoryCache(memoryCache);
        return new InstrumentedMemoryCache<>(memoryCache, new MemoryCacheTracker<requireActivity>() { // from class: com.facebook.imagepipeline.cache.EncodedMemoryCacheFactory.1
            @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
            public void onCacheHit(requireActivity requireactivity) {
                ImageCacheStatsTracker.this.onMemoryCacheHit(requireactivity);
            }

            @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
            public void onCacheMiss(requireActivity requireactivity) {
                ImageCacheStatsTracker.this.onMemoryCacheMiss(requireactivity);
            }

            @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
            public void onCachePut(requireActivity requireactivity) {
                ImageCacheStatsTracker.this.onMemoryCachePut(requireactivity);
            }
        });
    }
}
