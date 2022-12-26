package com.google.ads.interactivemedia.v3.impl.data;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.ads.interactivemedia.v3.internal.agg;
/* loaded from: classes4.dex */
public final /* synthetic */ class i {
    public static float b(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static String c(View view) {
        if (Build.VERSION.SDK_INT < 19 || view.isAttachedToWindow()) {
            int visibility = view.getVisibility();
            if (visibility != 0) {
                return visibility != 4 ? visibility != 8 ? "viewNotVisible" : "viewGone" : "viewInvisible";
            } else if (view.getAlpha() == 0.0f) {
                return "viewAlphaZero";
            } else {
                return null;
            }
        }
        return "notAttached";
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void f(String str, Exception exc) {
        if (agg.a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }
}
