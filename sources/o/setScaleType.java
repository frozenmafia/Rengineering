package o;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.app.dream11.core.performance.D11CustomTabLayoutTracker;
import com.app.dream11.newhome.CustomSwipeToRefresh;
import com.app.dream11.ui.EventsViewPager;
import com.app.dream11.ui.gradienttablayout.Dream11GradientTabLayout;
/* loaded from: classes3.dex */
public abstract class setScaleType extends androidx.databinding.ViewDataBinding {
    public final D11CustomTabLayoutTracker HaptikSDK$a;
    public final RelativeLayout HaptikSDK$b;
    public final RelativeLayout HaptikSDK$c;
    public final View ag$a;
    public final EventsViewPager ah$a;
    public final CustomSwipeToRefresh ah$b;
    public final RelativeLayout invoke;
    public final ProgressBar toString;
    @androidx.databinding.Bindable
    protected isInVirtualLayout valueOf;
    public final Dream11GradientTabLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setScaleType(Object obj, View view, int i, EventsViewPager eventsViewPager, View view2, Dream11GradientTabLayout dream11GradientTabLayout, ProgressBar progressBar, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, CustomSwipeToRefresh customSwipeToRefresh, D11CustomTabLayoutTracker d11CustomTabLayoutTracker) {
        super(obj, view, i);
        this.ah$a = eventsViewPager;
        this.ag$a = view2;
        this.values = dream11GradientTabLayout;
        this.toString = progressBar;
        this.invoke = relativeLayout;
        this.HaptikSDK$b = relativeLayout2;
        this.HaptikSDK$c = relativeLayout3;
        this.ah$b = customSwipeToRefresh;
        this.HaptikSDK$a = d11CustomTabLayoutTracker;
    }
}
