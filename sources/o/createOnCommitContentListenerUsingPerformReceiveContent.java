package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
/* loaded from: classes4.dex */
public class createOnCommitContentListenerUsingPerformReceiveContent {
    public static boolean valueOf(Context context) {
        try {
            Class.forName("com.google.android.gms.common.GooglePlayServicesUtil");
        } catch (ClassNotFoundException unused) {
        }
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    public static boolean values(Context context) {
        return ah$a(context, "com.android.vending") || ah$a(context, "com.google.market");
    }

    private static boolean ah$a(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private static boolean valueOf(Context context, Intent intent) {
        return (intent == null || context.getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public static boolean ah$a(Context context) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "ro.miui.ui.version.code");
            if (str != null) {
                if (!TextUtils.isEmpty(str.trim())) {
                    return true;
                }
            }
            return valueOf(context, new Intent("miui.intent.action.OP_AUTO_START").addCategory("android.intent.category.DEFAULT")) || valueOf(context, new Intent().setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"))) || valueOf(context, new Intent("miui.intent.action.POWER_HIDE_MODE_APP_LIST").addCategory("android.intent.category.DEFAULT")) || valueOf(context, new Intent().setComponent(new ComponentName("com.miui.securitycenter", "com.miui.powercenter.PowerSettings")));
        }
        return false;
    }
}
