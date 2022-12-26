package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
/* loaded from: classes2.dex */
public class hasOverlappingRendering extends getSupportImageTintMode {
    private static final ViewDataBinding.IncludedLayouts valueOf = null;
    private static final SparseIntArray values = null;
    private long ah$a;
    private final androidx.constraintlayout.widget.ConstraintLayout toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public hasOverlappingRendering(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, valueOf, values));
    }

    private hasOverlappingRendering(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.ah$a = -1L;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.toString = constraintLayout;
        constraintLayout.setTag(null);
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
        if (263 == i) {
            ah$a((transitionHasReversibleFlag) obj);
            return true;
        }
        return false;
    }

    public void ah$a(transitionHasReversibleFlag transitionhasreversibleflag) {
        this.ag$a = transitionhasreversibleflag;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ah$a = 0L;
        }
    }
}
