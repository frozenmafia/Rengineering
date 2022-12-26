package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import o.setFragmentResult;
/* loaded from: classes4.dex */
class setFragmentResult$HaptikSDK$b extends setFragmentResult.toString {
    public static final setFragmentResult.valueOf getSignupData = new setFragmentResult$HaptikSDK$b();

    public String toString() {
        return "fit_bottom_start";
    }

    private setFragmentResult$HaptikSDK$b() {
    }

    @Override // o.setFragmentResult.toString
    public void toString(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float min = Math.min(f3, f4);
        matrix.setScale(min, min);
        matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + (rect.height() - (i2 * min)) + 0.5f));
    }
}
