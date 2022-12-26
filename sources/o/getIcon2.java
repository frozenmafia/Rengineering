package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.app.dream11.ui.CustomButton;
import com.app.dream11.ui.CustomEditTextView;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes2.dex */
public abstract class getIcon2 extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected getChildren HaptikSDK$a;
    @androidx.databinding.Bindable
    protected setPaddingEnd HaptikSDK$c;
    public final LinearLayout ag$a;
    public final CustomButton ah$a;
    public final TextInputLayout invoke;
    public final RelativeLayout toString;
    public final getStartIcon valueOf;
    public final CustomEditTextView values;

    public abstract void toString(getChildren getchildren);

    public abstract void values(setPaddingEnd setpaddingend);

    /* JADX INFO: Access modifiers changed from: protected */
    public getIcon2(Object obj, View view, int i, CustomButton customButton, RelativeLayout relativeLayout, getStartIcon getstarticon, CustomEditTextView customEditTextView, LinearLayout linearLayout, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.ah$a = customButton;
        this.toString = relativeLayout;
        this.valueOf = getstarticon;
        this.values = customEditTextView;
        this.ag$a = linearLayout;
        this.invoke = textInputLayout;
    }
}
