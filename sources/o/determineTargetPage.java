package o;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* loaded from: classes7.dex */
public final class determineTargetPage {
    private static final Method valueOf;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        valueOf = method;
    }

    public static final boolean values(Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = valueOf) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, true);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
