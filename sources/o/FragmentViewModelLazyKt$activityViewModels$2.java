package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* loaded from: classes4.dex */
public class FragmentViewModelLazyKt$activityViewModels$2 extends ReplacementSpan implements FragmentViewLifecycleOwner {
    private int ag$a;
    private int ah$a;
    private int valueOf;

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    public FragmentViewModelLazyKt$activityViewModels$2(int i, int i2, int i3) {
        this.ag$a = i;
        this.valueOf = i2;
        this.ah$a = i3;
    }

    public int ag$a() {
        return this.ag$a;
    }

    public int values() {
        return this.valueOf;
    }

    public int valueOf() {
        return this.ah$a;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.ah$a;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.valueOf;
    }
}
