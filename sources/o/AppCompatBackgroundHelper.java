package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.app.dream11.core.performance.D11LinearLayoutTracker;
import com.app.dream11.core.service.graphql.api.fragment.HallOfFameUsersFragment;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class AppCompatBackgroundHelper extends androidx.databinding.ViewDataBinding {
    public final D11LinearLayoutTracker HaptikSDK$a;
    @androidx.databinding.Bindable
    protected maxSize HaptikSDK$b;
    @androidx.databinding.Bindable
    protected String HaptikSDK$c;
    public final RelativeLayout HaptikSDK$d;
    public final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$e;
    @androidx.databinding.Bindable
    protected LruCacheKt$lruCache$4 HaptikWebView;
    public final D11TextView a;
    public final CircularImageView ag$a;
    public final D11TextView ah$a;
    public final ImageView ah$b;
    public final RelativeLayout aj$a;
    public final D11TextView ak;
    public final RelativeLayout getInitSettings;
    @androidx.databinding.Bindable
    protected Boolean getSignupData;
    @androidx.databinding.Bindable
    protected HallOfFameUsersFragment invoke;
    public final D11TextView toString;
    public final D11TextView valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppCompatBackgroundHelper(Object obj, View view, int i, CircularImageView circularImageView, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4, ImageView imageView, D11LinearLayoutTracker d11LinearLayoutTracker, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, RelativeLayout relativeLayout3, D11TextView d11TextView5, D11TextView d11TextView6) {
        super(obj, view, i);
        this.ag$a = circularImageView;
        this.valueOf = d11TextView;
        this.values = d11TextView2;
        this.toString = d11TextView3;
        this.ah$a = d11TextView4;
        this.ah$b = imageView;
        this.HaptikSDK$a = d11LinearLayoutTracker;
        this.getInitSettings = relativeLayout;
        this.HaptikSDK$d = relativeLayout2;
        this.HaptikSDK$e = constraintLayout;
        this.aj$a = relativeLayout3;
        this.a = d11TextView5;
        this.ak = d11TextView6;
    }
}
