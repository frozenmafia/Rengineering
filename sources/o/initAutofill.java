package o;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes7.dex */
public final class initAutofill {
    public static ExecutorService values(String str) {
        ExecutorService valueOf = valueOf(toString(str), new ThreadPoolExecutor.DiscardPolicy());
        valueOf(str, valueOf);
        return valueOf;
    }

    public static ThreadFactory toString(final String str) {
        final AtomicLong atomicLong = new AtomicLong(1L);
        return new ThreadFactory() { // from class: o.initAutofill.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(final Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(new dispatchLayoutStep2() { // from class: o.initAutofill.1.5
                    @Override // o.dispatchLayoutStep2
                    public void ag$a() {
                        runnable.run();
                    }
                });
                newThread.setName(str + atomicLong.getAndIncrement());
                return newThread;
            }
        };
    }

    private static ExecutorService valueOf(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

    private static void valueOf(String str, ExecutorService executorService) {
        ag$a(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void ag$a(final String str, final ExecutorService executorService, final long j, final TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        dispatchLayoutStep2 dispatchlayoutstep2 = new dispatchLayoutStep2() { // from class: o.initAutofill.4
            @Override // o.dispatchLayoutStep2
            public void ag$a() {
                createScroller createscroller;
                createScroller createscroller2;
                createScroller createscroller3;
                try {
                    createscroller2 = createScroller.valueOf;
                    createscroller2.ah$a("Executing shutdown hook for " + str);
                    executorService.shutdown();
                    if (executorService.awaitTermination(j, timeUnit)) {
                        return;
                    }
                    createscroller3 = createScroller.valueOf;
                    createscroller3.ah$a(str + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    executorService.shutdownNow();
                } catch (InterruptedException unused) {
                    createscroller = createScroller.valueOf;
                    createscroller.ah$a(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str));
                    executorService.shutdownNow();
                }
            }
        };
        runtime.addShutdownHook(new Thread(dispatchlayoutstep2, "Crashlytics Shutdown Hook for " + str));
    }
}
