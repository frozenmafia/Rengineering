package com.sendbird.android;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class TaskQueue {
    private final ExecutorService executorService;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskQueue(ExecutorService executorService) {
        this.executorService = executorService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> Future<T> addTask(JobTask<T> jobTask) {
        if (!isEnable()) {
            throw new RuntimeException("Task has been terminated");
        }
        return this.executorService.submit(jobTask.getCallable());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> Future<T> addTask(JobResultTask<T> jobResultTask) {
        if (!isEnable()) {
            throw new RuntimeException("Task has been terminated");
        }
        return this.executorService.submit(jobResultTask.getCallable());
    }

    void shutdown() {
        if (isEnable()) {
            this.executorService.shutdown();
        }
    }

    List<Runnable> shutdownNow() {
        if (isEnable()) {
            return this.executorService.shutdownNow();
        }
        return Collections.emptyList();
    }

    boolean isEnable() {
        ExecutorService executorService = this.executorService;
        return (executorService == null || executorService.isShutdown() || this.executorService.isTerminated()) ? false : true;
    }

    void cancelAll() {
        cancelAll(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cancelAll(boolean z) {
        ExecutorService executorService = this.executorService;
        if (executorService instanceof CancelableExecutorService) {
            ((CancelableExecutorService) executorService).cancelAll(z);
        }
    }
}
