package o;

import java.lang.ref.SoftReference;
import o.startLoading;
/* loaded from: classes6.dex */
public class takeContentChanged {
    protected static final ThreadLocal<SoftReference<unregisterListener>> ag$a;
    private static final startLoading ah$a;

    static {
        ah$a = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers")) ? startLoading.valueOf.values : null;
        ag$a = new ThreadLocal<>();
    }

    public static unregisterListener ag$a() {
        SoftReference<unregisterListener> softReference;
        ThreadLocal<SoftReference<unregisterListener>> threadLocal = ag$a;
        SoftReference<unregisterListener> softReference2 = threadLocal.get();
        unregisterListener unregisterlistener = softReference2 == null ? null : softReference2.get();
        if (unregisterlistener == null) {
            unregisterlistener = new unregisterListener();
            startLoading startloading = ah$a;
            if (startloading != null) {
                softReference = startloading.values(unregisterlistener);
            } else {
                softReference = new SoftReference<>(unregisterlistener);
            }
            threadLocal.set(softReference);
        }
        return unregisterlistener;
    }
}
