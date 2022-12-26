package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import o.FragmentActivity;
import o.requireActivity;
/* loaded from: classes4.dex */
public class BitmapMemoryCacheGetProducer extends BitmapMemoryCacheProducer {
    private static final String ORIGIN_SUBCATEGORY = "pipe_ui";
    public static final String PRODUCER_NAME = "BitmapMemoryCacheGetProducer";

    @Override // com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer
    protected String getOriginSubcategory() {
        return ORIGIN_SUBCATEGORY;
    }

    @Override // com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer
    protected String getProducerName() {
        return PRODUCER_NAME;
    }

    @Override // com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer
    protected Consumer<FragmentActivity.AnonymousClass1<CloseableImage>> wrapConsumer(Consumer<FragmentActivity.AnonymousClass1<CloseableImage>> consumer, requireActivity requireactivity, boolean z) {
        return consumer;
    }

    public BitmapMemoryCacheGetProducer(MemoryCache<requireActivity, CloseableImage> memoryCache, CacheKeyFactory cacheKeyFactory, Producer<FragmentActivity.AnonymousClass1<CloseableImage>> producer) {
        super(memoryCache, cacheKeyFactory, producer);
    }
}
