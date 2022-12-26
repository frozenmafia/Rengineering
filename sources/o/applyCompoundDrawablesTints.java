package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
/* loaded from: classes2.dex */
public class applyCompoundDrawablesTints extends setTextSizeInternal {
    private static final SparseIntArray ah$a = null;
    private static final ViewDataBinding.IncludedLayouts valueOf = null;
    private final androidx.constraintlayout.widget.ConstraintLayout ag$a;
    private long toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public applyCompoundDrawablesTints(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, valueOf, ah$a));
    }

    private applyCompoundDrawablesTints(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.toString = -1L;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.ag$a = constraintLayout;
        constraintLayout.setTag(null);
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
        if (263 == i) {
            valueOf((C0378helper) obj);
            return true;
        }
        return false;
    }

    public void valueOf(C0378helper c0378helper) {
        this.values = c0378helper;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.toString = 0L;
        }
    }
}
