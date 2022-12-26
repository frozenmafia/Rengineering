package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public class AppCompatToggleButton extends setStacked {
    private static final SparseIntArray HaptikSDK$c;
    private static final ViewDataBinding.IncludedLayouts values = null;
    private final LinearLayout HaptikSDK$b;
    private long invoke;

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
        HaptikSDK$c = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.ivContactImage, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.tvInvite, 2);
        sparseIntArray.put(com.app.dream11Pro.R.id.tvName, 3);
        sparseIntArray.put(com.app.dream11Pro.R.id.tvPhoneNumber, 4);
    }

    public AppCompatToggleButton(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, values, HaptikSDK$c));
    }

    private AppCompatToggleButton(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CircularImageView) objArr[1], (D11TextView) objArr[2], (D11TextView) objArr[3], (D11TextView) objArr[4]);
        this.invoke = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.HaptikSDK$b = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.invoke = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.invoke != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.invoke = 0L;
        }
    }
}
