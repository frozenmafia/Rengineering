package o;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class onSessionEvent {
    public static final Executor ag$a = Executors.newCachedThreadPool(new ThreadFactory() { // from class: o.onSessionEvent.2
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AmazonAuthorzationLibrary#" + onSessionEvent.ag$a());
        }
    });
    private static int values;

    static /* synthetic */ int ag$a() {
        int i = values + 1;
        values = i;
        return i;
    }

    public static boolean values() {
        return Looper.getMainLooper() != null && Looper.getMainLooper() == Looper.myLooper();
    }
}
