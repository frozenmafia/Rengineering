package o;

import android.content.Context;
/* loaded from: classes3.dex */
public final class getPaddingEnd {
    static getPivotX ag$a;
    private static final Object toString = new Object();

    public static getPivotX toString(Context context) {
        getTranslationZ getscalex;
        getscalex = getScaleX.toString(context);
        return valueOf(context, getscalex);
    }

    public static getPivotX valueOf(Context context, getTranslationZ gettranslationz) {
        synchronized (toString) {
            if (ag$a == null) {
                ag$a = new getPivotX(context, gettranslationz);
            } else {
                ah$a();
            }
        }
        return ag$a;
    }

    public static boolean ag$a() {
        return ag$a != null;
    }

    private static void ah$a() {
        values().HaptikSDK$e.ah$a("Multiple Bugsnag.start calls detected. Ignoring.");
    }

    public static void toString(String str, String str2, String str3) {
        values().values(str, str2, str3);
    }

    public static void ag$a(Throwable th) {
        values().values(th);
    }

    public static void toString(String str, String str2, Object obj) {
        values().valueOf(str, str2, obj);
    }

    public static void valueOf(String str) {
        values().ag$a(str);
    }

    public static getPivotX values() {
        if (ag$a == null) {
            synchronized (toString) {
                if (ag$a == null) {
                    throw new IllegalStateException("You must call Bugsnag.start before any other Bugsnag methods");
                }
            }
        }
        return ag$a;
    }
}
