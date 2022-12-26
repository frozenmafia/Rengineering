package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.dreampay.device.Device$userAgent$2;
import java.util.Objects;
/* loaded from: classes4.dex */
public final class getStringBuilder {
    private static String HaptikSDK$a;
    private static String HaptikSDK$b;
    private static String HaptikSDK$c;
    private static final String HaptikWebView;
    private static final String ag$a;
    private static final String ah$a;
    private static String ah$b;
    private static String getInitSettings;
    private static final setIdentityTransforms getSignupData;
    private static PackageInfo invoke;
    private static String valueOf;
    public static final getStringBuilder values = new getStringBuilder();
    private static final String toString = String.valueOf(Build.VERSION.SDK_INT);

    private getStringBuilder() {
    }

    public final String ag$a() {
        return toString;
    }

    public final String ah$a() {
        return HaptikWebView;
    }

    public final String values() {
        return ah$a;
    }

    public final String valueOf() {
        return ag$a;
    }

    static {
        String str = Build.VERSION.RELEASE;
        runAnimators.ah$a(str, "RELEASE");
        HaptikWebView = str;
        String str2 = Build.MANUFACTURER;
        runAnimators.ah$a(str2, "MANUFACTURER");
        ah$a = str2;
        String str3 = Build.PRODUCT;
        runAnimators.ah$a(str3, "PRODUCT");
        ag$a = str3;
        getSignupData = runAnimators.ag$a(Device$userAgent$2.INSTANCE, "initializer");
    }

    public final String HaptikSDK$a() {
        return (String) getSignupData.getValue();
    }

    public final String values(Context context) {
        runAnimators.ag$a(context, "context");
        if (HaptikSDK$b == null) {
            HaptikSDK$b = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "android_id");
        }
        String str = HaptikSDK$b;
        runAnimators.toString((Object) str);
        return str;
    }

    public final String ag$a(Context context) {
        runAnimators.ag$a(context, "context");
        if (HaptikSDK$a == null) {
            HaptikSDK$a = HaptikSDK$b(context);
        }
        String str = HaptikSDK$a;
        runAnimators.toString((Object) str);
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r3 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String ah$a(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            o.runAnimators.ag$a(r3, r0)
            java.lang.String r0 = o.getStringBuilder.valueOf
            if (r0 != 0) goto L1f
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = "com.google.android.webview"
            r1 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r0, r1)     // Catch: java.lang.Exception -> L1b
            if (r3 != 0) goto L17
            goto L1b
        L17:
            java.lang.String r3 = r3.versionName     // Catch: java.lang.Exception -> L1b
            if (r3 != 0) goto L1d
        L1b:
            java.lang.String r3 = ""
        L1d:
            o.getStringBuilder.valueOf = r3
        L1f:
            java.lang.String r3 = o.getStringBuilder.valueOf
            o.runAnimators.toString(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getStringBuilder.ah$a(android.content.Context):java.lang.String");
    }

    public final String HaptikSDK$a(Context context) {
        runAnimators.ag$a(context, "context");
        if (getInitSettings == null) {
            getInitSettings = context.getPackageName();
        }
        String str = getInitSettings;
        runAnimators.toString((Object) str);
        return str;
    }

    public final String valueOf(Context context) {
        runAnimators.ag$a(context, "context");
        if (HaptikSDK$c == null) {
            Object systemService = context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            HaptikSDK$c = ((TelephonyManager) systemService).getSimCountryIso();
        }
        String str = HaptikSDK$c;
        runAnimators.toString((Object) str);
        return str;
    }

    private final PackageInfo invoke(Context context) {
        if (invoke == null) {
            invoke = context.getPackageManager().getPackageInfo(HaptikSDK$a(context), 0);
        }
        PackageInfo packageInfo = invoke;
        runAnimators.toString(packageInfo);
        return packageInfo;
    }

    public final String toString(Context context) {
        runAnimators.ag$a(context, "context");
        String str = invoke(context).versionName;
        runAnimators.ah$a(str, "getPackageInfo(context).versionName");
        return str;
    }

    public final String HaptikSDK$c(Context context) {
        runAnimators.ag$a(context, "context");
        if (ah$b == null) {
            Object systemService = context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            ah$b = ((TelephonyManager) systemService).getNetworkOperatorName();
        }
        return ah$b;
    }

    private final String HaptikSDK$b(Context context) {
        int i = context.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        return i != 120 ? i != 160 ? i != 213 ? i != 240 ? i != 320 ? i != 480 ? i != 640 ? "Unknown" : "XXXHDPI" : "XXHDPI" : "XHDPI" : "HDPI" : "TV" : "MDPI" : "LDPI";
    }
}
