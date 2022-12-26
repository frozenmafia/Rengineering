package o;

import android.os.Build;
/* loaded from: classes5.dex */
public final class checkForGaps {
    public static void values(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            android.os.Trace.beginSection(str);
        }
    }

    public static void ah$a() {
        if (Build.VERSION.SDK_INT >= 18) {
            android.os.Trace.endSection();
        }
    }
}
