package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import kotlin.TypeCastException;
/* loaded from: classes4.dex */
public final class showOnUiThread {
    public static final String valueOf(Context context) {
        runAnimators.valueOf(context, "context");
        String packageName = context.getPackageName();
        runAnimators.toString(packageName, "context.packageName");
        return packageName;
    }

    public static final PackageInfo values(Context context) {
        runAnimators.valueOf(context, "context");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(valueOf(context), 0);
        runAnimators.toString(packageInfo, "context.packageManager.g…PackageName(context), 0\n)");
        return packageInfo;
    }

    public static final String toString(Context context) {
        runAnimators.valueOf(context, "context");
        String str = values(context).versionName;
        runAnimators.toString(str, "getPackageInfo(context).versionName");
        return str;
    }

    public static final String ag$a() {
        String str = Build.MANUFACTURER;
        runAnimators.toString(str, "android.os.Build.MANUFACTURER");
        return str;
    }

    public static final String values() {
        String str = Build.VERSION.RELEASE;
        runAnimators.toString(str, "android.os.Build.VERSION.RELEASE");
        return str;
    }

    public static final String ag$a(Context context) {
        runAnimators.valueOf(context, "context");
        Resources resources = context.getResources();
        runAnimators.toString(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        StringBuilder sb = new StringBuilder();
        sb.append(displayMetrics.heightPixels);
        sb.append('x');
        sb.append(displayMetrics.widthPixels);
        return sb.toString();
    }

    public static final String ah$a(Context context) {
        runAnimators.valueOf(context, "context");
        Object systemService = context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        if (systemService != null) {
            return ((TelephonyManager) systemService).getNetworkOperatorName();
        }
        throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
    }

    public static final String valueOf() {
        String str = Build.PRODUCT;
        runAnimators.toString(str, "android.os.Build.PRODUCT");
        return str;
    }

    private static final boolean toString(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static final boolean invoke(Context context) {
        runAnimators.valueOf(context, "context");
        if (toString(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Object systemService = context.getSystemService("connectivity");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
            return false;
        }
        return true;
    }
}
