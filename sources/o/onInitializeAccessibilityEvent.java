package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class onInitializeAccessibilityEvent extends androidx.databinding.ViewDataBinding {
    public final View HaptikSDK$a;
    public final ProgressBar HaptikSDK$b;
    public final CustomTextView HaptikSDK$c;
    @androidx.databinding.Bindable
    protected topToTop ag$a;
    public final CustomTextView ah$a;
    public final CustomTextView toString;
    public final ProgressBar valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onInitializeAccessibilityEvent(Object obj, View view, int i, ImageView imageView, CustomTextView customTextView, ProgressBar progressBar, CustomTextView customTextView2, View view2, CustomTextView customTextView3, ProgressBar progressBar2) {
        super(obj, view, i);
        this.values = imageView;
        this.ah$a = customTextView;
        this.valueOf = progressBar;
        this.toString = customTextView2;
        this.HaptikSDK$a = view2;
        this.HaptikSDK$c = customTextView3;
        this.HaptikSDK$b = progressBar2;
    }
}
