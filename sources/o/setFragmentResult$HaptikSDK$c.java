package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import o.setFragmentResult;
/* loaded from: classes4.dex */
class setFragmentResult$HaptikSDK$c extends setFragmentResult.toString {
    public static final setFragmentResult.valueOf HaptikWebView = new setFragmentResult$HaptikSDK$c();

    public String toString() {
        return "fit_center";
    }

    private setFragmentResult$HaptikSDK$c() {
    }

    @Override // o.setFragmentResult.toString
    public void toString(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float min = Math.min(f3, f4);
        matrix.setScale(min, min);
        matrix.postTranslate((int) (rect.left + ((rect.width() - (i * min)) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - (i2 * min)) * 0.5f) + 0.5f));
    }
}
