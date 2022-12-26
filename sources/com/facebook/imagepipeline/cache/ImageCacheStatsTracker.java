package com.facebook.imagepipeline.cache;

import o.requireActivity;
/* loaded from: classes4.dex */
public interface ImageCacheStatsTracker {
    void onBitmapCacheHit(requireActivity requireactivity);

    void onBitmapCacheMiss(requireActivity requireactivity);

    void onBitmapCachePut(requireActivity requireactivity);

    void onDiskCacheGetFail(requireActivity requireactivity);

    void onDiskCacheHit(requireActivity requireactivity);

    void onDiskCacheMiss(requireActivity requireactivity);

    void onDiskCachePut(requireActivity requireactivity);

    void onMemoryCacheHit(requireActivity requireactivity);

    void onMemoryCacheMiss(requireActivity requireactivity);

    void onMemoryCachePut(requireActivity requireactivity);

    void onStagingAreaHit(requireActivity requireactivity);

    void onStagingAreaMiss(requireActivity requireactivity);

    void registerBitmapMemoryCache(MemoryCache<?, ?> memoryCache);

    void registerEncodedMemoryCache(MemoryCache<?, ?> memoryCache);
}
