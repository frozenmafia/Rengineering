package o;

import android.view.View;
import com.app.dream11.ui.CustomTextView;
import o.R;
/* loaded from: classes3.dex */
public abstract class setTitleStyle extends androidx.databinding.ViewDataBinding {
    public final androidx.constraintlayout.widget.Guideline HaptikSDK$a;
    public final androidx.constraintlayout.widget.Guideline HaptikSDK$b;
    public final R.xml HaptikSDK$c;
    public final CustomTextView HaptikWebView;
    public final CustomTextView ag$a;
    public final View ah$a;
    @androidx.databinding.Bindable
    protected Parent ah$b;
    public final androidx.constraintlayout.widget.Guideline getInitSettings;
    public final CustomTextView getSignupData;
    public final View invoke;
    public final CustomTextView toString;
    public final CustomTextView valueOf;
    public final CustomTextView values;

    public abstract void values(Parent parent);

    /* JADX INFO: Access modifiers changed from: protected */
    public setTitleStyle(Object obj, View view, int i, CustomTextView customTextView, View view2, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, androidx.constraintlayout.widget.Guideline guideline, R.xml xmlVar, View view3, androidx.constraintlayout.widget.Guideline guideline2, CustomTextView customTextView5, androidx.constraintlayout.widget.Guideline guideline3, CustomTextView customTextView6) {
        super(obj, view, i);
        this.ag$a = customTextView;
        this.ah$a = view2;
        this.valueOf = customTextView2;
        this.toString = customTextView3;
        this.values = customTextView4;
        this.HaptikSDK$b = guideline;
        this.HaptikSDK$c = xmlVar;
        this.invoke = view3;
        this.HaptikSDK$a = guideline2;
        this.HaptikWebView = customTextView5;
        this.getInitSettings = guideline3;
        this.getSignupData = customTextView6;
    }
}
