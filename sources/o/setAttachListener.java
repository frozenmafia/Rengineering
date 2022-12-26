package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public class setAttachListener extends getFixedWidthMinor {
    private static final ViewDataBinding.IncludedLayouts valueOf = null;
    private static final SparseIntArray values = null;
    private long ag$a;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public setAttachListener(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, valueOf, values));
    }

    private setAttachListener(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ShimmerFrameLayout) objArr[0]);
        this.ag$a = -1L;
        this.toString.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ag$a = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ag$a != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (384 == i) {
            values((Boolean) obj);
            return true;
        }
        return false;
    }

    public void values(Boolean bool) {
        this.ah$a = bool;
        synchronized (this) {
            this.ag$a |= 1;
        }
        notifyPropertyChanged(384);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.ag$a;
            this.ag$a = 0L;
        }
        Boolean bool = this.ah$a;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        boolean safeUnbox = i != 0 ? androidx.databinding.ViewDataBinding.safeUnbox(bool) : false;
        if (i != 0) {
            addCapabilityBinding.valueOf(this.toString, bool);
            addCapabilityBinding.ah$a(this.toString, safeUnbox);
        }
    }
}
