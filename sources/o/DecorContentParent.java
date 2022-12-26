package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public class DecorContentParent extends getMinWidthMinor {
    private static final SparseIntArray ag$a = null;
    private static final ViewDataBinding.IncludedLayouts values = null;
    private final ShimmerFrameLayout ah$a;
    private long toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public DecorContentParent(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, values, ag$a));
    }

    private DecorContentParent(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.toString = -1L;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) objArr[0];
        this.ah$a = shimmerFrameLayout;
        shimmerFrameLayout.setTag(null);
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
        if (385 == i) {
            ag$a((Boolean) obj);
            return true;
        }
        return false;
    }

    @Override // o.getMinWidthMinor
    public void ag$a(Boolean bool) {
        this.valueOf = bool;
        synchronized (this) {
            this.toString |= 1;
        }
        notifyPropertyChanged(385);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.toString;
            this.toString = 0L;
        }
        Boolean bool = this.valueOf;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        boolean safeUnbox = i != 0 ? androidx.databinding.ViewDataBinding.safeUnbox(bool) : false;
        if (i != 0) {
            addCapabilityBinding.valueOf(this.ah$a, bool);
            addCapabilityBinding.ah$a(this.ah$a, safeUnbox);
        }
    }
}
