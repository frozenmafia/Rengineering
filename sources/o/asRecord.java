package o;

import android.util.Log;
import com.clevertap.android.pushtemplates.TemplateRenderer;
/* loaded from: classes3.dex */
public final class asRecord {
    public static void toString(String str) {
        if (TemplateRenderer.ag$a() >= TemplateRenderer.LogLevel.DEBUG.intValue()) {
            Log.d("PTLog", str);
        }
    }

    public static void valueOf(String str) {
        if (TemplateRenderer.ag$a() >= TemplateRenderer.LogLevel.VERBOSE.intValue()) {
            Log.v("PTLog", str);
        }
    }

    public static void ag$a(String str, Throwable th) {
        if (TemplateRenderer.ag$a() >= TemplateRenderer.LogLevel.VERBOSE.intValue()) {
            Log.v("PTLog", str, th);
        }
    }
}
