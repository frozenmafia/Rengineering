package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.button.D11Button;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public class setThumbPosition extends setSwitchTextAppearance {
    private static final SparseIntArray HaptikSDK$c;
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private final D11Button HaptikSDK$a;
    private long ah$b;
    private final androidx.constraintlayout.widget.ConstraintLayout invoke;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        HaptikSDK$c = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.ivError, 2);
        sparseIntArray.put(com.app.dream11Pro.R.id.res_0x7f0a0e2d, 3);
        sparseIntArray.put(com.app.dream11Pro.R.id.tvDescription, 4);
    }

    public setThumbPosition(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, ag$a, HaptikSDK$c));
    }

    private setThumbPosition(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (D11TextView) objArr[4], (D11TextView) objArr[3]);
        this.ah$b = -1L;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.invoke = constraintLayout;
        constraintLayout.setTag(null);
        D11Button d11Button = (D11Button) objArr[1];
        this.HaptikSDK$a = d11Button;
        d11Button.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ah$b = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ah$b != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (270 == i) {
            ag$a((View.OnClickListener) obj);
            return true;
        }
        return false;
    }

    @Override // o.setSwitchTextAppearance
    public void ag$a(View.OnClickListener onClickListener) {
        this.values = onClickListener;
        synchronized (this) {
            this.ah$b |= 1;
        }
        notifyPropertyChanged(270);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.ah$b;
            this.ah$b = 0L;
        }
        View.OnClickListener onClickListener = this.values;
        if ((j & 3) != 0) {
            this.HaptikSDK$a.setOnClickListener(onClickListener);
        }
    }
}
