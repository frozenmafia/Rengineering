package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public class getDropdownSelectedPosition extends getVisibility {
    private static final SparseIntArray ag$a = null;
    private static final ViewDataBinding.IncludedLayouts toString = null;
    private long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public getDropdownSelectedPosition(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, toString, ag$a));
    }

    private getDropdownSelectedPosition(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ShimmerFrameLayout) objArr[0]);
        this.valueOf = -1L;
        this.values.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (384 == i) {
            ah$a((Boolean) obj);
            return true;
        }
        return false;
    }

    @Override // o.getVisibility
    public void ah$a(Boolean bool) {
        this.ah$a = bool;
        synchronized (this) {
            this.valueOf |= 1;
        }
        notifyPropertyChanged(384);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        Boolean bool = this.ah$a;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        boolean safeUnbox = i != 0 ? androidx.databinding.ViewDataBinding.safeUnbox(bool) : false;
        if (i != 0) {
            addCapabilityBinding.valueOf(this.values, bool);
            addCapabilityBinding.ah$a(this.values, safeUnbox);
        }
    }
}
