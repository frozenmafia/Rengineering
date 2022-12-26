package com.facebook.imagepipeline.cache;

import com.facebook.imagepipeline.image.CloseableImage;
import o.requireActivity;
/* loaded from: classes4.dex */
public class InstrumentedMemoryCacheBitmapMemoryCacheFactory {
    public static InstrumentedMemoryCache<requireActivity, CloseableImage> get(MemoryCache<requireActivity, CloseableImage> memoryCache, final ImageCacheStatsTracker imageCacheStatsTracker) {
        imageCacheStatsTracker.registerBitmapMemoryCache(memoryCache);
        return new InstrumentedMemoryCache<>(memoryCache, new MemoryCacheTracker<requireActivity>() { // from class: com.facebook.imagepipeline.cache.InstrumentedMemoryCacheBitmapMemoryCacheFactory.1
            @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
            public void onCacheHit(requireActivity requireactivity) {
                ImageCacheStatsTracker.this.onBitmapCacheHit(requireactivity);
            }

            @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
            public void onCacheMiss(requireActivity requireactivity) {
                ImageCacheStatsTracker.this.onBitmapCacheMiss(requireactivity);
            }

            @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
            public void onCachePut(requireActivity requireactivity) {
                ImageCacheStatsTracker.this.onBitmapCachePut(requireactivity);
            }
        });
    }
}
