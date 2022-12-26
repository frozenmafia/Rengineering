package o;

import android.view.View;
import com.app.dream11.ui.CustomTextView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class setWidth extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$c;
    public final CustomTextView ag$a;
    public final CustomTextView ah$a;
    public final CustomTextView ah$b;
    public final D11TextView invoke;
    public final CustomTextView toString;
    public final CustomTextView valueOf;
    @androidx.databinding.Bindable
    protected getBundleForAction values;

    public abstract void values(getBundleForAction getbundleforaction);

    /* JADX INFO: Access modifiers changed from: protected */
    public setWidth(Object obj, View view, int i, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, D11TextView d11TextView, D11TextView d11TextView2, CustomTextView customTextView5) {
        super(obj, view, i);
        this.ag$a = customTextView;
        this.valueOf = customTextView2;
        this.toString = customTextView3;
        this.ah$a = customTextView4;
        this.HaptikSDK$c = d11TextView;
        this.invoke = d11TextView2;
        this.ah$b = customTextView5;
    }
}
