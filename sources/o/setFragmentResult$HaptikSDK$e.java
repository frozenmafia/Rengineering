package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import o.setFragmentResult;
/* loaded from: classes4.dex */
class setFragmentResult$HaptikSDK$e extends setFragmentResult.toString {
    public static final setFragmentResult.valueOf HaptikSDK$d = new setFragmentResult$HaptikSDK$e();

    public String toString() {
        return "focus_crop";
    }

    private setFragmentResult$HaptikSDK$e() {
    }

    @Override // o.setFragmentResult.toString
    public void toString(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float max;
        float f5;
        if (f4 > f3) {
            float f6 = i * f4;
            f5 = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f * f6), 0.0f), rect.width() - f6);
            max = rect.top;
            f3 = f4;
        } else {
            float f7 = i2 * f3;
            max = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f7), 0.0f), rect.height() - f7) + rect.top;
            f5 = rect.left;
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (max + 0.5f));
    }
}
