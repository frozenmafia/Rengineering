package o;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes4.dex */
public class prepareSetNameOverridesReordered extends MetricAffectingSpan implements FragmentViewLifecycleOwner {
    private final float ag$a;

    public prepareSetNameOverridesReordered(float f) {
        this.ag$a = f;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        toString(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        toString(textPaint);
    }

    private void toString(TextPaint textPaint) {
        if (Float.isNaN(this.ag$a)) {
            return;
        }
        textPaint.setLetterSpacing(this.ag$a);
    }
}
