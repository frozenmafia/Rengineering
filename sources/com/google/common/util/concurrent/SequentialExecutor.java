package com.google.common.util.concurrent;

import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
final class SequentialExecutor implements Executor {
    private static final Logger ah$a = Logger.getLogger(SequentialExecutor.class.getName());
    private WorkerRunningState HaptikSDK$a;
    private final Deque<Runnable> ag$a;
    private long toString;
    private final Executor valueOf;
    private final SequentialExecutor$ag$a values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ long valueOf(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.toString;
        sequentialExecutor.toString = 1 + j;
        return j;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        markViewHoldersUpdated.toString(runnable);
        synchronized (this.ag$a) {
            if (this.HaptikSDK$a != WorkerRunningState.RUNNING && this.HaptikSDK$a != WorkerRunningState.QUEUED) {
                long j = this.toString;
                Runnable runnable2 = new Runnable(this) { // from class: com.google.common.util.concurrent.SequentialExecutor.4
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }

                    public String toString() {
                        return runnable.toString();
                    }
                };
                this.ag$a.add(runnable2);
                this.HaptikSDK$a = WorkerRunningState.QUEUING;
                try {
                    this.valueOf.execute(this.values);
                    if (this.HaptikSDK$a != WorkerRunningState.QUEUING) {
                        return;
                    }
                    synchronized (this.ag$a) {
                        if (this.toString == j && this.HaptikSDK$a == WorkerRunningState.QUEUING) {
                            this.HaptikSDK$a = WorkerRunningState.QUEUED;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.ag$a) {
                        if ((this.HaptikSDK$a == WorkerRunningState.IDLE || this.HaptikSDK$a == WorkerRunningState.QUEUING) && this.ag$a.removeLastOccurrence(runnable2)) {
                            r8 = true;
                        }
                        if (!(e instanceof RejectedExecutionException) || r8) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.ag$a.add(runnable);
        }
    }

    public String toString() {
        int identityHashCode = System.identityHashCode(this);
        String valueOf = String.valueOf(this.valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("SequentialExecutor@");
        sb.append(identityHashCode);
        sb.append("{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
