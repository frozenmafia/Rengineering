package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes3.dex */
public class setNavigationBarColor extends setNavigationBarDividerColor {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray valueOf;
    private long ah$a;
    private final LinearLayout toString;

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
        sparseIntArray.put(com.app.dream11Pro.R.id.res_0x7f0a0a71, 1);
    }

    public setNavigationBarColor(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ag$a, valueOf));
    }

    private setNavigationBarColor(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (DreamRecyclerView) objArr[1]);
        this.ah$a = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.toString = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ah$a = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.ah$a = 0L;
        }
    }
}
