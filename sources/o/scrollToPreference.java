package o;

import android.content.Context;
import android.graphics.Color;
import o.Preference;
import o.PreferenceDialogFragmentCompat;
/* loaded from: classes5.dex */
public class scrollToPreference {
    private static final int toString = (int) Math.round(5.1000000000000005d);
    private final boolean HaptikSDK$a;
    private final int ag$a;
    private final int ah$a;
    private final float valueOf;
    private final int values;

    public scrollToPreference(Context context) {
        this(setInitialExpandedChildrenCount.values(context, Preference.BaseSavedState.values.elevationOverlayEnabled, false), PreferenceDialogFragmentCompat.Api30Impl.toString(context, Preference.BaseSavedState.values.elevationOverlayColor, 0), PreferenceDialogFragmentCompat.Api30Impl.toString(context, Preference.BaseSavedState.values.elevationOverlayAccentColor, 0), PreferenceDialogFragmentCompat.Api30Impl.toString(context, Preference.BaseSavedState.values.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public scrollToPreference(boolean z, int i, int i2, int i3, float f) {
        this.HaptikSDK$a = z;
        this.values = i;
        this.ah$a = i2;
        this.ag$a = i3;
        this.valueOf = f;
    }

    public int ag$a(float f) {
        return toString(this.ag$a, f);
    }

    public int toString(int i, float f) {
        return (this.HaptikSDK$a && toString(i)) ? valueOf(i, f) : i;
    }

    public int valueOf(int i, float f) {
        int i2;
        float values = values(f);
        int alpha = Color.alpha(i);
        int ag$a = PreferenceDialogFragmentCompat.Api30Impl.ag$a(androidx.core.graphics.ColorUtils.setAlphaComponent(i, 255), this.values, values);
        if (values > 0.0f && (i2 = this.ah$a) != 0) {
            ag$a = androidx.core.graphics.ColorUtils.compositeColors(androidx.core.graphics.ColorUtils.setAlphaComponent(i2, toString), ag$a);
        }
        return androidx.core.graphics.ColorUtils.setAlphaComponent(ag$a, alpha);
    }

    public float values(float f) {
        float f2 = this.valueOf;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public boolean ag$a() {
        return this.HaptikSDK$a;
    }

    private boolean toString(int i) {
        return androidx.core.graphics.ColorUtils.setAlphaComponent(i, 255) == this.ag$a;
    }
}
