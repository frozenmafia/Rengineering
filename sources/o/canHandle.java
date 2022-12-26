package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import o.setFragmentResult;
/* loaded from: classes4.dex */
public class canHandle extends setFragmentResult.toString {
    public static final setFragmentResult.valueOf HaptikSDK$d = new canHandle();

    public String toString() {
        return "start_inside";
    }

    @Override // o.setFragmentResult.toString
    public void toString(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float min = Math.min(Math.min(f3, f4), 1.0f);
        matrix.setScale(min, min);
        matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
    }
}
