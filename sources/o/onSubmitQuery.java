package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.OtpLayout;
import o.MotionScene;
/* loaded from: classes2.dex */
public abstract class onSubmitQuery extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$b;
    public final CustomTextView ag$a;
    public final CustomTextView ah$a;
    public final CustomTextView ah$b;
    public final OtpLayout toString;
    @androidx.databinding.Bindable
    protected MotionScene.Transition.TransitionOnClick valueOf;
    public final LinearLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onSubmitQuery(Object obj, View view, int i, LinearLayout linearLayout, OtpLayout otpLayout, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4) {
        super(obj, view, i);
        this.values = linearLayout;
        this.toString = otpLayout;
        this.ah$a = customTextView;
        this.ag$a = customTextView2;
        this.HaptikSDK$b = customTextView3;
        this.ah$b = customTextView4;
    }
}
