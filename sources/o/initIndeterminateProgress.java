package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public class initIndeterminateProgress extends hasExpandedActionView {
    private static final SparseIntArray ag$a = null;
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private long values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public initIndeterminateProgress(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ah$a, ag$a));
    }

    private initIndeterminateProgress(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ShimmerFrameLayout) objArr[0]);
        this.values = -1L;
        this.valueOf.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
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

    @Override // o.hasExpandedActionView
    public void valueOf(Boolean bool) {
        this.toString = bool;
        synchronized (this) {
            this.values |= 1;
        }
        notifyPropertyChanged(384);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.values;
            this.values = 0L;
        }
        Boolean bool = this.toString;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        boolean safeUnbox = i != 0 ? androidx.databinding.ViewDataBinding.safeUnbox(bool) : false;
        if (i != 0) {
            addCapabilityBinding.valueOf(this.valueOf, bool);
            addCapabilityBinding.ah$a(this.valueOf, safeUnbox);
        }
    }
}
