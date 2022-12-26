package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public class setDropDownWidth extends getInternalPopup {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray values = null;
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$a;
    private long toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public setDropDownWidth(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ag$a, values));
    }

    private setDropDownWidth(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CustomTextView) objArr[1]);
        this.toString = -1L;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.HaptikSDK$a = constraintLayout;
        constraintLayout.setTag(null);
        this.valueOf.setTag(null);
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
            values((String) obj);
            return true;
        }
        return false;
    }

    public void values(String str) {
        this.ah$a = str;
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
        String str = this.ah$a;
        if ((j & 3) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.valueOf, str);
        }
    }
}
