package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.image.EncodedImage;
import o.FragmentActivity;
/* loaded from: classes6.dex */
public class RemoveImageTransformMetaDataProducer implements Producer<FragmentActivity.AnonymousClass1<PooledByteBuffer>> {
    private final Producer<EncodedImage> mInputProducer;

    public RemoveImageTransformMetaDataProducer(Producer<EncodedImage> producer) {
        this.mInputProducer = producer;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<FragmentActivity.AnonymousClass1<PooledByteBuffer>> consumer, ProducerContext producerContext) {
        this.mInputProducer.produceResults(new RemoveImageTransformMetaDataConsumer(consumer), producerContext);
    }

    /* loaded from: classes6.dex */
    class RemoveImageTransformMetaDataConsumer extends DelegatingConsumer<EncodedImage, FragmentActivity.AnonymousClass1<PooledByteBuffer>> {
        private RemoveImageTransformMetaDataConsumer(Consumer<FragmentActivity.AnonymousClass1<PooledByteBuffer>> consumer) {
            super(consumer);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.BaseConsumer
        public void onNewResultImpl(EncodedImage encodedImage, int i) {
            try {
                r0 = EncodedImage.isValid(encodedImage) ? encodedImage.getByteBufferRef() : null;
                getConsumer().onNewResult(r0, i);
            } finally {
                FragmentActivity.AnonymousClass1.valueOf(r0);
            }
        }
    }
}
