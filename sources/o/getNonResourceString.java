package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.app.dream11.contest.ContestItemVM;
import com.app.dream11.core.performance.D11RelativeLayoutTracker;
import com.dream11.design.button.D11Button;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class getNonResourceString extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    @androidx.databinding.Bindable
    protected ContestItemVM HaptikSDK$b;
    public final ProgressBar HaptikSDK$c;
    public final D11TextView HaptikSDK$d;
    public final D11TextView HaptikSDK$e;
    public final D11TextView HaptikWebView;
    public final D11TextView a;
    public final D11Button ag$a;
    public final D11TextView ah$a;
    public final RelativeLayout ah$b;
    public final LinearLayout getInitSettings;
    public final D11TextView getSignupData;
    public final D11RelativeLayoutTracker invoke;
    public final View onXdkEvent;
    public final D11TextView toString;
    public final androidx.appcompat.widget.AppCompatImageView valueOf;
    public final LinearLayout values;

    public abstract void ag$a(ContestItemVM contestItemVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public getNonResourceString(Object obj, View view, int i, LinearLayout linearLayout, androidx.appcompat.widget.AppCompatImageView appCompatImageView, D11Button d11Button, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, D11RelativeLayoutTracker d11RelativeLayoutTracker, ProgressBar progressBar, RelativeLayout relativeLayout, LinearLayout linearLayout2, D11TextView d11TextView4, D11TextView d11TextView5, D11TextView d11TextView6, D11TextView d11TextView7, D11TextView d11TextView8, View view2) {
        super(obj, view, i);
        this.values = linearLayout;
        this.valueOf = appCompatImageView;
        this.ag$a = d11Button;
        this.ah$a = d11TextView;
        this.toString = d11TextView2;
        this.HaptikSDK$a = d11TextView3;
        this.invoke = d11RelativeLayoutTracker;
        this.HaptikSDK$c = progressBar;
        this.ah$b = relativeLayout;
        this.getInitSettings = linearLayout2;
        this.HaptikWebView = d11TextView4;
        this.getSignupData = d11TextView5;
        this.HaptikSDK$d = d11TextView6;
        this.HaptikSDK$e = d11TextView7;
        this.a = d11TextView8;
        this.onXdkEvent = view2;
    }
}
