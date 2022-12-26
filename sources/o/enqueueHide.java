package o;

import android.view.View;
import com.facebook.yoga.YogaMeasureMode;
/* loaded from: classes6.dex */
public class enqueueHide {
    public static int valueOf(float f, YogaMeasureMode yogaMeasureMode) {
        if (yogaMeasureMode == YogaMeasureMode.EXACTLY) {
            return View.MeasureSpec.makeMeasureSpec((int) f, 1073741824);
        }
        if (yogaMeasureMode == YogaMeasureMode.AT_MOST) {
            return View.MeasureSpec.makeMeasureSpec((int) f, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
