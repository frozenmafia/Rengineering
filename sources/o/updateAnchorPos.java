package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.core.performance.D11ConstraintLayoutTracker;
import com.app.dream11.ui.CircularTextView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class updateAnchorPos extends androidx.databinding.ViewDataBinding {
    public final CircularTextView HaptikSDK$b;
    public final CustomTextView HaptikSDK$c;
    public final androidx.constraintlayout.widget.Guideline ag$a;
    public final ImageView ah$a;
    public final D11ConstraintLayoutTracker ah$b;
    public final CustomTextView invoke;
    public final ImageView toString;
    @androidx.databinding.Bindable
    protected toBundleArray valueOf;
    public final androidx.appcompat.widget.AppCompatImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public updateAnchorPos(Object obj, View view, int i, androidx.constraintlayout.widget.Guideline guideline, ImageView imageView, ImageView imageView2, androidx.appcompat.widget.AppCompatImageView appCompatImageView, D11ConstraintLayoutTracker d11ConstraintLayoutTracker, CircularTextView circularTextView, CustomTextView customTextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.ag$a = guideline;
        this.toString = imageView;
        this.ah$a = imageView2;
        this.values = appCompatImageView;
        this.ah$b = d11ConstraintLayoutTracker;
        this.HaptikSDK$b = circularTextView;
        this.HaptikSDK$c = customTextView;
        this.invoke = customTextView2;
    }
}
