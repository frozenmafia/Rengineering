package o;

import io.reactivex.rxjava3.internal.schedulers.RxThreadFactory;
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
public final class createMetadataItem {
    public static final boolean ag$a;
    public static final int toString;
    static final AtomicReference<ScheduledExecutorService> ah$a = new AtomicReference<>();
    static final Map<ScheduledThreadPoolExecutor, Object> values = new ConcurrentHashMap();

    static {
        toString tostring = new toString();
        boolean ah$a2 = ah$a(true, "rx3.purge-enabled", true, true, tostring);
        ag$a = ah$a2;
        toString = valueOf(ah$a2, "rx3.purge-period-seconds", 1, 1, tostring);
        ah$a();
    }

    public static void ah$a() {
        values(ag$a);
    }

    static void values(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = ah$a;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                valueOf valueof = new valueOf();
                long j = toString;
                newScheduledThreadPool.scheduleAtFixedRate(valueof, j, j, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }

    static int valueOf(boolean z, String str, int i, int i2, addOffset<String, String> addoffset) {
        if (z) {
            try {
                String apply = addoffset.apply(str);
                return apply == null ? i : Integer.parseInt(apply);
            } catch (Throwable th) {
                FlatBufferBuilder.ah$a(th);
                return i;
            }
        }
        return i2;
    }

    static boolean ah$a(boolean z, String str, boolean z2, boolean z3, addOffset<String, String> addoffset) {
        if (z) {
            try {
                String apply = addoffset.apply(str);
                return apply == null ? z2 : "true".equals(apply);
            } catch (Throwable th) {
                FlatBufferBuilder.ah$a(th);
                return z2;
            }
        }
        return z3;
    }

    /* loaded from: classes5.dex */
    static final class toString implements addOffset<String, String> {
        toString() {
        }

        @Override // o.addOffset
        /* renamed from: ah$a */
        public String apply(String str) {
            return System.getProperty(str);
        }
    }

    public static ScheduledExecutorService values(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        valueOf(ag$a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    static void valueOf(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            values.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class valueOf implements Runnable {
        valueOf() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(createMetadataItem.values.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    createMetadataItem.values.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }
}
