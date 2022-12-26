package com.facebook.imagepipeline.listener;

import com.facebook.imagepipeline.producers.ProducerContext;
import java.util.Map;
/* loaded from: classes6.dex */
public class BaseRequestListener2 implements RequestListener2 {
    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerEvent(ProducerContext producerContext, String str, String str2) {
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithCancellation(ProducerContext producerContext, String str, Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithFailure(ProducerContext producerContext, String str, Throwable th, Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithSuccess(ProducerContext producerContext, String str, Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerStart(ProducerContext producerContext, String str) {
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestCancellation(ProducerContext producerContext) {
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestFailure(ProducerContext producerContext, Throwable th) {
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestStart(ProducerContext producerContext) {
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestSuccess(ProducerContext producerContext) {
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onUltimateProducerReached(ProducerContext producerContext, String str, boolean z) {
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public boolean requiresExtraMap(ProducerContext producerContext, String str) {
        return false;
    }
}
