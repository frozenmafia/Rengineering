package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes2.dex */
public class updateSelectorStateCompat extends setSelectorEnabled {
    private static final SparseIntArray ah$a;
    private static final ViewDataBinding.IncludedLayouts toString = null;
    private long HaptikSDK$a;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ah$a = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.contentFrame, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.actionsRv, 2);
    }

    public updateSelectorStateCompat(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, toString, ah$a));
    }

    private updateSelectorStateCompat(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (DreamRecyclerView) objArr[2], (LinearLayout) objArr[1], (LinearLayout) objArr[0]);
        this.HaptikSDK$a = -1L;
        this.ag$a.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.HaptikSDK$a = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.HaptikSDK$a != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.HaptikSDK$a = 0L;
        }
    }
}
