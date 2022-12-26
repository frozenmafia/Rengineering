package o;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.app.dream11.model.viewmodel.LoginPageVM;
import com.app.dream11.ui.CustomTextView;
import com.dream11.design.textinput.D11TextInputLayout;
import com.dream11.design.textview.D11TextView;
import com.google.android.material.textfield.TextInputEditText;
/* loaded from: classes3.dex */
public abstract class getSupportedInlineUiVersionsAsBundle extends androidx.databinding.ViewDataBinding {
    public final androidx.cardview.widget.CardView HaptikSDK$a;
    public final TextInputEditText HaptikSDK$b;
    public final CustomTextView HaptikSDK$c;
    public final D11TextInputLayout HaptikSDK$d;
    @androidx.databinding.Bindable
    protected LoginPageVM HaptikSDK$e;
    public final LinearLayout HaptikWebView;
    public final CustomTextView ag$a;
    public final androidx.cardview.widget.CardView ah$a;
    public final LinearLayout ah$b;
    public final CustomTextView getInitSettings;
    public final D11TextView getSignupData;
    public final ImageView invoke;
    public final CustomTextView onXdkEvent;
    public final androidx.cardview.widget.CardView toString;
    public final CheckBox valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getSupportedInlineUiVersionsAsBundle(Object obj, View view, int i, CustomTextView customTextView, CheckBox checkBox, androidx.cardview.widget.CardView cardView, androidx.cardview.widget.CardView cardView2, ImageView imageView, ImageView imageView2, TextInputEditText textInputEditText, androidx.cardview.widget.CardView cardView3, LinearLayout linearLayout, CustomTextView customTextView2, D11TextView d11TextView, D11TextInputLayout d11TextInputLayout, LinearLayout linearLayout2, CustomTextView customTextView3, CustomTextView customTextView4) {
        super(obj, view, i);
        this.ag$a = customTextView;
        this.valueOf = checkBox;
        this.ah$a = cardView;
        this.toString = cardView2;
        this.values = imageView;
        this.invoke = imageView2;
        this.HaptikSDK$b = textInputEditText;
        this.HaptikSDK$a = cardView3;
        this.ah$b = linearLayout;
        this.HaptikSDK$c = customTextView2;
        this.getSignupData = d11TextView;
        this.HaptikSDK$d = d11TextInputLayout;
        this.HaptikWebView = linearLayout2;
        this.getInitSettings = customTextView3;
        this.onXdkEvent = customTextView4;
    }
}
