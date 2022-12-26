package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class parseBundleExtras extends androidx.databinding.ViewDataBinding {
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout HaptikSDK$a;
    public final DreamRecyclerView HaptikSDK$b;
    public final ProgressBar HaptikSDK$c;
    public final RelativeLayout HaptikSDK$d;
    public final ImageView ag$a;
    public final D11TextView ah$a;
    public final RelativeLayout ah$b;
    public final RelativeLayout getInitSettings;
    public final D11TextView getSignupData;
    @androidx.databinding.Bindable
    protected setDefaults invoke;
    public final D11ErrorFrameLayout toString;
    public final D11TextView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public parseBundleExtras(Object obj, View view, int i, D11TextView d11TextView, D11TextView d11TextView2, D11ErrorFrameLayout d11ErrorFrameLayout, ImageView imageView, ImageView imageView2, DreamRecyclerView dreamRecyclerView, RelativeLayout relativeLayout, ProgressBar progressBar, androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, D11TextView d11TextView3) {
        super(obj, view, i);
        this.ah$a = d11TextView;
        this.valueOf = d11TextView2;
        this.toString = d11ErrorFrameLayout;
        this.values = imageView;
        this.ag$a = imageView2;
        this.HaptikSDK$b = dreamRecyclerView;
        this.ah$b = relativeLayout;
        this.HaptikSDK$c = progressBar;
        this.HaptikSDK$a = swipeRefreshLayout;
        this.HaptikSDK$d = relativeLayout2;
        this.getInitSettings = relativeLayout3;
        this.getSignupData = d11TextView3;
    }
}
