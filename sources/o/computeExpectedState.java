package o;

import android.view.View;
/* loaded from: classes6.dex */
public class computeExpectedState {
    public static float ag$a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        return 0.0f;
    }

    public static float valueOf(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return Float.POSITIVE_INFINITY;
        }
        return size;
    }
}
