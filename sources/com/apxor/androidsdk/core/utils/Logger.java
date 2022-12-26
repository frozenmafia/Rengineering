package com.apxor.androidsdk.core.utils;

import android.util.Log;
/* loaded from: classes3.dex */
public class Logger {
    private static boolean a = false;

    private static boolean a(String str) {
        return a && str != null;
    }

    public static void d(String str, String str2, Throwable th) {
        if (a(str2)) {
            Log.d("Apxor", str2, th);
        }
    }

    public static void debug(String str, String str2) {
        if (!Log.isLoggable("Apxor", 3) || str2 == null) {
            return;
        }
        Log.d("Apxor", str2);
    }

    public static void e(String str, String str2, Throwable th) {
        if (str2 != null && Log.isLoggable("Apxor", 6)) {
            Log.e("Apxor", str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        Log.i("Apxor", str2, th);
    }

    public static void v(String str, String str2, Throwable th) {
        if (Log.isLoggable("Apxor", 6) && a(str2)) {
            Log.v("Apxor", str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (a(str2)) {
            Log.w("Apxor", str2, th);
        }
    }

    public static void wtf(String str, String str2, Throwable th) {
        if (a(str2)) {
            Log.wtf("Apxor", str2, th);
        }
    }

    public static void i(String str, String str2) {
        if (!Log.isLoggable("Apxor", 3) || str2 == null) {
            return;
        }
        Log.i("Apxor", str2);
    }

    public static void d(String str, String str2) {
        if (a(str2)) {
            Log.d("Apxor", str2);
        }
    }

    public static void e(String str, String str2) {
        if (a(str2)) {
            Log.e("Apxor", str2);
        }
    }

    public static void v(String str, String str2) {
        if (Log.isLoggable("Apxor", 6) && a(str2)) {
            Log.v("Apxor", str2);
        }
    }

    public static void w(String str, String str2) {
        if (a(str2)) {
            Log.w("Apxor", str2);
        }
    }

    public static void wtf(String str, String str2) {
        if (a(str2)) {
            Log.wtf("Apxor", str2);
        }
    }
}
