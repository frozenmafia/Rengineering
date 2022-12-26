package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes3.dex */
public class ensureLogoView extends addCustomViewsWithGravity {
    private static final SparseIntArray ag$a;
    private static final ViewDataBinding.IncludedLayouts values = null;
    private long toString;

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
        ag$a = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.rvContestDialog, 1);
    }

    public ensureLogoView(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, values, ag$a));
    }

    private ensureLogoView(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RelativeLayout) objArr[0], (DreamRecyclerView) objArr[1]);
        this.toString = -1L;
        this.valueOf.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.toString = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.toString = 0L;
        }
    }
}
