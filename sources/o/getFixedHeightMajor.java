package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public class getFixedHeightMajor extends dispatchFitSystemWindows {
    private static final SparseIntArray ah$a = null;
    private static final ViewDataBinding.IncludedLayouts values = null;
    private final LinearLayout HaptikSDK$b;
    private long toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public getFixedHeightMajor(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, values, ah$a));
    }

    private getFixedHeightMajor(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ShimmerFrameLayout) objArr[0]);
        this.toString = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.HaptikSDK$b = linearLayout;
        linearLayout.setTag(null);
        this.valueOf.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.toString = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.toString != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (384 == i) {
            valueOf((Boolean) obj);
            return true;
        }
        return false;
    }

    @Override // o.dispatchFitSystemWindows
    public void valueOf(Boolean bool) {
        this.ag$a = bool;
        synchronized (this) {
            this.toString |= 1;
        }
        notifyPropertyChanged(384);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.toString;
            this.toString = 0L;
        }
        Boolean bool = this.ag$a;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        boolean safeUnbox = i != 0 ? androidx.databinding.ViewDataBinding.safeUnbox(bool) : false;
        if (i != 0) {
            addCapabilityBinding.valueOf(this.valueOf, bool);
            addCapabilityBinding.ah$a(this.valueOf, safeUnbox);
        }
    }
}
