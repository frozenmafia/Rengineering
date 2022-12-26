package com.appsflyer;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.internal.ah;
import com.appsflyer.internal.ap;
import com.appsflyer.internal.aw;
import com.conviva.sdk.ConvivaSdkConstants;
/* loaded from: classes3.dex */
public final class AFLogger {
    private static final long AFInAppEventType = System.currentTimeMillis();

    public static void values(String str, boolean z) {
        if (AFInAppEventType(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.2.3", valueOf(str, false));
        }
        if (z) {
            ap.AFInAppEventParameterName().valueOf(null, "I", valueOf(str, true));
        }
    }

    private static String valueOf(String str, boolean z) {
        if (str == null) {
            str = "null";
        }
        if (z || LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt(ConvivaSdkConstants.LOG_LEVEL, LogLevel.NONE.getLevel())) {
            StringBuilder sb = new StringBuilder("(");
            sb.append(System.currentTimeMillis() - AFInAppEventType);
            sb.append(") [");
            sb.append(Thread.currentThread().getName());
            sb.append("] ");
            sb.append(str);
            return sb.toString();
        }
        return str;
    }

    private static void valueOf(String str, Throwable th, boolean z, boolean z2) {
        if (AFInAppEventType(LogLevel.ERROR)) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getClass().getSimpleName());
                sb.append(" at ");
                sb.append(th.getStackTrace()[0].toString());
                str = sb.toString();
            }
            String valueOf = valueOf(str, false);
            if (z2) {
                Log.e("AppsFlyer_6.2.3", valueOf, th);
            } else if (z) {
                Log.d("AppsFlyer_6.2.3", valueOf);
            }
        }
        ap AFInAppEventParameterName = ap.AFInAppEventParameterName();
        Throwable cause = th.getCause();
        AFInAppEventParameterName.valueOf("exception", th.getClass().getSimpleName(), ap.AFKeystoreWrapper(cause == null ? th.getMessage() : cause.getMessage(), cause == null ? th.getStackTrace() : cause.getStackTrace()));
        if (aw.AFInAppEventParameterName != null) {
            ah.values(aw.AFInAppEventParameterName).edit().putLong("exception_number", (aw.AFInAppEventParameterName == null ? -1L : ah.values(aw.AFInAppEventParameterName).getLong("exception_number", 0L)) + 1).apply();
        }
    }

    public static void AFInAppEventParameterName(String str) {
        if (AFInAppEventType(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.2.3", valueOf(str, false));
        }
        ap.AFInAppEventParameterName().valueOf(null, ExifInterface.LONGITUDE_WEST, valueOf(str, true));
    }

    public static void AFInAppEventType(String str) {
        if (AFInAppEventType(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.2.3", valueOf(str, false));
        }
        ap.AFInAppEventParameterName().valueOf(null, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, valueOf(str, true));
    }

    private static boolean AFInAppEventType(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt(ConvivaSdkConstants.LOG_LEVEL, LogLevel.NONE.getLevel());
    }

    public static void values(String str) {
        if (!AFKeystoreWrapper()) {
            Log.d("AppsFlyer_6.2.3", valueOf(str, false));
        }
        ap.AFInAppEventParameterName().valueOf(null, "F", str);
    }

    private static boolean AFKeystoreWrapper() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void valueOf(String str) {
        values(str, true);
    }

    public static void values(String str, Throwable th) {
        valueOf(str, th, true, false);
    }

    public static void AFInAppEventParameterName(String str, Throwable th) {
        valueOf(str, th, true, true);
    }

    public static void values(Throwable th) {
        valueOf(null, th, false, false);
    }

    /* loaded from: classes3.dex */
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        private int AFKeystoreWrapper;

        LogLevel(int i) {
            this.AFKeystoreWrapper = i;
        }

        public final int getLevel() {
            return this.AFKeystoreWrapper;
        }
    }

    public static void AFKeystoreWrapper(String str) {
        if (AFInAppEventType(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.2.3", valueOf(str, false));
        }
        ap.AFInAppEventParameterName().valueOf(null, "D", valueOf(str, true));
    }
}
