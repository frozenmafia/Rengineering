package o;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
/* loaded from: classes4.dex */
public class setNameOverridesOrdered implements LineHeightSpan, FragmentViewLifecycleOwner {
    private final int toString;

    public setNameOverridesOrdered(float f) {
        this.toString = (int) Math.ceil(f);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5;
        int i6 = fontMetricsInt.descent;
        int i7 = this.toString;
        if (i6 > i7) {
            int min = Math.min(i7, fontMetricsInt.descent);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.toString) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
            int i8 = (-this.toString) + fontMetricsInt.descent;
            fontMetricsInt.ascent = i8;
            fontMetricsInt.top = i8;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.toString) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.toString;
        } else {
            int i9 = fontMetricsInt.bottom;
            if ((-fontMetricsInt.top) + i9 > this.toString) {
                fontMetricsInt.top = fontMetricsInt.bottom - this.toString;
                return;
            }
            double d = (i5 - ((-fontMetricsInt.top) + fontMetricsInt.bottom)) / 2.0f;
            fontMetricsInt.top = (int) (fontMetricsInt.top - Math.ceil(d));
            fontMetricsInt.bottom = (int) (fontMetricsInt.bottom + Math.floor(d));
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
    }
}
