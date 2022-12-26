package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public class ResourcesWrapper extends getBoolean {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray valueOf = null;
    private long ah$b;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public ResourcesWrapper(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ag$a, valueOf));
    }

    private ResourcesWrapper(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CustomTextView) objArr[1], (LinearLayout) objArr[0]);
        this.ah$b = -1L;
        this.ah$a.setTag(null);
        this.values.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ah$b = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ah$b != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (69 == i) {
            ag$a((String) obj);
            return true;
        }
        return false;
    }

    public void ag$a(String str) {
        this.toString = str;
        synchronized (this) {
            this.ah$b |= 1;
        }
        notifyPropertyChanged(69);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.ah$b;
            this.ah$b = 0L;
        }
        String str = this.toString;
        if ((j & 3) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ah$a, str);
        }
    }
}
