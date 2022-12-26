package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public class buildShareAction extends buildOpenInBrowserAction {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray valueOf = null;
    private long toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public buildShareAction(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ag$a, valueOf));
    }

    private buildShareAction(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CustomTextView) objArr[0]);
        this.toString = -1L;
        this.values.setTag(null);
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
            ag$a((Integer) obj);
            return true;
        }
        return false;
    }

    public void ag$a(Integer num) {
        this.ah$a = num;
        synchronized (this) {
            this.toString |= 1;
        }
        notifyPropertyChanged(263);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.toString;
            this.toString = 0L;
        }
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        String string = i != 0 ? this.values.getResources().getString(com.app.dream11Pro.R.string.res_0x7f120c98, this.ah$a) : null;
        if (i != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.values, string);
        }
    }
}
