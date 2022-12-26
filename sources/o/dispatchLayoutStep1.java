package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import o.OrientationHelper;
/* loaded from: classes5.dex */
public class dispatchLayoutStep1 {
    public final String HaptikSDK$c;
    public final String ag$a;
    public final String ah$a;
    public final String ah$b;
    public final OrientationHelper.AnonymousClass2 toString;
    public final String valueOf;
    public final String values;

    public static dispatchLayoutStep1 ah$a(Context context, isPreferredNextFocus ispreferrednextfocus, String str, String str2, OrientationHelper.AnonymousClass2 anonymousClass2) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String values = ispreferrednextfocus.values();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        return new dispatchLayoutStep1(str, str2, values, packageName, Integer.toString(packageInfo.versionCode), packageInfo.versionName == null ? "0.0" : packageInfo.versionName, anonymousClass2);
    }

    public dispatchLayoutStep1(String str, String str2, String str3, String str4, String str5, String str6, OrientationHelper.AnonymousClass2 anonymousClass2) {
        this.values = str;
        this.ah$a = str2;
        this.valueOf = str3;
        this.ag$a = str4;
        this.ah$b = str5;
        this.HaptikSDK$c = str6;
        this.toString = anonymousClass2;
    }
}
