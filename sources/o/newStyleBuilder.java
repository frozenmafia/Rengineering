package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public class newStyleBuilder extends getStartIcon {
    private static final SparseIntArray ag$a;
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private long HaptikSDK$c;
    private final RelativeLayout invoke;

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
        ag$a = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.res_0x7f0a05a9, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.txt1, 2);
        sparseIntArray.put(com.app.dream11Pro.R.id.amt, 3);
    }

    public newStyleBuilder(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, ah$a, ag$a));
    }

    private newStyleBuilder(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CustomTextView) objArr[3], (RelativeLayout) objArr[1], (CustomTextView) objArr[2]);
        this.HaptikSDK$c = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.invoke = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.HaptikSDK$c = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.HaptikSDK$c != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.HaptikSDK$c = 0L;
        }
    }
}
