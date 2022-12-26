package o;

import android.view.View;
import android.widget.ImageView;
import o.AnimatedStateListDrawableCompat;
/* loaded from: classes3.dex */
public abstract class descendingIterator extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected AnimatedStateListDrawableCompat.AnonymousClass1 HaptikSDK$b;
    @androidx.databinding.Bindable
    protected Boolean HaptikSDK$c;
    public final iteratorWithAdditions ag$a;
    public final androidx.constraintlayout.widget.Guideline ah$a;
    public final ImageView invoke;
    public final androidx.constraintlayout.widget.Guideline toString;
    public final androidx.constraintlayout.widget.Guideline valueOf;
    public final androidx.constraintlayout.widget.Guideline values;

    /* JADX INFO: Access modifiers changed from: protected */
    public descendingIterator(Object obj, View view, int i, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Guideline guideline2, androidx.constraintlayout.widget.Guideline guideline3, androidx.constraintlayout.widget.Guideline guideline4, iteratorWithAdditions iteratorwithadditions, ImageView imageView) {
        super(obj, view, i);
        this.toString = guideline;
        this.ah$a = guideline2;
        this.values = guideline3;
        this.valueOf = guideline4;
        this.ag$a = iteratorwithadditions;
        this.invoke = imageView;
    }
}
