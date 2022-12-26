package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
/* loaded from: classes3.dex */
public class getSingleIconChipStyle extends getSingleIconChipIconStyle {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray valueOf;
    private long values;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.playerPager, 1);
    }

    public getSingleIconChipStyle(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ag$a, valueOf));
    }

    private getSingleIconChipStyle(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (D11ErrorFrameLayout) objArr[0], (androidx.viewpager.widget.ViewPager) objArr[1]);
        this.values = -1L;
        this.toString.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
