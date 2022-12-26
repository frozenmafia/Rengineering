package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.textview.D11TextView;
import o.UiVersions;
/* loaded from: classes3.dex */
public class getVersions extends UiVersions.Content {
    private static final SparseIntArray ah$a;
    private static final ViewDataBinding.IncludedLayouts valueOf = null;
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
        ah$a = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.tv_device_id, 1);
    }

    public getVersions(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, valueOf, ah$a));
    }

    private getVersions(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[0], (D11TextView) objArr[1]);
        this.toString = -1L;
        this.values.setTag(null);
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
