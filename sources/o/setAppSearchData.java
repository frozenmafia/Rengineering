package o;

import android.view.View;
import com.app.dream11.newhome.CustomTabLayout;
import com.app.dream11.social.headerview.FollowFollowerHeader;
import com.app.dream11.ui.EventsViewPager;
/* loaded from: classes2.dex */
public abstract class setAppSearchData extends androidx.databinding.ViewDataBinding {
    public final CustomTabLayout ag$a;
    public final FollowFollowerHeader toString;
    public final EventsViewPager valueOf;
    @androidx.databinding.Bindable
    protected getChannels values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setAppSearchData(Object obj, View view, int i, FollowFollowerHeader followFollowerHeader, CustomTabLayout customTabLayout, EventsViewPager eventsViewPager) {
        super(obj, view, i);
        this.toString = followFollowerHeader;
        this.ag$a = customTabLayout;
        this.valueOf = eventsViewPager;
    }
}
