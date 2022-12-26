package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.textview.D11TextView;
import o.CustomTabsClient;
/* loaded from: classes3.dex */
public class onCustomTabsServiceConnected extends CustomTabsClient.AnonymousClass2.AnonymousClass1 {
    private static final SparseIntArray HaptikSDK$b;
    private static final ViewDataBinding.IncludedLayouts toString = null;
    private long HaptikSDK$a;
    private final androidx.constraintlayout.widget.ConstraintLayout ah$b;

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
        sparseIntArray.put(com.app.dream11Pro.R.id.switchView, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.watchScoreSelector, 2);
        sparseIntArray.put(com.app.dream11Pro.R.id.leftTrackText, 3);
        sparseIntArray.put(com.app.dream11Pro.R.id.rightTrackText, 4);
    }

    public onCustomTabsServiceConnected(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, toString, HaptikSDK$b));
    }

    private onCustomTabsServiceConnected(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (D11TextView) objArr[3], (D11TextView) objArr[4], (androidx.constraintlayout.widget.ConstraintLayout) objArr[1], (androidx.appcompat.widget.SwitchCompat) objArr[2]);
        this.HaptikSDK$a = -1L;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.ah$b = constraintLayout;
        constraintLayout.setTag(null);
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
