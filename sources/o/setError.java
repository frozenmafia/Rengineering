package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
/* loaded from: classes3.dex */
public final class setError {
    public static SharedPreferences toString(Context context, String str) {
        String str2 = "WizRocket";
        if (str != null) {
            str2 = "WizRocket_" + str;
        }
        return context.getSharedPreferences(str2, 0);
    }

    public static String toString(Context context, String str, String str2) {
        return toString(context, null).getString(str, str2);
    }

    public static String toString(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, String str2) {
        if (cleverTapInstanceConfig.a()) {
            String seterror = toString(context, ag$a(cleverTapInstanceConfig, str), str2);
            return seterror != null ? seterror : toString(context, str, str2);
        }
        return toString(context, ag$a(cleverTapInstanceConfig, str), str2);
    }

    public static void valueOf(SharedPreferences.Editor editor) {
        try {
            editor.apply();
        } catch (Throwable th) {
            setBoundsInScreen.valueOf("CRITICAL: Failed to persist shared preferences!", th);
        }
    }

    public static void ah$a(SharedPreferences.Editor editor) {
        try {
            editor.commit();
        } catch (Throwable th) {
            setBoundsInScreen.valueOf("CRITICAL: Failed to persist shared preferences!", th);
        }
    }

    public static void ah$a(Context context, String str, String str2) {
        valueOf(toString(context, null).edit().putString(str, str2));
    }

    public static void valueOf(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, String str2) {
        valueOf(toString(context, null).edit().putString(ag$a(cleverTapInstanceConfig, str), str2));
    }

    public static String ag$a(CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        return str + ":" + cleverTapInstanceConfig.valueOf();
    }

    public static boolean toString(Context context, String str, boolean z) {
        return toString(context, null).getBoolean(str, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean values(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (cleverTapInstanceConfig.a()) {
            boolean seterror = toString(context, ag$a(cleverTapInstanceConfig, str), false);
            return !seterror ? toString(context, str, false) : seterror;
        }
        return toString(context, ag$a(cleverTapInstanceConfig, str), false);
    }

    public static int valueOf(Context context, String str, int i) {
        return toString(context, null).getInt(str, i);
    }

    public static int toString(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, int i) {
        if (cleverTapInstanceConfig.a()) {
            int valueOf = valueOf(context, ag$a(cleverTapInstanceConfig, str), -1000);
            return valueOf != -1000 ? valueOf : valueOf(context, str, i);
        }
        return valueOf(context, ag$a(cleverTapInstanceConfig, str), i);
    }

    static long values(Context context, String str, String str2, long j) {
        return toString(context, str).getLong(str2, j);
    }

    public static long values(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, int i, String str2) {
        if (cleverTapInstanceConfig.a()) {
            long values = values(context, str2, ag$a(cleverTapInstanceConfig, str), -1000L);
            return values != -1000 ? values : values(context, str2, str, i);
        }
        return values(context, str2, ag$a(cleverTapInstanceConfig, str), i);
    }

    public static void valueOf(Context context, String str, boolean z) {
        valueOf(toString(context, null).edit().putBoolean(str, z));
    }
}
