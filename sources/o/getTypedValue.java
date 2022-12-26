package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes3.dex */
public class getTypedValue extends ThemedSpinnerAdapter {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray values = null;
    private final LinearLayout HaptikSDK$a;
    private long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public getTypedValue(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ag$a, values));
    }

    private getTypedValue(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ShimmerFrameLayout) objArr[0]);
        this.valueOf = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.HaptikSDK$a = linearLayout;
        linearLayout.setTag(null);
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
        if (385 == i) {
            toString((Boolean) obj);
            return true;
        }
        return false;
    }

    @Override // o.ThemedSpinnerAdapter
    public void toString(Boolean bool) {
        this.ah$a = bool;
        synchronized (this) {
            this.valueOf |= 1;
        }
        notifyPropertyChanged(385);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        Boolean bool = this.ah$a;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        boolean safeUnbox = i != 0 ? androidx.databinding.ViewDataBinding.safeUnbox(bool) : false;
        if (i != 0) {
            addCapabilityBinding.valueOf(this.toString, bool);
            addCapabilityBinding.ah$a(this.toString, safeUnbox);
        }
    }
}
