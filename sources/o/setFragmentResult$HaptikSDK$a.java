package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import o.setFragmentResult;
/* loaded from: classes4.dex */
class setFragmentResult$HaptikSDK$a extends setFragmentResult.toString {
    public static final setFragmentResult.valueOf getInitSettings = new setFragmentResult$HaptikSDK$a();

    public String toString() {
        return "fit_x";
    }

    private setFragmentResult$HaptikSDK$a() {
    }

    @Override // o.setFragmentResult.toString
    public void toString(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + ((rect.height() - (i2 * f3)) * 0.5f) + 0.5f));
    }
}
