package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes3.dex */
public class getContentInsetStart extends getContentInsetEnd {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray values = null;
    private final ShimmerFrameLayout ah$a;
    private long toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public getContentInsetStart(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ag$a, values));
    }

    private getContentInsetStart(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
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
        if (186 == i) {
            valueOf((Boolean) obj);
            return true;
        }
        return false;
    }

    @Override // o.getContentInsetEnd
    public void valueOf(Boolean bool) {
        this.valueOf = bool;
        synchronized (this) {
            this.toString |= 1;
        }
        notifyPropertyChanged(186);
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
        if ((j & 3) != 0) {
            addCapabilityBinding.valueOf(this.ah$a, bool);
        }
    }
}
