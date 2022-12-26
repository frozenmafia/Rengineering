package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class DelayProducer implements Producer<FragmentActivity.AnonymousClass1<CloseableImage>> {
    private final ScheduledExecutorService mBackgroundTasksExecutor;
    private final Producer<FragmentActivity.AnonymousClass1<CloseableImage>> mInputProducer;

    public DelayProducer(Producer<FragmentActivity.AnonymousClass1<CloseableImage>> producer, ScheduledExecutorService scheduledExecutorService) {
        this.mInputProducer = producer;
        this.mBackgroundTasksExecutor = scheduledExecutorService;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(final Consumer<FragmentActivity.AnonymousClass1<CloseableImage>> consumer, final ProducerContext producerContext) {
        ImageRequest imageRequest = producerContext.getImageRequest();
        ScheduledExecutorService scheduledExecutorService = this.mBackgroundTasksExecutor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable() { // from class: com.facebook.imagepipeline.producers.DelayProducer.1
                @Override // java.lang.Runnable
                public void run() {
                    DelayProducer.this.mInputProducer.produceResults(consumer, producerContext);
                }
            }, imageRequest.getDelayMs(), TimeUnit.MILLISECONDS);
        } else {
            this.mInputProducer.produceResults(consumer, producerContext);
        }
    }
}
