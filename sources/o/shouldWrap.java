package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
/* loaded from: classes3.dex */
public class shouldWrap extends getDropDownViewTheme {
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private static final SparseIntArray toString = null;
    private long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    public shouldWrap(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ah$a, toString));
    }

    private shouldWrap(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0]);
        this.valueOf = -1L;
        this.ag$a.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}
