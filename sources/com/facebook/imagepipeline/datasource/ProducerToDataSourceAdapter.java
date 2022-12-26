package com.facebook.imagepipeline.datasource;

import com.facebook.imagepipeline.listener.RequestListener2;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.SettableProducerContext;
import o.FragmentAnim;
/* loaded from: classes6.dex */
public class ProducerToDataSourceAdapter<T> extends AbstractProducerToDataSourceAdapter<T> {
    public static <T> FragmentAnim.AnimationOrAnimator<T> create(Producer<T> producer, SettableProducerContext settableProducerContext, RequestListener2 requestListener2) {
        return new ProducerToDataSourceAdapter(producer, settableProducerContext, requestListener2);
    }

    private ProducerToDataSourceAdapter(Producer<T> producer, SettableProducerContext settableProducerContext, RequestListener2 requestListener2) {
        super(producer, settableProducerContext, requestListener2);
    }
}
