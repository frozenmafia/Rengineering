package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public class getFixedHeightMinor extends ButtonBarLayout {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray toString = null;
    private long ah$a;
    private final ShimmerFrameLayout values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public getFixedHeightMinor(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ag$a, toString));
    }

    private getFixedHeightMinor(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.ah$a = -1L;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) objArr[0];
        this.values = shimmerFrameLayout;
        shimmerFrameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ah$a = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ah$a != 0;
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

    @Override // o.ButtonBarLayout
    public void ah$a(Boolean bool) {
        this.valueOf = bool;
        synchronized (this) {
            this.ah$a |= 1;
        }
        notifyPropertyChanged(384);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.ah$a;
            this.ah$a = 0L;
        }
        Boolean bool = this.valueOf;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        boolean safeUnbox = i != 0 ? androidx.databinding.ViewDataBinding.safeUnbox(bool) : false;
        if (i != 0) {
            addCapabilityBinding.valueOf(this.values, bool);
            addCapabilityBinding.ah$a(this.values, safeUnbox);
        }
    }
}
