package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
/* loaded from: classes2.dex */
public class setPrimaryBackground extends isCollapsed {
    private static final SparseIntArray HaptikSDK$b;
    private static final ViewDataBinding.IncludedLayouts values = null;
    private final FrameLayout ah$b;
    private long invoke;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        HaptikSDK$b = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.loyaltyLevelCard, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.res_0x7f0a05ee, 2);
        sparseIntArray.put(com.app.dream11Pro.R.id.lock, 3);
    }

    public setPrimaryBackground(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, values, HaptikSDK$b));
    }

    private setPrimaryBackground(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (androidx.appcompat.widget.AppCompatImageView) objArr[2], (androidx.appcompat.widget.AppCompatImageView) objArr[3], (androidx.constraintlayout.widget.ConstraintLayout) objArr[1]);
        this.invoke = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.ah$b = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.invoke = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.invoke != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (532 == i) {
            toString((increaseErrorId) obj);
            return true;
        }
        return false;
    }

    @Override // o.isCollapsed
    public void toString(increaseErrorId increaseerrorid) {
        this.valueOf = increaseerrorid;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.invoke = 0L;
        }
    }
}
