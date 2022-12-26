package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CircularTextView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class DialogTitle extends androidx.databinding.ViewDataBinding {
    public final View HaptikSDK$a;
    public final View HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final D11TextView HaptikSDK$d;
    public final ImageView HaptikSDK$e;
    public final D11TextView HaptikWebView;
    public final CircularTextView ag$a;
    public final D11TextView ah$a;
    public final View ah$b;
    public final D11TextView getInitSettings;
    public final CircularTextView getSignupData;
    @androidx.databinding.Bindable
    protected createSpinner invoke;
    public final D11TextView isLogoutPending;
    public final ImageView toString;
    public final D11TextView valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogTitle(Object obj, View view, int i, ImageView imageView, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, CircularTextView circularTextView, D11TextView d11TextView4, View view2, View view3, View view4, ImageView imageView2, D11TextView d11TextView5, D11TextView d11TextView6, D11TextView d11TextView7, CircularTextView circularTextView2, D11TextView d11TextView8) {
        super(obj, view, i);
        this.toString = imageView;
        this.ah$a = d11TextView;
        this.valueOf = d11TextView2;
        this.values = d11TextView3;
        this.ag$a = circularTextView;
        this.HaptikSDK$c = d11TextView4;
        this.HaptikSDK$b = view2;
        this.ah$b = view3;
        this.HaptikSDK$a = view4;
        this.HaptikSDK$e = imageView2;
        this.getInitSettings = d11TextView5;
        this.HaptikWebView = d11TextView6;
        this.HaptikSDK$d = d11TextView7;
        this.getSignupData = circularTextView2;
        this.isLogoutPending = d11TextView8;
    }
}
