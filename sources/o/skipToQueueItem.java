package o;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
final class skipToQueueItem {
    private static final skipToQueueItem ah$a = new skipToQueueItem();
    private final ExecutorService ag$a;
    private final ScheduledExecutorService valueOf;
    private final Executor values;

    private static boolean valueOf() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }

    private skipToQueueItem() {
        this.ag$a = !valueOf() ? Executors.newCachedThreadPool() : unregisterCallbackListener.ah$a();
        this.valueOf = Executors.newSingleThreadScheduledExecutor();
        this.values = new toString();
    }

    public static ExecutorService values() {
        return ah$a.ag$a;
    }

    public static ScheduledExecutorService ag$a() {
        return ah$a.valueOf;
    }

    public static Executor ah$a() {
        return ah$a.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class toString implements Executor {
        private ThreadLocal<Integer> ag$a;

        private toString() {
            this.ag$a = new ThreadLocal<>();
        }

        private int values() {
            Integer num = this.ag$a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.ag$a.set(Integer.valueOf(intValue));
            return intValue;
        }

        private int ag$a() {
            Integer num = this.ag$a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.ag$a.remove();
            } else {
                this.ag$a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (values() <= 15) {
                    runnable.run();
                } else {
                    skipToQueueItem.values().execute(runnable);
                }
            } finally {
                ag$a();
            }
        }
    }
}
