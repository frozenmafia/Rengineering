package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public class isStacked extends getNextVisibleChildIndex {
    private static final SparseIntArray valueOf = null;
    private static final ViewDataBinding.IncludedLayouts values = null;
    private long HaptikSDK$c;
    private final View invoke;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public isStacked(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, values, valueOf));
    }

    private isStacked(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ShimmerFrameLayout) objArr[0]);
        this.HaptikSDK$c = -1L;
        View view2 = (View) objArr[1];
        this.invoke = view2;
        view2.setTag(null);
        this.ah$a.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.HaptikSDK$c = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.HaptikSDK$c != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (501 == i) {
            values((Boolean) obj);
        } else if (384 != i) {
            return false;
        } else {
            ag$a((Boolean) obj);
        }
        return true;
    }

    @Override // o.getNextVisibleChildIndex
    public void values(Boolean bool) {
        this.toString = bool;
        synchronized (this) {
            this.HaptikSDK$c |= 1;
        }
        notifyPropertyChanged(501);
        super.requestRebind();
    }

    @Override // o.getNextVisibleChildIndex
    public void ag$a(Boolean bool) {
        this.ag$a = bool;
        synchronized (this) {
            this.HaptikSDK$c |= 2;
        }
        notifyPropertyChanged(384);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.HaptikSDK$c;
            this.HaptikSDK$c = 0L;
        }
        Boolean bool = this.toString;
        Boolean bool2 = this.ag$a;
        int i = ((6 & j) > 0L ? 1 : ((6 & j) == 0L ? 0 : -1));
        boolean safeUnbox = i != 0 ? androidx.databinding.ViewDataBinding.safeUnbox(bool2) : false;
        if ((j & 5) != 0) {
            addCapabilityBinding.valueOf(this.invoke, bool);
        }
        if (i != 0) {
            addCapabilityBinding.valueOf(this.ah$a, bool2);
            addCapabilityBinding.ah$a(this.ah$a, safeUnbox);
        }
    }
}
