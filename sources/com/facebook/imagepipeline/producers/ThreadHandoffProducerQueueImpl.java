package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
/* loaded from: classes4.dex */
public class ThreadHandoffProducerQueueImpl implements ThreadHandoffProducerQueue {
    private final Executor mExecutor;
    private boolean mQueueing = false;
    private final Deque<Runnable> mRunnableList = new ArrayDeque();

    public ThreadHandoffProducerQueueImpl(Executor executor) {
        this.mExecutor = (Executor) executor.getClass();
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public void addToQueueOrExecute(Runnable runnable) {
        synchronized (this) {
            if (this.mQueueing) {
                this.mRunnableList.add(runnable);
            } else {
                this.mExecutor.execute(runnable);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public void startQueueing() {
        synchronized (this) {
            this.mQueueing = true;
        }
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public void stopQueuing() {
        synchronized (this) {
            this.mQueueing = false;
            execInQueue();
        }
    }

    private void execInQueue() {
        while (!this.mRunnableList.isEmpty()) {
            this.mExecutor.execute(this.mRunnableList.pop());
        }
        this.mRunnableList.clear();
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public void remove(Runnable runnable) {
        synchronized (this) {
            this.mRunnableList.remove(runnable);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public boolean isQueueing() {
        boolean z;
        synchronized (this) {
            z = this.mQueueing;
        }
        return z;
    }
}
