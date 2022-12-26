package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.request.ImageRequest;
import o.requireActivity;
/* loaded from: classes4.dex */
public class EncodedCacheKeyMultiplexProducer extends MultiplexProducer<Pair<requireActivity, ImageRequest.RequestLevel>, EncodedImage> {
    private final CacheKeyFactory mCacheKeyFactory;

    public EncodedCacheKeyMultiplexProducer(CacheKeyFactory cacheKeyFactory, boolean z, Producer producer) {
        super(producer, "EncodedCacheKeyMultiplexProducer", ProducerContext.ExtraKeys.MULTIPLEX_ENCODED_COUNT, z);
        this.mCacheKeyFactory = cacheKeyFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.imagepipeline.producers.MultiplexProducer
    public Pair<requireActivity, ImageRequest.RequestLevel> getKey(ProducerContext producerContext) {
        return Pair.create(this.mCacheKeyFactory.getEncodedCacheKey(producerContext.getImageRequest(), producerContext.getCallerContext()), producerContext.getLowestPermittedRequestLevel());
    }

    @Override // com.facebook.imagepipeline.producers.MultiplexProducer
    public EncodedImage cloneOrNull(EncodedImage encodedImage) {
        return EncodedImage.cloneOrNull(encodedImage);
    }
}
