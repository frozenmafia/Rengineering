package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.leaguelisting.fancodecomponent.FancodeVideoComponent;
/* loaded from: classes2.dex */
public class setIconified extends setImeOptions {
    private static final SparseIntArray ag$a;
    private static final ViewDataBinding.IncludedLayouts valueOf = null;
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$a;
    private long ah$a;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ag$a = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.fcLive, 1);
    }

    public setIconified(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, valueOf, ag$a));
    }

    private setIconified(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FancodeVideoComponent) objArr[1]);
        this.ah$a = -1L;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.HaptikSDK$a = constraintLayout;
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
        if (532 == i) {
            ag$a((C0371getCurrent) obj);
            return true;
        }
        return false;
    }

    public void ag$a(C0371getCurrent c0371getCurrent) {
        this.toString = c0371getCurrent;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ah$a = 0L;
        }
    }
}
