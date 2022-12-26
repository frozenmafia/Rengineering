package o;

import android.view.View;
import android.widget.ProgressBar;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.newhome.CustomTabLayout;
import com.app.dream11.ui.EventsViewPager;
/* loaded from: classes2.dex */
public abstract class setImeVisibility extends androidx.databinding.ViewDataBinding {
    public final EventsViewPager ag$a;
    @androidx.databinding.Bindable
    protected onActivityCreated ah$a;
    public final D11ErrorFrameLayout toString;
    public final ProgressBar valueOf;
    public final CustomTabLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setImeVisibility(Object obj, View view, int i, D11ErrorFrameLayout d11ErrorFrameLayout, ProgressBar progressBar, EventsViewPager eventsViewPager, CustomTabLayout customTabLayout) {
        super(obj, view, i);
        this.toString = d11ErrorFrameLayout;
        this.valueOf = progressBar;
        this.ag$a = eventsViewPager;
        this.values = customTabLayout;
    }
}
