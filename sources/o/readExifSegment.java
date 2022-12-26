package o;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.dreampay.commons.wallets.Wallet;
/* loaded from: classes4.dex */
public final class readExifSegment {
    public static final boolean valueOf(Wallet wallet, boolean z, boolean z2) {
        runAnimators.ag$a(wallet, "<this>");
        if (readExifSegment$ag$a.ag$a[wallet.ordinal()] != 1 || z) {
            return true;
        }
        return z2 && values();
    }

    private static final boolean values() {
        PackageManager packageManager;
        try {
            Application ag$a = unregisterInitCallback.ah$a.ag$a();
            if (ag$a != null && (packageManager = ag$a.getPackageManager()) != null) {
                packageManager.getApplicationInfo("com.phonepe.app", 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final Integer ag$a() {
        PackageManager packageManager;
        PackageInfo packageInfo;
        try {
            Application ag$a = unregisterInitCallback.ah$a.ag$a();
            if (ag$a != null && (packageManager = ag$a.getPackageManager()) != null && (packageInfo = packageManager.getPackageInfo("com.phonepe.app", 1)) != null) {
                return Integer.valueOf(packageInfo.versionCode);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
