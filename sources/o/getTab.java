package o;

import android.view.View;
import com.app.dream11.core.ui.PrefixEditTextView;
import com.dream11.design.textview.D11TextView;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes2.dex */
public abstract class getTab extends androidx.databinding.ViewDataBinding {
    public final PrefixEditTextView HaptikSDK$a;
    public final View HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final androidx.constraintlayout.widget.Guideline ag$a;
    public final TextInputLayout ah$a;
    public final TextInputLayout ah$b;
    public final PrefixEditTextView invoke;
    @androidx.databinding.Bindable
    protected getProgressDirection toString;
    public final TextInputLayout valueOf;
    public final PrefixEditTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getTab(Object obj, View view, int i, TextInputLayout textInputLayout, PrefixEditTextView prefixEditTextView, androidx.constraintlayout.widget.Guideline guideline, TextInputLayout textInputLayout2, PrefixEditTextView prefixEditTextView2, TextInputLayout textInputLayout3, PrefixEditTextView prefixEditTextView3, D11TextView d11TextView, View view2) {
        super(obj, view, i);
        this.valueOf = textInputLayout;
        this.values = prefixEditTextView;
        this.ag$a = guideline;
        this.ah$a = textInputLayout2;
        this.HaptikSDK$a = prefixEditTextView2;
        this.ah$b = textInputLayout3;
        this.invoke = prefixEditTextView3;
        this.HaptikSDK$c = d11TextView;
        this.HaptikSDK$b = view2;
    }
}
