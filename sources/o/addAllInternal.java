package o;

import android.content.Context;
import android.content.pm.PackageManager;
/* loaded from: classes5.dex */
public class addAllInternal {
    private static Boolean values;

    public static int ag$a(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static boolean toString(Context context) {
        Boolean bool = values;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            values = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            shouldBeKeptAsChild ah$a = shouldBeKeptAsChild.ah$a();
            ah$a.ag$a("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    public static void ag$a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
