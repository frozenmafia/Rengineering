package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.app.dream11.core.performance.D11ConstraintLayoutTracker;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.newhome.CustomSwipeToRefresh;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class getActivityIconWithCache extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final DreamRecyclerView HaptikSDK$b;
    public final CustomSwipeToRefresh HaptikSDK$c;
    @androidx.databinding.Bindable
    protected setArrowShaftLength ag$a;
    public final D11ErrorFrameLayout ah$a;
    public final D11TextView ah$b;
    public final ProgressBar toString;
    public final ImageView valueOf;
    public final D11ConstraintLayoutTracker values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getActivityIconWithCache(Object obj, View view, int i, D11ErrorFrameLayout d11ErrorFrameLayout, D11ConstraintLayoutTracker d11ConstraintLayoutTracker, ImageView imageView, ProgressBar progressBar, DreamRecyclerView dreamRecyclerView, CustomSwipeToRefresh customSwipeToRefresh, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.ah$a = d11ErrorFrameLayout;
        this.values = d11ConstraintLayoutTracker;
        this.valueOf = imageView;
        this.toString = progressBar;
        this.HaptikSDK$b = dreamRecyclerView;
        this.HaptikSDK$c = customSwipeToRefresh;
        this.HaptikSDK$a = d11TextView;
        this.ah$b = d11TextView2;
    }
}
