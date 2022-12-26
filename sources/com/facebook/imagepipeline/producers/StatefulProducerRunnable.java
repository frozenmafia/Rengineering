package com.facebook.imagepipeline.producers;

import java.util.Map;
import o.setUserVisibleHint;
/* loaded from: classes4.dex */
public abstract class StatefulProducerRunnable<T> extends setUserVisibleHint<T> {
    private final Consumer<T> mConsumer;
    private final ProducerContext mProducerContext;
    private final ProducerListener2 mProducerListener;
    private final String mProducerName;

    @Override // o.setUserVisibleHint
    public abstract void disposeResult(T t);

    protected Map<String, String> getExtraMapOnCancellation() {
        return null;
    }

    protected Map<String, String> getExtraMapOnFailure(Exception exc) {
        return null;
    }

    protected Map<String, String> getExtraMapOnSuccess(T t) {
        return null;
    }

    public StatefulProducerRunnable(Consumer<T> consumer, ProducerListener2 producerListener2, ProducerContext producerContext, String str) {
        this.mConsumer = consumer;
        this.mProducerListener = producerListener2;
        this.mProducerName = str;
        this.mProducerContext = producerContext;
        producerListener2.onProducerStart(producerContext, str);
    }

    @Override // o.setUserVisibleHint
    public void onSuccess(T t) {
        ProducerListener2 producerListener2 = this.mProducerListener;
        ProducerContext producerContext = this.mProducerContext;
        String str = this.mProducerName;
        producerListener2.onProducerFinishWithSuccess(producerContext, str, producerListener2.requiresExtraMap(producerContext, str) ? getExtraMapOnSuccess(t) : null);
        this.mConsumer.onNewResult(t, 1);
    }

    @Override // o.setUserVisibleHint
    public void onFailure(Exception exc) {
        ProducerListener2 producerListener2 = this.mProducerListener;
        ProducerContext producerContext = this.mProducerContext;
        String str = this.mProducerName;
        producerListener2.onProducerFinishWithFailure(producerContext, str, exc, producerListener2.requiresExtraMap(producerContext, str) ? getExtraMapOnFailure(exc) : null);
        this.mConsumer.onFailure(exc);
    }

    @Override // o.setUserVisibleHint
    public void onCancellation() {
        ProducerListener2 producerListener2 = this.mProducerListener;
        ProducerContext producerContext = this.mProducerContext;
        String str = this.mProducerName;
        producerListener2.onProducerFinishWithCancellation(producerContext, str, producerListener2.requiresExtraMap(producerContext, str) ? getExtraMapOnCancellation() : null);
        this.mConsumer.onCancellation();
    }
}
