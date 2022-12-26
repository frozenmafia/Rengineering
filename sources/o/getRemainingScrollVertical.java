package o;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class getRemainingScrollVertical {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor HaptikSDK$a() {
        return toString("Firebase-Messaging-Trigger-Topics-Io");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Executor toString(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService values() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
    }

    public static ExecutorService ah$a() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService valueOf() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
    }
}
