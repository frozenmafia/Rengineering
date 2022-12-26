package o;

import android.util.Log;
import com.clevertap.android.sdk.CleverTapAPI;
/* loaded from: classes3.dex */
public final class setBoundsInScreen {
    private int ah$a;

    public static void ag$a(String str) {
        if (values() > CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.d("CleverTap", str);
        }
    }

    public static void values(String str, String str2) {
        if (values() > CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.d("CleverTap:" + str, str2);
        }
    }

    public static void ah$a(String str, String str2, Throwable th) {
        if (values() > CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.d("CleverTap:" + str, str2, th);
        }
    }

    public static void values(String str, Throwable th) {
        if (values() > CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.d("CleverTap", str, th);
        }
    }

    public static void valueOf(String str) {
        if (values() >= CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.i("CleverTap", str);
        }
    }

    public static void ag$a(String str, Throwable th) {
        if (values() >= CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.i("CleverTap", str, th);
        }
    }

    public static void values(String str) {
        if (values() > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            Log.v("CleverTap", str);
        }
    }

    public static void valueOf(String str, String str2) {
        if (values() > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            Log.v("CleverTap:" + str, str2);
        }
    }

    public static void toString(String str, String str2, Throwable th) {
        if (values() > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            Log.v("CleverTap:" + str, str2, th);
        }
    }

    public static void valueOf(String str, Throwable th) {
        if (values() > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            Log.v("CleverTap", str, th);
        }
    }

    public setBoundsInScreen(int i) {
        this.ah$a = i;
    }

    public void toString(String str) {
        if (values() > CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.d("CleverTap", str);
        }
    }

    public void ag$a(String str, String str2) {
        if (values() > CleverTapAPI.LogLevel.INFO.intValue()) {
            if (str2.length() > 4000) {
                Log.d("CleverTap:" + str, str2.substring(0, 4000));
                ag$a(str, str2.substring(4000));
                return;
            }
            Log.d("CleverTap:" + str, str2);
        }
    }

    public void valueOf(String str, String str2, Throwable th) {
        if (values() > CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.d("CleverTap:" + str, str2, th);
        }
    }

    public void ah$a(String str) {
        if (ag$a() >= CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.i("CleverTap", str);
        }
    }

    public void toString(String str, String str2) {
        if (ag$a() >= CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.i("CleverTap:" + str, str2);
        }
    }

    public void HaptikSDK$b(String str) {
        if (values() > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            Log.v("CleverTap", str);
        }
    }

    public void ah$a(String str, String str2) {
        if (values() > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            if (str2.length() > 4000) {
                Log.v("CleverTap:" + str, str2.substring(0, 4000));
                ah$a(str, str2.substring(4000));
                return;
            }
            Log.v("CleverTap:" + str, str2);
        }
    }

    public void values(String str, String str2, Throwable th) {
        if (values() > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            Log.v("CleverTap:" + str, str2, th);
        }
    }

    public void toString(String str, Throwable th) {
        if (values() > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            Log.v("CleverTap", str, th);
        }
    }

    private int ag$a() {
        return this.ah$a;
    }

    private static int values() {
        return CleverTapAPI.ah$a();
    }
}
