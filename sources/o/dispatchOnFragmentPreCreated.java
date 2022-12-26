package o;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes4.dex */
public class dispatchOnFragmentPreCreated {
    private static boolean ag$a(int i) {
        return i == 0 || i == -2;
    }

    public static void ag$a(dispatchOnFragmentPreCreated$ah$a dispatchonfragmentprecreated_ah_a, float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f <= 0.0f || layoutParams == null) {
            return;
        }
        if (ag$a(layoutParams.height)) {
            dispatchonfragmentprecreated_ah_a.valueOf = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(dispatchonfragmentprecreated_ah_a.values) - i) / f) + i2), dispatchonfragmentprecreated_ah_a.valueOf), 1073741824);
        } else if (ag$a(layoutParams.width)) {
            dispatchonfragmentprecreated_ah_a.values = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(dispatchonfragmentprecreated_ah_a.valueOf) - i2) * f) + i), dispatchonfragmentprecreated_ah_a.values), 1073741824);
        }
    }
}
