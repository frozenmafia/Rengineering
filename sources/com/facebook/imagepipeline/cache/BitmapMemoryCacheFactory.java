package com.facebook.imagepipeline.cache;

import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import o.getSupportLoaderManager;
import o.onStartEnterTransition;
import o.requireActivity;
/* loaded from: classes4.dex */
public interface BitmapMemoryCacheFactory {
    CountingMemoryCache<requireActivity, CloseableImage> create(onStartEnterTransition<MemoryCacheParams> onstartentertransition, getSupportLoaderManager getsupportloadermanager, MemoryCache.CacheTrimStrategy cacheTrimStrategy, boolean z, boolean z2, CountingMemoryCache.EntryStateObserver<requireActivity> entryStateObserver);
}
