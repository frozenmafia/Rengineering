package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
/* loaded from: classes4.dex */
public class approveCall extends unplug {
    private static final SparseIntArray HaptikSDK$b;
    private static final ViewDataBinding.IncludedLayouts HaptikSDK$c = null;
    private long HaptikSDK$a;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        HaptikSDK$b = sparseIntArray;
        sparseIntArray.put(isSynced$ag$a.header_sub_title, 1);
        sparseIntArray.put(isSynced$ag$a.title_wrapper, 2);
        sparseIntArray.put(isSynced$ag$a.premium_pass_icon, 3);
        sparseIntArray.put(isSynced$ag$a.header_title, 4);
    }

    public approveCall(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, HaptikSDK$c, HaptikSDK$b));
    }

    private approveCall(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1], (TextView) objArr[4], (androidx.constraintlayout.widget.ConstraintLayout) objArr[0], (ImageView) objArr[3], (androidx.constraintlayout.widget.ConstraintLayout) objArr[2]);
        this.HaptikSDK$a = -1L;
        this.toString.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.HaptikSDK$a = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.HaptikSDK$a != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.HaptikSDK$a = 0L;
        }
    }
}
