package com.google.ads.interactivemedia.v3.impl.data;

import android.util.Log;
/* loaded from: classes4.dex */
public final /* synthetic */ class m {
    public static void a(String str) {
        if (e(2)) {
            Log.e("IMASDK", str);
        }
    }

    public static void b(String str, Throwable th) {
        if (e(2)) {
            Log.e("IMASDK", str, th);
        }
    }

    public static void c(String str) {
        if (e(1)) {
            Log.i("IMASDK", str);
        }
    }

    public static void d(String str) {
        if (e(2)) {
            Log.w("IMASDK", str);
        }
    }

    private static boolean e(int i) {
        return i - 1 > 0;
    }
}
