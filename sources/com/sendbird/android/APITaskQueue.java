package com.sendbird.android;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class APITaskQueue {
    private static final ExecutorService taskExecutor = Executors.newCachedThreadPool();

    APITaskQueue() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Future<T> addTask(JobTask<T> jobTask) {
        return taskExecutor.submit(jobTask.getCallable());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Future<T> addTask(JobResultTask<T> jobResultTask) {
        return taskExecutor.submit(jobResultTask.getCallable());
    }

    void shutdown() {
        if (isEnable()) {
            taskExecutor.shutdown();
        }
    }

    List<Runnable> shutdownNow() {
        if (isEnable()) {
            return taskExecutor.shutdownNow();
        }
        return Collections.emptyList();
    }

    boolean isEnable() {
        ExecutorService executorService = taskExecutor;
        return (executorService.isShutdown() || executorService.isTerminated()) ? false : true;
    }

    void cancelAll() {
        cancelAll(false);
    }

    void cancelAll(boolean z) {
        ExecutorService executorService = taskExecutor;
        if (executorService instanceof CancelableExecutorService) {
            ((CancelableExecutorService) executorService).cancelAll(z);
        }
    }
}
