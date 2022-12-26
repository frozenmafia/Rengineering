package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
/* loaded from: classes4.dex */
public class setNonConfig {
    private static setNonConfig values;

    private setNonConfig() {
    }

    public static setNonConfig ah$a() {
        if (values == null) {
            values = new setNonConfig();
        }
        return values;
    }

    public boolean toString(Context context) {
        if (values(context)) {
            return true;
        }
        return ah$a(context) && valueOf();
    }

    private boolean ah$a(Context context) {
        return valueOf(context, "RCTI18nUtil_allowRTL", true);
    }

    public void ah$a(Context context, boolean z) {
        ah$a(context, "RCTI18nUtil_allowRTL", z);
    }

    public boolean valueOf(Context context) {
        return valueOf(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public void ag$a(Context context, boolean z) {
        ah$a(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }

    private boolean values(Context context) {
        return valueOf(context, "RCTI18nUtil_forceRTL", false);
    }

    public void valueOf(Context context, boolean z) {
        ah$a(context, "RCTI18nUtil_forceRTL", z);
    }

    private boolean valueOf() {
        return androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    private boolean valueOf(Context context, String str, boolean z) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z);
    }

    private void ah$a(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }
}
