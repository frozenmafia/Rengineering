package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardVm;
import com.app.dream11.ui.CountDownTimerTextView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class setThumbTintList extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    @androidx.databinding.Bindable
    protected Boolean HaptikSDK$b;
    @androidx.databinding.Bindable
    protected TeamShareCardVm HaptikSDK$c;
    public final D11TextView HaptikSDK$d;
    public final D11TextView HaptikSDK$e;
    public final D11TextView HaptikWebView;
    public final androidx.constraintlayout.widget.Guideline ag$a;
    public final ImageView ah$a;
    public final D11TextView ah$b;
    public final D11TextView aj$a;
    public final D11TextView ak;
    public final androidx.constraintlayout.widget.Guideline getInitSettings;
    public final D11TextView getSignupData;
    public final D11TextView invoke;
    public final CountDownTimerTextView isLogoutPending;
    public final View toString;
    public final androidx.constraintlayout.widget.Guideline valueOf;
    public final ImageView values;

    public abstract void ag$a(Boolean bool);

    public abstract void toString(TeamShareCardVm teamShareCardVm);

    /* JADX INFO: Access modifiers changed from: protected */
    public setThumbTintList(Object obj, View view, int i, androidx.constraintlayout.widget.Guideline guideline, View view2, androidx.constraintlayout.widget.Guideline guideline2, ImageView imageView, ImageView imageView2, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, androidx.constraintlayout.widget.Guideline guideline3, D11TextView d11TextView4, D11TextView d11TextView5, D11TextView d11TextView6, D11TextView d11TextView7, D11TextView d11TextView8, D11TextView d11TextView9, CountDownTimerTextView countDownTimerTextView) {
        super(obj, view, i);
        this.ag$a = guideline;
        this.toString = view2;
        this.valueOf = guideline2;
        this.ah$a = imageView;
        this.values = imageView2;
        this.ah$b = d11TextView;
        this.HaptikSDK$a = d11TextView2;
        this.invoke = d11TextView3;
        this.getInitSettings = guideline3;
        this.HaptikSDK$e = d11TextView4;
        this.HaptikSDK$d = d11TextView5;
        this.HaptikWebView = d11TextView6;
        this.getSignupData = d11TextView7;
        this.ak = d11TextView8;
        this.aj$a = d11TextView9;
        this.isLogoutPending = countDownTimerTextView;
    }
}
