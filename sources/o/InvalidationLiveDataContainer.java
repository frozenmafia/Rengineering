package o;

import android.content.Context;
import android.provider.Settings;
import o.IMultiInstanceInvalidationService;
/* loaded from: classes5.dex */
class InvalidationLiveDataContainer {
    InvalidationLiveDataContainer() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String valueOf(Context context, String str, String str2, int i) {
        try {
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in getStringSettings: ", e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return Settings.Secure.getString(context.getContentResolver(), str);
                }
                return str2;
            }
            return Settings.Global.getString(context.getContentResolver(), str);
        }
        return Settings.System.getString(context.getContentResolver(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int valueOf(Context context, String str, int i, int i2) {
        try {
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in getIntFromSetting: ", e);
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return Settings.Secure.getInt(context.getContentResolver(), str, i);
                }
                return i;
            }
            return Settings.Global.getInt(context.getContentResolver(), str, i);
        }
        return Settings.System.getInt(context.getContentResolver(), str, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float valueOf(Context context, String str, float f, int i) {
        try {
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in getFloatValueForSetting: ", e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return Settings.Secure.getFloat(context.getContentResolver(), str, f);
                }
                return f;
            }
            return Settings.Global.getFloat(context.getContentResolver(), str, f);
        }
        return Settings.System.getFloat(context.getContentResolver(), str, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long toString(Context context, String str, long j, int i) {
        try {
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in getFloatValueForSetting: ", e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return Settings.Secure.getLong(context.getContentResolver(), str, j);
                }
                return j;
            }
            return Settings.Global.getLong(context.getContentResolver(), str, j);
        }
        return Settings.System.getLong(context.getContentResolver(), str, j);
    }
}
