package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.app.dream11.contest.ContestItemVM;
import com.dream11.design.button.D11Button;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class onSetBackgroundDrawable extends androidx.databinding.ViewDataBinding {
    public final ProgressBar HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final D11TextView HaptikSDK$d;
    public final D11TextView HaptikSDK$e;
    public final D11TextView HaptikWebView;
    @androidx.databinding.Bindable
    protected ContestItemVM ag$a;
    public final LinearLayout ah$a;
    public final D11TextView ah$b;
    public final androidx.constraintlayout.widget.Barrier getInitSettings;
    public final D11TextView getSignupData;
    public final D11TextView invoke;
    public final ImageView toString;
    public final LinearLayout valueOf;
    public final D11Button values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onSetBackgroundDrawable(Object obj, View view, int i, D11Button d11Button, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, ProgressBar progressBar, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4, D11TextView d11TextView5, D11TextView d11TextView6, D11TextView d11TextView7, D11TextView d11TextView8, androidx.constraintlayout.widget.Barrier barrier) {
        super(obj, view, i);
        this.values = d11Button;
        this.valueOf = linearLayout;
        this.ah$a = linearLayout2;
        this.toString = imageView;
        this.HaptikSDK$a = progressBar;
        this.invoke = d11TextView;
        this.ah$b = d11TextView2;
        this.HaptikSDK$c = d11TextView3;
        this.HaptikSDK$b = d11TextView4;
        this.HaptikWebView = d11TextView5;
        this.HaptikSDK$d = d11TextView6;
        this.getSignupData = d11TextView7;
        this.HaptikSDK$e = d11TextView8;
        this.getInitSettings = barrier;
    }
}
