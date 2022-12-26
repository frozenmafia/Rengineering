package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o.setFragmentResult;
/* loaded from: classes4.dex */
class setFragmentResult$ag$a extends setFragmentResult.toString {
    public static final setFragmentResult.valueOf getInitSettings = new setFragmentResult$ag$a();

    public String toString() {
        return TtmlNode.CENTER;
    }

    private setFragmentResult$ag$a() {
    }

    @Override // o.setFragmentResult.toString
    public void toString(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        matrix.setTranslate((int) (rect.left + ((rect.width() - i) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i2) * 0.5f) + 0.5f));
    }
}
