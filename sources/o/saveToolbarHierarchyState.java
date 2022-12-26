package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public class saveToolbarHierarchyState extends setActionBarVisibilityCallback {
    private static final SparseIntArray toString = null;
    private static final ViewDataBinding.IncludedLayouts values = null;
    private final CustomTextView HaptikSDK$a;
    private long ah$a;
    private final FrameLayout valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public saveToolbarHierarchyState(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, values, toString));
    }

    private saveToolbarHierarchyState(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.ah$a = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.valueOf = frameLayout;
        frameLayout.setTag(null);
        CustomTextView customTextView = (CustomTextView) objArr[1];
        this.HaptikSDK$a = customTextView;
        customTextView.setTag(null);
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
        if (263 == i) {
            values((Long) obj);
            return true;
        }
        return false;
    }

    public void values(Long l) {
        this.ag$a = l;
        synchronized (this) {
            this.ah$a |= 1;
        }
        notifyPropertyChanged(263);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.ah$a;
            this.ah$a = 0L;
        }
        Long l = this.ag$a;
        if ((j & 3) != 0) {
            CustomTextView.setDateHeader(this.HaptikSDK$a, l);
        }
    }
}
