package o;

import android.content.Context;
import com.amazon.identity.auth.device.api.authorization.Region;
/* loaded from: classes5.dex */
public final class setShadowDrawable {
    public static void valueOf(Context context, boolean z) {
        context.getSharedPreferences("com.amazon.lwa.LWASharedPreferences", 0).edit().putBoolean("com.amazon.lwa.isTokenObtainedFromSSO", z).commit();
    }

    public static boolean valueOf(Context context) {
        return context.getSharedPreferences("com.amazon.lwa.LWASharedPreferences", 0).getBoolean("com.amazon.lwa.sandboxMode", false);
    }

    public static void values(Context context, Region region) {
        context.getSharedPreferences("com.amazon.lwa.LWASharedPreferences", 0).edit().putString("com.amazon.lwa.regionMode", region.toString()).commit();
    }

    public static boolean values(Context context) {
        return context.getSharedPreferences("com.amazon.lwa.LWASharedPreferences", 0).getBoolean("com.amazon.lwa.isTokenObtainedFromSSO", false);
    }
}
