package o;

import android.os.Build;
import android.os.SystemClock;
/* loaded from: classes3.dex */
public final class unsetSystemUiFlag {
    private static final double ag$a;

    static {
        ag$a = Build.VERSION.SDK_INT >= 17 ? 1.0d / Math.pow(10.0d, 6.0d) : 1.0d;
    }

    public static long ag$a() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }

    public static double valueOf(long j) {
        return (ag$a() - j) * ag$a;
    }
}
