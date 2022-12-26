package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
import o.setShouldShowIcon;
/* loaded from: classes2.dex */
public abstract class shouldApplyFrameworkTintUsingColorFilter extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$b;
    public final View HaptikSDK$c;
    public final androidx.constraintlayout.widget.ConstraintLayout ag$a;
    public final ImageView ah$a;
    public final D11TextView ah$b;
    public final D11TextView invoke;
    public final ImageView toString;
    @androidx.databinding.Bindable
    protected setShouldShowIcon.valueOf valueOf;
    @androidx.databinding.Bindable
    protected setShouldShowIcon.values values;

    /* JADX INFO: Access modifiers changed from: protected */
    public shouldApplyFrameworkTintUsingColorFilter(Object obj, View view, int i, ImageView imageView, ImageView imageView2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, View view2) {
        super(obj, view, i);
        this.toString = imageView;
        this.ah$a = imageView2;
        this.ag$a = constraintLayout;
        this.invoke = d11TextView;
        this.ah$b = d11TextView2;
        this.HaptikSDK$b = d11TextView3;
        this.HaptikSDK$c = view2;
    }
}
