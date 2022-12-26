package com.facebook.imagepipeline.cache;

import o.requireActivity;
/* loaded from: classes4.dex */
public class NoOpImageCacheStatsTracker implements ImageCacheStatsTracker {
    private static NoOpImageCacheStatsTracker sInstance;

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onBitmapCacheHit(requireActivity requireactivity) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onBitmapCacheMiss(requireActivity requireactivity) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onBitmapCachePut(requireActivity requireactivity) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onDiskCacheGetFail(requireActivity requireactivity) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onDiskCacheHit(requireActivity requireactivity) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onDiskCacheMiss(requireActivity requireactivity) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onDiskCachePut(requireActivity requireactivity) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onMemoryCacheHit(requireActivity requireactivity) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onMemoryCacheMiss(requireActivity requireactivity) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onMemoryCachePut(requireActivity requireactivity) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onStagingAreaHit(requireActivity requireactivity) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onStagingAreaMiss(requireActivity requireactivity) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void registerBitmapMemoryCache(MemoryCache<?, ?> memoryCache) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void registerEncodedMemoryCache(MemoryCache<?, ?> memoryCache) {
    }

    private NoOpImageCacheStatsTracker() {
    }

    public static NoOpImageCacheStatsTracker getInstance() {
        NoOpImageCacheStatsTracker noOpImageCacheStatsTracker;
        synchronized (NoOpImageCacheStatsTracker.class) {
            if (sInstance == null) {
                sInstance = new NoOpImageCacheStatsTracker();
            }
            noOpImageCacheStatsTracker = sInstance;
        }
        return noOpImageCacheStatsTracker;
    }
}
