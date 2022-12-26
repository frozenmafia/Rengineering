package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.OtpLayout;
/* loaded from: classes2.dex */
public abstract class doAfterTextChanged extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$a;
    public final androidx.constraintlayout.widget.Guideline HaptikSDK$b;
    public final CustomTextView HaptikSDK$c;
    public final CustomTextView HaptikWebView;
    public final LinearLayout ag$a;
    @androidx.databinding.Bindable
    protected removeTransition ah$a;
    public final CustomTextView ah$b;
    public final CustomTextView getSignupData;
    public final OtpLayout invoke;
    public final androidx.constraintlayout.widget.Guideline toString;
    public final CustomTextView valueOf;
    public final androidx.constraintlayout.widget.Barrier values;

    /* JADX INFO: Access modifiers changed from: protected */
    public doAfterTextChanged(Object obj, View view, int i, androidx.constraintlayout.widget.Barrier barrier, CustomTextView customTextView, androidx.constraintlayout.widget.Guideline guideline, LinearLayout linearLayout, OtpLayout otpLayout, androidx.constraintlayout.widget.Guideline guideline2, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, CustomTextView customTextView5, CustomTextView customTextView6) {
        super(obj, view, i);
        this.values = barrier;
        this.valueOf = customTextView;
        this.toString = guideline;
        this.ag$a = linearLayout;
        this.invoke = otpLayout;
        this.HaptikSDK$b = guideline2;
        this.HaptikSDK$a = customTextView2;
        this.ah$b = customTextView3;
        this.HaptikSDK$c = customTextView4;
        this.HaptikWebView = customTextView5;
        this.getSignupData = customTextView6;
    }
}
