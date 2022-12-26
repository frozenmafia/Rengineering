package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
/* loaded from: classes5.dex */
public final class getEditor {
    private static final setPreferences toString = new setPreferences("PhoneskyVerificationUtils");

    public static boolean values(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (r0 = signatureArr.length) == 0) {
                    toString.ag$a("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                } else {
                    for (Signature signature : signatureArr) {
                        String values = getDefaultSharedPreferencesName.values(signature.toByteArray());
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(values)) {
                            return true;
                        }
                        if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(values)) {
                            return true;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
