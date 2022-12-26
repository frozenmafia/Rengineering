package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.chatlist.contestinvitebottomsheet.AllContestInviteHeaderVM;
import com.app.dream11.ui.CountDownTimerTextView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class pullChildren extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected AllContestInviteHeaderVM HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final D11TextView HaptikSDK$d;
    public final CountDownTimerTextView HaptikWebView;
    public final View ag$a;
    public final ImageView ah$a;
    public final D11TextView ah$b;
    public final D11TextView getInitSettings;
    public final D11TextView getSignupData;
    public final androidx.constraintlayout.widget.Guideline invoke;
    public final ImageView toString;
    public final ImageView valueOf;
    public final ImageView values;

    public abstract void toString(AllContestInviteHeaderVM allContestInviteHeaderVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public pullChildren(Object obj, View view, int i, ImageView imageView, View view2, ImageView imageView2, ImageView imageView3, ImageView imageView4, androidx.constraintlayout.widget.Guideline guideline, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4, D11TextView d11TextView5, CountDownTimerTextView countDownTimerTextView, D11TextView d11TextView6) {
        super(obj, view, i);
        this.valueOf = imageView;
        this.ag$a = view2;
        this.ah$a = imageView2;
        this.toString = imageView3;
        this.values = imageView4;
        this.invoke = guideline;
        this.HaptikSDK$c = d11TextView;
        this.HaptikSDK$b = d11TextView2;
        this.ah$b = d11TextView3;
        this.getSignupData = d11TextView4;
        this.getInitSettings = d11TextView5;
        this.HaptikWebView = countDownTimerTextView;
        this.HaptikSDK$d = d11TextView6;
    }
}
