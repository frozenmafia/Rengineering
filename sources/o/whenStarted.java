package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
/* loaded from: classes4.dex */
public class whenStarted extends whenResumed {
    private static final SparseIntArray toString = null;
    private static final ViewDataBinding.IncludedLayouts values = null;
    private long ag$a;
    private final RelativeLayout ah$a;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    public whenStarted(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, values, toString));
    }

    private whenStarted(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.ag$a = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.ah$a = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ag$a = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.ag$a = 0L;
        }
    }
}
