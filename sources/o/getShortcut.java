package o;

import android.os.Build;
import java.io.File;
/* loaded from: classes2.dex */
public class getShortcut {
    public static int valueOf() {
        String str = Build.TAGS;
        if (str == null || !str.contains("test-keys")) {
            try {
                return new File("/system/app/Superuser.apk").exists() ? 1 : 0;
            } catch (Exception unused) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean values() {
        return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains(com.apxor.androidsdk.core.Constants.EMULATOR_MODE) || Build.MODEL.contains("Android SDK") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }
}
