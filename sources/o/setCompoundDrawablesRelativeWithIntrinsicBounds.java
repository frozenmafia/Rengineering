package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public class setCompoundDrawablesRelativeWithIntrinsicBounds extends setFirstBaselineToTopHeight {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray ah$a = null;
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$b;
    private long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public setCompoundDrawablesRelativeWithIntrinsicBounds(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ag$a, ah$a));
    }

    private setCompoundDrawablesRelativeWithIntrinsicBounds(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CustomTextView) objArr[1]);
        this.valueOf = -1L;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.HaptikSDK$b = constraintLayout;
        constraintLayout.setTag(null);
        this.toString.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (263 == i) {
            ag$a((String) obj);
            return true;
        }
        return false;
    }

    public void ag$a(String str) {
        this.values = str;
        synchronized (this) {
            this.valueOf |= 1;
        }
        notifyPropertyChanged(263);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        String str = this.values;
        if ((j & 3) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.toString, str);
        }
    }
}
