package o;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.appsamurai.storyly.util.k$a;
/* loaded from: classes3.dex */
public final class addOnUnhandledKeyEventListener {
    public static final setIdentityTransforms toString = runAnimators.ag$a(k$a.a, "initializer");

    public static int ag$a(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 592.0f;
        }
        Object value = toString.getValue();
        runAnimators.ah$a(value, "<get-displayMetrics>(...)");
        return (int) ((((DisplayMetrics) value).heightPixels * f) / f2);
    }

    public static int ah$a(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 361.0f;
        }
        Object value = toString.getValue();
        runAnimators.ah$a(value, "<get-displayMetrics>(...)");
        return (int) ((((DisplayMetrics) value).widthPixels * f) / f2);
    }

    public static final float values(int i) {
        return i * (Resources.getSystem().getDisplayMetrics().densityDpi / 160);
    }
}
