package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import o.setFragmentResult;
/* loaded from: classes4.dex */
class setFragmentResult$HaptikSDK$d extends setFragmentResult.toString {
    public static final setFragmentResult.valueOf HaptikSDK$d = new setFragmentResult$HaptikSDK$d();

    public String toString() {
        return "fit_xy";
    }

    private setFragmentResult$HaptikSDK$d() {
    }

    @Override // o.setFragmentResult.toString
    public void toString(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        matrix.setScale(f3, f4);
        matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
    }
}
