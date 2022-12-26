package o;

import android.view.View;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.CustomEditTextView;
import com.dream11.design.button.PrimaryButton;
import com.dream11.design.textinput.D11TextInputLayout;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class animateThumbToCheckedState extends androidx.databinding.ViewDataBinding {
    public final View HaptikSDK$a;
    public final View HaptikSDK$b;
    @androidx.databinding.Bindable
    protected blendHSL ag$a;
    public final CustomEditTextView ah$a;
    public final D11TextInputLayout invoke;
    public final D11TextView toString;
    public final PrimaryButton valueOf;
    public final D11ErrorFrameLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public animateThumbToCheckedState(Object obj, View view, int i, PrimaryButton primaryButton, D11ErrorFrameLayout d11ErrorFrameLayout, CustomEditTextView customEditTextView, D11TextView d11TextView, D11TextInputLayout d11TextInputLayout, View view2, View view3) {
        super(obj, view, i);
        this.valueOf = primaryButton;
        this.values = d11ErrorFrameLayout;
        this.ah$a = customEditTextView;
        this.toString = d11TextView;
        this.invoke = d11TextInputLayout;
        this.HaptikSDK$a = view2;
        this.HaptikSDK$b = view3;
    }
}
