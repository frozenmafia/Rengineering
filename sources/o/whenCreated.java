package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
/* loaded from: classes4.dex */
public class whenCreated extends whenStateAtLeast {
    private static final ViewDataBinding.IncludedLayouts toString = null;
    private static final SparseIntArray valueOf;
    private final RelativeLayout ag$a;
    private long ah$a;

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
        sparseIntArray.put(isSynced$ag$a.pass_benefits_title, 1);
    }

    public whenCreated(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, toString, valueOf));
    }

    private whenCreated(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1]);
        this.ah$a = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.ag$a = relativeLayout;
        relativeLayout.setTag(null);
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
