package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import o.setFragmentResult;
/* loaded from: classes4.dex */
class setFragmentResult$ah$a extends setFragmentResult.toString {
    public static final setFragmentResult.valueOf HaptikSDK$d = new setFragmentResult$ah$a();

    public String toString() {
        return "center_inside";
    }

    private setFragmentResult$ah$a() {
    }

    @Override // o.setFragmentResult.toString
    public void toString(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float min = Math.min(Math.min(f3, f4), 1.0f);
        matrix.setScale(min, min);
        matrix.postTranslate((int) (rect.left + ((rect.width() - (i * min)) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - (i2 * min)) * 0.5f) + 0.5f));
    }
}
