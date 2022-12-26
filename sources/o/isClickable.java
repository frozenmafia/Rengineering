package o;

import android.content.Context;
import android.os.Build;
/* loaded from: classes3.dex */
public final class isClickable {
    public static final boolean ag$a(Context context, int i) {
        runAnimators.ag$a(context, "<this>");
        return Build.VERSION.SDK_INT > i && valueOf(context) > i;
    }

    public static final int valueOf(Context context) {
        runAnimators.ag$a(context, "<this>");
        return context.getApplicationContext().getApplicationInfo().targetSdkVersion;
    }
}
