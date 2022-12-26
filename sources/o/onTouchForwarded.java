package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CustomTextInputEditText;
import com.dream11.design.button.PrimaryButton;
import com.dream11.design.textinput.D11TextInputLayout;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class onTouchForwarded extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected splitString HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final View HaptikSDK$c;
    public final ImageView ag$a;
    public final androidx.constraintlayout.widget.ConstraintLayout ah$a;
    public final View ah$b;
    public final View getInitSettings;
    public final D11TextInputLayout invoke;
    public final CustomTextInputEditText toString;
    public final ImageView valueOf;
    public final PrimaryButton values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onTouchForwarded(Object obj, View view, int i, PrimaryButton primaryButton, ImageView imageView, ImageView imageView2, CustomTextInputEditText customTextInputEditText, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, D11TextInputLayout d11TextInputLayout, D11TextView d11TextView, View view2, View view3, View view4) {
        super(obj, view, i);
        this.values = primaryButton;
        this.valueOf = imageView;
        this.ag$a = imageView2;
        this.toString = customTextInputEditText;
        this.ah$a = constraintLayout;
        this.invoke = d11TextInputLayout;
        this.HaptikSDK$b = d11TextView;
        this.HaptikSDK$c = view2;
        this.ah$b = view3;
        this.getInitSettings = view4;
    }
}
