package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public class getSwitchPadding extends getSwitchMinWidth {
    private static final ViewDataBinding.IncludedLayouts toString = null;
    private static final SparseIntArray valueOf = null;
    private final LinearLayout ah$b;
    private long invoke;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public getSwitchPadding(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, toString, valueOf));
    }

    private getSwitchPadding(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (D11TextView) objArr[2], (D11TextView) objArr[1]);
        this.invoke = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.ah$b = linearLayout;
        linearLayout.setTag(null);
        this.ag$a.setTag(null);
        this.ah$a.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.invoke = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.invoke != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (263 == i) {
            ag$a((applyToWithoutCustom) obj);
            return true;
        }
        return false;
    }

    public void ag$a(applyToWithoutCustom applytowithoutcustom) {
        this.values = applytowithoutcustom;
        synchronized (this) {
            this.invoke |= 1;
        }
        notifyPropertyChanged(263);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        String str;
        synchronized (this) {
            j = this.invoke;
            this.invoke = 0L;
        }
        applyToWithoutCustom applytowithoutcustom = this.values;
        String str2 = null;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i == 0 || applytowithoutcustom == null) {
            str = null;
        } else {
            str2 = applytowithoutcustom.ah$a();
            str = applytowithoutcustom.ag$a();
        }
        if (i != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ag$a, str2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ah$a, str);
        }
    }
}
