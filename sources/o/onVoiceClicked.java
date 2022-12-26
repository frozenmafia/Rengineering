package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.model.viewmodel.OtpSubmitPageVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.OtpLayout;
/* loaded from: classes2.dex */
public abstract class onVoiceClicked extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$c;
    public final CustomTextView ag$a;
    @androidx.databinding.Bindable
    protected OtpSubmitPageVM ah$a;
    public final CustomTextView ah$b;
    public final LinearLayout toString;
    public final CustomTextView valueOf;
    public final OtpLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onVoiceClicked(Object obj, View view, int i, LinearLayout linearLayout, OtpLayout otpLayout, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4) {
        super(obj, view, i);
        this.toString = linearLayout;
        this.values = otpLayout;
        this.ag$a = customTextView;
        this.valueOf = customTextView2;
        this.ah$b = customTextView3;
        this.HaptikSDK$c = customTextView4;
    }
}
