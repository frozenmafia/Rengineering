package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.core.performance.D11ConstraintLayoutTracker;
import com.app.dream11.core.ui.ImageStackView;
import com.dream11.design.textview.D11TextView;
import o.AnimatedStateListDrawableCompat;
/* loaded from: classes2.dex */
public abstract class postShow extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected AnimatedStateListDrawableCompat.AnimatedStateListState HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final ImageView ag$a;
    public final D11TextView ah$a;
    public final D11TextView ah$b;
    public final D11TextView getInitSettings;
    public final D11TextView getSignupData;
    public final ImageStackView invoke;
    public final androidx.constraintlayout.widget.Guideline toString;
    public final D11ConstraintLayoutTracker valueOf;
    public final androidx.constraintlayout.widget.Guideline values;

    public abstract void valueOf(AnimatedStateListDrawableCompat.AnimatedStateListState animatedStateListState);

    /* JADX INFO: Access modifiers changed from: protected */
    public postShow(Object obj, View view, int i, D11ConstraintLayoutTracker d11ConstraintLayoutTracker, ImageView imageView, D11TextView d11TextView, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Guideline guideline2, D11TextView d11TextView2, D11TextView d11TextView3, ImageStackView imageStackView, D11TextView d11TextView4, D11TextView d11TextView5, D11TextView d11TextView6) {
        super(obj, view, i);
        this.valueOf = d11ConstraintLayoutTracker;
        this.ag$a = imageView;
        this.ah$a = d11TextView;
        this.toString = guideline;
        this.values = guideline2;
        this.HaptikSDK$c = d11TextView2;
        this.HaptikSDK$b = d11TextView3;
        this.invoke = imageStackView;
        this.ah$b = d11TextView4;
        this.getSignupData = d11TextView5;
        this.getInitSettings = d11TextView6;
    }
}
