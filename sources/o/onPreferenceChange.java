package o;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* loaded from: classes5.dex */
public class onPreferenceChange {
    public static final TimeInterpolator valueOf = new LinearInterpolator();
    public static final TimeInterpolator values = new androidx.interpolator.view.animation.FastOutSlowInInterpolator();
    public static final TimeInterpolator ah$a = new androidx.interpolator.view.animation.FastOutLinearInInterpolator();
    public static final TimeInterpolator ag$a = new androidx.interpolator.view.animation.LinearOutSlowInInterpolator();
    public static final TimeInterpolator toString = new DecelerateInterpolator();

    public static float toString(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int valueOf(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }

    public static float valueOf(float f, float f2, float f3, float f4, float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : toString(f, f2, (f5 - f3) / (f4 - f3));
    }
}
