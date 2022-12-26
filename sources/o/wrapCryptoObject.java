package o;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes3.dex */
public final class wrapCryptoObject {
    private static Method ah$a;
    private static Method valueOf;

    public static IBinder values(Bundle bundle, String str) {
        if (getElevationDegrees.HaptikSDK$b >= 18) {
            return bundle.getBinder(str);
        }
        return ah$a(bundle, str);
    }

    public static void ah$a(Bundle bundle, String str, IBinder iBinder) {
        if (getElevationDegrees.HaptikSDK$b >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            values(bundle, str, iBinder);
        }
    }

    private static IBinder ah$a(Bundle bundle, String str) {
        Method method = ah$a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                ah$a = method2;
                method2.setAccessible(true);
                method = ah$a;
            } catch (NoSuchMethodException e) {
                SupportMenuItem.values("BundleUtil", "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            SupportMenuItem.values("BundleUtil", "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }

    private static void values(Bundle bundle, String str, IBinder iBinder) {
        Method method = valueOf;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                valueOf = method2;
                method2.setAccessible(true);
                method = valueOf;
            } catch (NoSuchMethodException e) {
                SupportMenuItem.values("BundleUtil", "Failed to retrieve putIBinder method", e);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            SupportMenuItem.values("BundleUtil", "Failed to invoke putIBinder via reflection", e2);
        }
    }
}
