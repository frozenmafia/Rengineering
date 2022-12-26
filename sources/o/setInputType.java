package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.newhome.CustomTabLayout;
import com.app.dream11.social.headerview.FollowFollowerHeader;
import com.app.dream11.ui.EventsViewPager;
/* loaded from: classes2.dex */
public class setInputType extends setAppSearchData {
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private static final SparseIntArray invoke;
    private long HaptikSDK$b;
    private final RelativeLayout ah$b;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        invoke = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.res_0x7f0a05a9, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.title_strip, 2);
        sparseIntArray.put(com.app.dream11Pro.R.id.vp_follow_followers, 3);
    }

    public setInputType(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, ah$a, invoke));
    }

    private setInputType(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (FollowFollowerHeader) objArr[1], (CustomTabLayout) objArr[2], (EventsViewPager) objArr[3]);
        this.HaptikSDK$b = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.ah$b = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.HaptikSDK$b = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.HaptikSDK$b != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (120 == i) {
            ag$a((getChannels) obj);
            return true;
        }
        return false;
    }

    public void ag$a(getChannels getchannels) {
        this.values = getchannels;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return values((getChannels) obj, i2);
    }

    private boolean values(getChannels getchannels, int i) {
        if (i == 0) {
            synchronized (this) {
                this.HaptikSDK$b |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.HaptikSDK$b = 0L;
        }
    }
}
