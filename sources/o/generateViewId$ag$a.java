package o;

import android.util.Property;
import android.view.View;
/* loaded from: classes3.dex */
public final class generateViewId$ag$a {
    public static final generateViewId$ag$a ag$a = new generateViewId$ag$a();
    public static int ah$a;
    public static float valueOf;
    public static Property<View, Float> values;

    static {
        Property<View, Float> property = View.TRANSLATION_X;
        runAnimators.ah$a(property, "TRANSLATION_X");
        values = property;
    }
}
