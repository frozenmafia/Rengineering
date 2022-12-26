package o;

import android.content.Context;
import com.app.dream11.dream11.DreamApplication;
import o.DrawerLayout;
/* loaded from: classes.dex */
public final class pendingToString {
    private static final boolean ag$a;
    public static final pendingToString toString;

    private pendingToString() {
    }

    static {
        pendingToString pendingtostring = new pendingToString();
        toString = pendingtostring;
        ag$a = pendingtostring.ag$a();
    }

    public static final void ah$a(Throwable th) {
        runAnimators.ag$a(th, "throwable");
        if (ag$a && DrawerLayout.AccessibilityDelegate.valueOf.ah$a()) {
            DrawerLayout.AccessibilityDelegate.valueOf.valueOf(th);
        }
    }

    public static final void values(String str) {
        if (ag$a && DrawerLayout.AccessibilityDelegate.valueOf.ah$a() && str != null) {
            DrawerLayout.AccessibilityDelegate.valueOf.ah$a(str);
        }
    }

    public static final void valueOf(String str, String str2) {
        runAnimators.ag$a(str, "tag");
        runAnimators.ag$a(str2, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        if (ag$a && DrawerLayout.AccessibilityDelegate.valueOf.ah$a()) {
            DrawerLayout.AccessibilityDelegate accessibilityDelegate = DrawerLayout.AccessibilityDelegate.valueOf;
            accessibilityDelegate.ah$a("1 " + str + com.dreampay.commons.constants.Constants.WHITE_SPACE + str2);
        }
    }

    public final boolean ag$a() {
        if (DreamApplication.valueOf() != null) {
            return DreamApplication.valueOf().aj$a().values().getDefaultImpl();
        }
        return false;
    }

    public final void values(String str, String str2) {
        DrawerLayout.AccessibilityDelegate.valueOf.ag$a(str, str2);
    }

    public static final void toString(Context context) {
        runAnimators.ag$a(context, "context");
        DrawerLayout.AccessibilityDelegate.valueOf.valueOf(context);
    }
}
