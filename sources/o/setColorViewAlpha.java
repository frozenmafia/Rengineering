package o;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes5.dex */
public final class setColorViewAlpha {
    public static final boolean toString;
    public static final int valueOf;
    static final AtomicReference<ScheduledExecutorService> values = new AtomicReference<>();
    static final Map<ScheduledThreadPoolExecutor, Object> ag$a = new ConcurrentHashMap();

    static {
        valueOf valueof = new valueOf();
        boolean ag$a2 = ag$a(true, "rx2.purge-enabled", true, true, valueof);
        toString = ag$a2;
        valueOf = ah$a(ag$a2, "rx2.purge-period-seconds", 1, 1, valueof);
        ag$a();
    }

    public static void ag$a() {
        valueOf(toString);
    }

    static void valueOf(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = values;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                values valuesVar = new values();
                long j = valueOf;
                newScheduledThreadPool.scheduleAtFixedRate(valuesVar, j, j, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }

    static int ah$a(boolean z, String str, int i, int i2, FrameworkSQLiteOpenHelperFactory<String, String> frameworkSQLiteOpenHelperFactory) {
        if (z) {
            try {
                String apply = frameworkSQLiteOpenHelperFactory.apply(str);
                return apply == null ? i : Integer.parseInt(apply);
            } catch (Throwable unused) {
                return i;
            }
        }
        return i2;
    }

    static boolean ag$a(boolean z, String str, boolean z2, boolean z3, FrameworkSQLiteOpenHelperFactory<String, String> frameworkSQLiteOpenHelperFactory) {
        if (z) {
            try {
                String apply = frameworkSQLiteOpenHelperFactory.apply(str);
                return apply == null ? z2 : "true".equals(apply);
            } catch (Throwable unused) {
                return z2;
            }
        }
        return z3;
    }

    /* loaded from: classes5.dex */
    static final class valueOf implements FrameworkSQLiteOpenHelperFactory<String, String> {
        valueOf() {
        }

        @Override // o.FrameworkSQLiteOpenHelperFactory
        /* renamed from: valueOf */
        public String apply(String str) throws Exception {
            return System.getProperty(str);
        }
    }

    public static ScheduledExecutorService valueOf(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        ah$a(toString, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    static void ah$a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            ag$a.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class values implements Runnable {
        values() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(setColorViewAlpha.ag$a.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    setColorViewAlpha.ag$a.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }
}
