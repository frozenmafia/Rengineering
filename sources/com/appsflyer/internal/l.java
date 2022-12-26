package com.appsflyer.internal;

import android.net.TrafficStats;
import com.appsflyer.AFLogger;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public final class l {
    public static l AFKeystoreWrapper;
    Executor AFInAppEventParameterName;
    ScheduledExecutorService AFInAppEventType;
    ScheduledExecutorService valueOf;
    final ThreadFactory values = new ThreadFactory() { // from class: com.appsflyer.internal.l.2
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() { // from class: com.appsflyer.internal.l.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                    runnable.run();
                }
            });
        }
    };

    public final Executor AFInAppEventParameterName() {
        Executor executor = this.AFInAppEventParameterName;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.AFInAppEventParameterName).isTerminated() || ((ThreadPoolExecutor) this.AFInAppEventParameterName).isTerminating()))) {
            this.AFInAppEventParameterName = Executors.newFixedThreadPool(2, this.values);
        }
        return this.AFInAppEventParameterName;
    }

    public final ScheduledThreadPoolExecutor values() {
        ScheduledExecutorService scheduledExecutorService = this.AFInAppEventType;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.AFInAppEventType.isTerminated()) {
            this.AFInAppEventType = Executors.newScheduledThreadPool(2, this.values);
        }
        return (ScheduledThreadPoolExecutor) this.AFInAppEventType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void values(ExecutorService executorService) {
        try {
            try {
                AFLogger.AFInAppEventType("shut downing executor ...");
                executorService.shutdown();
                executorService.awaitTermination(10L, TimeUnit.SECONDS);
                if (!executorService.isTerminated()) {
                    AFLogger.AFInAppEventType("killing non-finished tasks");
                }
                executorService.shutdownNow();
            } catch (InterruptedException unused) {
                AFLogger.AFInAppEventType("InterruptedException!!!");
                if (!executorService.isTerminated()) {
                    AFLogger.AFInAppEventType("killing non-finished tasks");
                }
                executorService.shutdownNow();
            }
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.AFInAppEventType("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }
}
