package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
/* loaded from: classes3.dex */
public class onPopulateAccessibilityEvent extends setSwitchPadding {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray valueOf = null;
    private long ah$a;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public onPopulateAccessibilityEvent(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ag$a, valueOf));
    }

    private onPopulateAccessibilityEvent(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[0]);
        this.ah$a = -1L;
        this.toString.setTag(null);
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
        if (268 == i) {
            toString((View.OnClickListener) obj);
            return true;
        }
        return false;
    }

    @Override // o.setSwitchPadding
    public void toString(View.OnClickListener onClickListener) {
        this.values = onClickListener;
        synchronized (this) {
            this.ah$a |= 1;
        }
        notifyPropertyChanged(268);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.ah$a;
            this.ah$a = 0L;
        }
        View.OnClickListener onClickListener = this.values;
        if ((j & 3) != 0) {
            this.toString.setOnClickListener(onClickListener);
        }
    }
}
