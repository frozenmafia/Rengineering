package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.dream11.design.button.D11Button;
import com.dream11.design.textview.D11TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes2.dex */
public abstract class getStart extends androidx.databinding.ViewDataBinding {
    public final ImageView HaptikSDK$a;
    public final ImageView HaptikSDK$b;
    public final LinearLayout HaptikSDK$c;
    public final D11TextView HaptikWebView;
    public final D11TextView ag$a;
    public final TextInputLayout ah$a;
    @androidx.databinding.Bindable
    protected RequiresPermission ah$b;
    public final D11TextView getSignupData;
    public final D11TextView invoke;
    public final TextInputEditText toString;
    public final D11Button valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getStart(Object obj, View view, int i, TextInputEditText textInputEditText, D11TextView d11TextView, D11Button d11Button, TextInputLayout textInputLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4) {
        super(obj, view, i);
        this.toString = textInputEditText;
        this.ag$a = d11TextView;
        this.valueOf = d11Button;
        this.ah$a = textInputLayout;
        this.values = imageView;
        this.HaptikSDK$a = imageView2;
        this.HaptikSDK$b = imageView3;
        this.HaptikSDK$c = linearLayout;
        this.invoke = d11TextView2;
        this.getSignupData = d11TextView3;
        this.HaptikWebView = d11TextView4;
    }
}
