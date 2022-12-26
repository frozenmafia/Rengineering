package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.listener.RequestListener2;
/* loaded from: classes4.dex */
public class InternalRequestListener extends InternalProducerListener implements RequestListener2 {
    private final RequestListener mRequestListener;
    private final RequestListener2 mRequestListener2;

    public InternalRequestListener(RequestListener requestListener, RequestListener2 requestListener2) {
        super(requestListener, requestListener2);
        this.mRequestListener = requestListener;
        this.mRequestListener2 = requestListener2;
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestStart(ProducerContext producerContext) {
        RequestListener requestListener = this.mRequestListener;
        if (requestListener != null) {
            requestListener.onRequestStart(producerContext.getImageRequest(), producerContext.getCallerContext(), producerContext.getId(), producerContext.isPrefetch());
        }
        RequestListener2 requestListener2 = this.mRequestListener2;
        if (requestListener2 != null) {
            requestListener2.onRequestStart(producerContext);
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestSuccess(ProducerContext producerContext) {
        RequestListener requestListener = this.mRequestListener;
        if (requestListener != null) {
            requestListener.onRequestSuccess(producerContext.getImageRequest(), producerContext.getId(), producerContext.isPrefetch());
        }
        RequestListener2 requestListener2 = this.mRequestListener2;
        if (requestListener2 != null) {
            requestListener2.onRequestSuccess(producerContext);
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestFailure(ProducerContext producerContext, Throwable th) {
        RequestListener requestListener = this.mRequestListener;
        if (requestListener != null) {
            requestListener.onRequestFailure(producerContext.getImageRequest(), producerContext.getId(), th, producerContext.isPrefetch());
        }
        RequestListener2 requestListener2 = this.mRequestListener2;
        if (requestListener2 != null) {
            requestListener2.onRequestFailure(producerContext, th);
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestCancellation(ProducerContext producerContext) {
        RequestListener requestListener = this.mRequestListener;
        if (requestListener != null) {
            requestListener.onRequestCancellation(producerContext.getId());
        }
        RequestListener2 requestListener2 = this.mRequestListener2;
        if (requestListener2 != null) {
            requestListener2.onRequestCancellation(producerContext);
        }
    }
}
