package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.dream11.design.button.D11Button;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class setSuggestionsAdapter extends androidx.databinding.ViewDataBinding {
    public final ImageView HaptikSDK$a;
    public final LinearLayout HaptikSDK$b;
    public final ImageView HaptikSDK$c;
    public final android.widget.Space HaptikSDK$d;
    public final D11TextView HaptikSDK$e;
    @androidx.databinding.Bindable
    protected level HaptikWebView;
    public final D11Button ag$a;
    public final ImageView ah$a;
    public final LinearLayout ah$b;
    public final D11TextView ak;
    public final D11TextView getInitSettings;
    public final android.widget.Space getSignupData;
    public final LinearLayout invoke;
    public final D11TextView isLogoutPending;
    public final ImageView toString;
    public final ImageView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setSuggestionsAdapter(Object obj, View view, int i, D11Button d11Button, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, android.widget.Space space, android.widget.Space space2, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4) {
        super(obj, view, i);
        this.ag$a = d11Button;
        this.values = imageView;
        this.valueOf = imageView2;
        this.ah$a = imageView3;
        this.toString = imageView4;
        this.HaptikSDK$c = imageView5;
        this.HaptikSDK$a = imageView6;
        this.ah$b = linearLayout;
        this.invoke = linearLayout2;
        this.HaptikSDK$b = linearLayout3;
        this.HaptikSDK$d = space;
        this.getSignupData = space2;
        this.getInitSettings = d11TextView;
        this.HaptikSDK$e = d11TextView2;
        this.ak = d11TextView3;
        this.isLogoutPending = d11TextView4;
    }
}
