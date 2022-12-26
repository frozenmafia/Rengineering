package com.facebook.imagepipeline.producers;

import java.util.concurrent.Executor;
/* loaded from: classes4.dex */
public class ExperimentalThreadHandoffProducerQueueImpl implements ThreadHandoffProducerQueue {
    private final Executor mExecutor;

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public boolean isQueueing() {
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public void remove(Runnable runnable) {
    }

    public ExperimentalThreadHandoffProducerQueueImpl(Executor executor) {
        this.mExecutor = (Executor) executor.getClass();
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public void addToQueueOrExecute(Runnable runnable) {
        this.mExecutor.execute(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public void startQueueing() {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public void stopQueuing() {
        throw new UnsupportedOperationException();
    }
}
