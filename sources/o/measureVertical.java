package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public class measureVertical extends setBaselineAligned {
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private static final SparseIntArray valueOf = null;
    private final LinearLayout ag$a;
    private final CustomTextView invoke;
    private long toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public measureVertical(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ah$a, valueOf));
    }

    private measureVertical(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.toString = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.ag$a = linearLayout;
        linearLayout.setTag(null);
        CustomTextView customTextView = (CustomTextView) objArr[1];
        this.invoke = customTextView;
        customTextView.setTag(null);
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
        if (495 == i) {
            valueOf((String) obj);
            return true;
        }
        return false;
    }

    public void valueOf(String str) {
        this.values = str;
        synchronized (this) {
            this.toString |= 1;
        }
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.text);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.toString;
            this.toString = 0L;
        }
        String str = this.values;
        if ((j & 3) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.invoke, str);
        }
    }
}
