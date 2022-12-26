package o;

import android.view.View;
import com.app.dream11.model.viewmodel.EnterPasswordVM;
import com.app.dream11.ui.CustomTextView;
import com.dream11.design.button.D11Button;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes2.dex */
public abstract class getMovie extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$b;
    public final TextInputLayout HaptikSDK$c;
    public final CustomTextView ag$a;
    public final TextInputEditText ah$a;
    public final CustomTextView invoke;
    @androidx.databinding.Bindable
    protected EnterPasswordVM toString;
    public final androidx.cardview.widget.CardView valueOf;
    public final D11Button values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getMovie(Object obj, View view, int i, D11Button d11Button, CustomTextView customTextView, TextInputEditText textInputEditText, androidx.cardview.widget.CardView cardView, TextInputLayout textInputLayout, CustomTextView customTextView2, CustomTextView customTextView3) {
        super(obj, view, i);
        this.values = d11Button;
        this.ag$a = customTextView;
        this.ah$a = textInputEditText;
        this.valueOf = cardView;
        this.HaptikSDK$c = textInputLayout;
        this.invoke = customTextView2;
        this.HaptikSDK$b = customTextView3;
    }
}
