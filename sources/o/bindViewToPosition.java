package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public final class bindViewToPosition {
    private static WakeLock ag$a;
    private static final long toString = TimeUnit.MINUTES.toMillis(1);
    private static final Object values = new Object();

    private static void valueOf(Context context) {
        if (ag$a == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            ag$a = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    public static ComponentName valueOf(Context context, Intent intent) {
        synchronized (values) {
            valueOf(context);
            boolean bindviewtoposition = toString(intent);
            valueOf(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!bindviewtoposition) {
                ag$a.acquire(toString);
            }
            return startService;
        }
    }

    private static void valueOf(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    static boolean toString(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void ag$a(Intent intent) {
        synchronized (values) {
            if (ag$a != null && toString(intent)) {
                valueOf(intent, false);
                ag$a.release();
            }
        }
    }
}
