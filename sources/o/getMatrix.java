package o;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public final class getMatrix {
    public static final ThreadPoolExecutor toString(final String str, boolean z) {
        runAnimators.valueOf(str, "name");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new ThreadPoolExecutor(z ? 1 : 0, 1, 30L, timeUnit, new LinkedBlockingQueue(128), new ThreadFactory() { // from class: o.getMatrix$ag$a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }
}
