package o;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import o.createViewModelLazy;
/* loaded from: classes4.dex */
public class getBoundsOnScreen extends MetricAffectingSpan implements FragmentViewLifecycleOwner {
    private final AssetManager ag$a;
    private final int ah$a;
    private final String toString;
    private final int valueOf;
    private final String values;

    public getBoundsOnScreen(int i, int i2, String str, String str2, AssetManager assetManager) {
        this.valueOf = i;
        this.ah$a = i2;
        this.values = str;
        this.toString = str2;
        this.ag$a = assetManager;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        ag$a(textPaint, this.valueOf, this.ah$a, this.values, this.toString, this.ag$a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        ag$a(textPaint, this.valueOf, this.ah$a, this.values, this.toString, this.ag$a);
    }

    private static void ag$a(Paint paint, int i, int i2, String str, String str2, AssetManager assetManager) {
        Typeface ah$a = createViewModelLazy.Cdefault.ah$a(paint.getTypeface(), i, i2, str2, assetManager);
        paint.setFontFeatureSettings(str);
        paint.setTypeface(ah$a);
        paint.setSubpixelText(true);
    }
}
