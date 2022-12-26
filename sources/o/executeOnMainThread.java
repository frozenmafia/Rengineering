package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.chip.CustomChipTextView;
/* loaded from: classes3.dex */
public class executeOnMainThread extends contains {
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private static final SparseIntArray toString = null;
    private final CustomChipTextView ag$a;
    private long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public executeOnMainThread(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ah$a, toString));
    }

    private executeOnMainThread(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.valueOf = -1L;
        CustomChipTextView customChipTextView = (CustomChipTextView) objArr[0];
        this.ag$a = customChipTextView;
        customChipTextView.setTag(null);
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
        if (495 == i) {
            valueOf((String) obj);
            return true;
        }
        return false;
    }

    public void valueOf(String str) {
        this.values = str;
        synchronized (this) {
            this.valueOf |= 1;
        }
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.text);
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
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ag$a, str);
        }
    }
}
