package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.core.performance.D11LinearLayoutTracker;
import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class MenuItemHoverListener extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final ImageView HaptikSDK$c;
    public final D11TextView HaptikWebView;
    @androidx.databinding.Bindable
    protected MatchStatus ag$a;
    public final ImageView ah$a;
    public final D11TextView ah$b;
    public final D11TextView getSignupData;
    public final D11TextView invoke;
    public final D11LinearLayoutTracker toString;
    @androidx.databinding.Bindable
    protected setOnlyAlertOnce valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuItemHoverListener(Object obj, View view, int i, ImageView imageView, ImageView imageView2, D11LinearLayoutTracker d11LinearLayoutTracker, ImageView imageView3, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4, D11TextView d11TextView5, D11TextView d11TextView6) {
        super(obj, view, i);
        this.values = imageView;
        this.ah$a = imageView2;
        this.toString = d11LinearLayoutTracker;
        this.HaptikSDK$c = imageView3;
        this.HaptikSDK$a = d11TextView;
        this.ah$b = d11TextView2;
        this.HaptikSDK$b = d11TextView3;
        this.invoke = d11TextView4;
        this.getSignupData = d11TextView5;
        this.HaptikWebView = d11TextView6;
    }
}
