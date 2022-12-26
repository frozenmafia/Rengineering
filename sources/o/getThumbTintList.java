package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public class getThumbTintList extends getTextOn {
    private static final SparseIntArray ah$a = null;
    private static final ViewDataBinding.IncludedLayouts toString = null;
    private final LinearLayout HaptikSDK$a;
    private long invoke;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public getThumbTintList(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, toString, ah$a));
    }

    private getThumbTintList(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (D11TextView) objArr[2], (D11TextView) objArr[1]);
        this.invoke = -1L;
        this.ag$a.setTag(null);
        this.valueOf.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.HaptikSDK$a = linearLayout;
        linearLayout.setTag(null);
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
            ag$a((calcPathPosition) obj);
            return true;
        }
        return false;
    }

    public void ag$a(calcPathPosition calcpathposition) {
        this.values = calcpathposition;
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
        calcPathPosition calcpathposition = this.values;
        int i = 0;
        String str2 = null;
        int i2 = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i2 == 0 || calcpathposition == null) {
            str = null;
        } else {
            String ag$a = calcpathposition.ag$a();
            String ah$a2 = calcpathposition.ah$a();
            i = calcpathposition.values();
            str2 = ah$a2;
            str = ag$a;
        }
        if (i2 != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ag$a, str2);
            this.ag$a.setTextColor(i);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.valueOf, str);
            this.valueOf.setTextColor(i);
        }
    }
}
