package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.textview.D11TextView;
import o.setShouldShowIcon;
/* loaded from: classes2.dex */
public class setSupportAllCaps extends setAutoSizeTextTypeUniformWithPresetSizes {
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private static final SparseIntArray valueOf = null;
    private long ag$a;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public setSupportAllCaps(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ah$a, valueOf));
    }

    private setSupportAllCaps(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (D11TextView) objArr[0]);
        this.ag$a = -1L;
        this.toString.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ag$a = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ag$a != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (67 == i) {
            valueOf((setShouldShowIcon.toString) obj);
            return true;
        }
        return false;
    }

    public void valueOf(setShouldShowIcon.toString tostring) {
        this.values = tostring;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ag$a = 0L;
        }
    }
}
