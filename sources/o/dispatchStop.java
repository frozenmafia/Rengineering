package o;

import android.os.Looper;
/* loaded from: classes4.dex */
public abstract class dispatchStop {
    private static dispatchStop ag$a;

    /* loaded from: classes4.dex */
    public interface values {
        void HaptikSDK$b();
    }

    public abstract void ag$a(values valuesVar);

    public abstract void values(values valuesVar);

    public static dispatchStop valueOf() {
        dispatchStop dispatchstop;
        synchronized (dispatchStop.class) {
            if (ag$a == null) {
                ag$a = new doLoaderStart();
            }
            dispatchstop = ag$a;
        }
        return dispatchstop;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ah$a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
