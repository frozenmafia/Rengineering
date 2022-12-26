package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public class getMinWidthMajor extends getFixedWidthMajor {
    private static final ViewDataBinding.IncludedLayouts ah$b = null;
    private static final SparseIntArray invoke;
    private long HaptikSDK$b;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        invoke = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.view1, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.view2, 2);
        sparseIntArray.put(com.app.dream11Pro.R.id.imgCircle1, 3);
        sparseIntArray.put(com.app.dream11Pro.R.id.imgCircle2, 4);
    }

    public getMinWidthMajor(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, ah$b, invoke));
    }

    private getMinWidthMajor(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (ImageView) objArr[4], (View) objArr[1], (View) objArr[2], (ShimmerFrameLayout) objArr[0]);
        this.HaptikSDK$b = -1L;
        this.HaptikSDK$a.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.HaptikSDK$b = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.HaptikSDK$b != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (384 == i) {
            values((Boolean) obj);
            return true;
        }
        return false;
    }

    @Override // o.getFixedWidthMajor
    public void values(Boolean bool) {
        this.values = bool;
        synchronized (this) {
            this.HaptikSDK$b |= 1;
        }
        notifyPropertyChanged(384);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.HaptikSDK$b;
            this.HaptikSDK$b = 0L;
        }
        Boolean bool = this.values;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        boolean safeUnbox = i != 0 ? androidx.databinding.ViewDataBinding.safeUnbox(bool) : false;
        if (i != 0) {
            addCapabilityBinding.valueOf(this.HaptikSDK$a, bool);
            addCapabilityBinding.ah$a(this.HaptikSDK$a, safeUnbox);
        }
    }
}
