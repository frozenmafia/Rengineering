package com.google.common.util.concurrent;

import com.google.common.util.concurrent.SequentialExecutor;
import java.util.Deque;
/* loaded from: classes7.dex */
final class SequentialExecutor$ag$a implements Runnable {
    Runnable ag$a;
    final /* synthetic */ SequentialExecutor toString;

    @Override // java.lang.Runnable
    public void run() {
        Deque deque;
        try {
            values();
        } catch (Error e) {
            deque = this.toString.ag$a;
            synchronized (deque) {
                this.toString.HaptikSDK$a = SequentialExecutor.WorkerRunningState.IDLE;
                throw e;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r0 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        r0 = r0 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        r9.ag$a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
        r4 = com.google.common.util.concurrent.SequentialExecutor.ah$a;
        r5 = java.util.logging.Level.SEVERE;
        r6 = java.lang.String.valueOf(r9.ag$a);
        r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 35);
        r8.append("Exception while executing runnable ");
        r8.append(r6);
        r4.log(r5, r8.toString(), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void values() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.common.util.concurrent.SequentialExecutor r2 = r9.toString     // Catch: java.lang.Throwable -> L93
            java.util.Deque r2 = com.google.common.util.concurrent.SequentialExecutor.ah$a(r2)     // Catch: java.lang.Throwable -> L93
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L93
            if (r1 != 0) goto L2d
            com.google.common.util.concurrent.SequentialExecutor r1 = r9.toString     // Catch: java.lang.Throwable -> L90
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = com.google.common.util.concurrent.SequentialExecutor.values(r1)     // Catch: java.lang.Throwable -> L90
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L90
            if (r1 != r3) goto L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L1f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1f:
            return
        L20:
            com.google.common.util.concurrent.SequentialExecutor r1 = r9.toString     // Catch: java.lang.Throwable -> L90
            com.google.common.util.concurrent.SequentialExecutor.valueOf(r1)     // Catch: java.lang.Throwable -> L90
            com.google.common.util.concurrent.SequentialExecutor r1 = r9.toString     // Catch: java.lang.Throwable -> L90
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L90
            com.google.common.util.concurrent.SequentialExecutor.ag$a(r1, r3)     // Catch: java.lang.Throwable -> L90
            r1 = 1
        L2d:
            com.google.common.util.concurrent.SequentialExecutor r3 = r9.toString     // Catch: java.lang.Throwable -> L90
            java.util.Deque r3 = com.google.common.util.concurrent.SequentialExecutor.ah$a(r3)     // Catch: java.lang.Throwable -> L90
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L90
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L90
            r9.ag$a = r3     // Catch: java.lang.Throwable -> L90
            if (r3 != 0) goto L4f
            com.google.common.util.concurrent.SequentialExecutor r1 = r9.toString     // Catch: java.lang.Throwable -> L90
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L90
            com.google.common.util.concurrent.SequentialExecutor.ag$a(r1, r3)     // Catch: java.lang.Throwable -> L90
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L4e
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L4e:
            return
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L90
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L93
            r0 = r0 | r2
            r2 = 0
            java.lang.Runnable r3 = r9.ag$a     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            goto L89
        L5c:
            r1 = move-exception
            goto L8d
        L5e:
            r3 = move-exception
            java.util.logging.Logger r4 = com.google.common.util.concurrent.SequentialExecutor.ah$a()     // Catch: java.lang.Throwable -> L5c
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
            java.lang.Runnable r6 = r9.ag$a     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L5c
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            int r7 = r7 + 35
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = "Exception while executing runnable "
            r8.append(r7)     // Catch: java.lang.Throwable -> L5c
            r8.append(r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L5c
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
        L89:
            r9.ag$a = r2     // Catch: java.lang.Throwable -> L93
            goto L2
        L8d:
            r9.ag$a = r2     // Catch: java.lang.Throwable -> L93
            throw r1     // Catch: java.lang.Throwable -> L93
        L90:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L90
            throw r1     // Catch: java.lang.Throwable -> L93
        L93:
            r1 = move-exception
            if (r0 == 0) goto L9d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L9d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.SequentialExecutor$ag$a.values():void");
    }

    public String toString() {
        SequentialExecutor.WorkerRunningState workerRunningState;
        Runnable runnable = this.ag$a;
        if (runnable == null) {
            workerRunningState = this.toString.HaptikSDK$a;
            String valueOf = String.valueOf(workerRunningState);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("SequentialExecutorWorker{state=");
            sb.append(valueOf);
            sb.append("}");
            return sb.toString();
        }
        String valueOf2 = String.valueOf(runnable);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
        sb2.append("SequentialExecutorWorker{running=");
        sb2.append(valueOf2);
        sb2.append("}");
        return sb2.toString();
    }
}
