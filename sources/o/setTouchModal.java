package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.core.performance.D11TabLayoutTrackerWithCount;
import com.app.dream11.ui.EventsViewPager;
import o.ActionBar;
/* loaded from: classes2.dex */
public abstract class setTouchModal extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected Integer ag$a;
    public final EventsViewPager ah$a;
    public final LinearLayout toString;
    public final D11TabLayoutTrackerWithCount valueOf;
    @androidx.databinding.Bindable
    protected ActionBar.OnNavigationListener values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setTouchModal(Object obj, View view, int i, EventsViewPager eventsViewPager, LinearLayout linearLayout, D11TabLayoutTrackerWithCount d11TabLayoutTrackerWithCount) {
        super(obj, view, i);
        this.ah$a = eventsViewPager;
        this.toString = linearLayout;
        this.valueOf = d11TabLayoutTrackerWithCount;
    }
}
