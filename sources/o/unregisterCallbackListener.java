package o;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
final class unregisterCallbackListener {
    private static final unregisterCallbackListener ag$a = new unregisterCallbackListener();
    static final int ah$a;
    static final int valueOf;
    private static final int values;
    private final Executor toString = new unregisterCallbackListener$ag$a();

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        values = availableProcessors;
        valueOf = availableProcessors + 1;
        ah$a = (availableProcessors * 2) + 1;
    }

    private unregisterCallbackListener() {
    }

    public static ExecutorService ah$a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(valueOf, ah$a, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        ah$a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static void ah$a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (Build.VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z);
        }
    }

    public static Executor valueOf() {
        return ag$a.toString;
    }
}
