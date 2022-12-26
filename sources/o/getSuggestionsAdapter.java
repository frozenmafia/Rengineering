package o;

import android.view.View;
import com.app.dream11.core.ui.PrefixEditTextView;
import com.dream11.design.textview.D11TextView;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes2.dex */
public abstract class getSuggestionsAdapter extends androidx.databinding.ViewDataBinding {
    public final View HaptikSDK$a;
    public final D11TextView ag$a;
    public final PrefixEditTextView ah$a;
    @androidx.databinding.Bindable
    protected hasKeyFramePosition toString;
    public final androidx.constraintlayout.widget.Guideline valueOf;
    public final TextInputLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getSuggestionsAdapter(Object obj, View view, int i, PrefixEditTextView prefixEditTextView, androidx.constraintlayout.widget.Guideline guideline, TextInputLayout textInputLayout, D11TextView d11TextView, View view2) {
        super(obj, view, i);
        this.ah$a = prefixEditTextView;
        this.valueOf = guideline;
        this.values = textInputLayout;
        this.ag$a = d11TextView;
        this.HaptikSDK$a = view2;
    }
}
