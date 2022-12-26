package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.button.D11Button;
import com.dream11.design.button.PrimaryButton;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public class setPressedItem extends touchModeDrawsInPressedStateCompat {
    private static final ViewDataBinding.IncludedLayouts ah$b = null;
    private static final SparseIntArray invoke;
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$d;
    private long HaptikWebView;

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
        invoke = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.v_bottom_sheet_bg, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.v_alignment_helper, 2);
        sparseIntArray.put(com.app.dream11Pro.R.id.iv_icon, 3);
        sparseIntArray.put(com.app.dream11Pro.R.id.tv_title, 4);
        sparseIntArray.put(com.app.dream11Pro.R.id.tv_body, 5);
        sparseIntArray.put(com.app.dream11Pro.R.id.btn_change_language, 6);
        sparseIntArray.put(com.app.dream11Pro.R.id.btn_maybe_later, 7);
        sparseIntArray.put(com.app.dream11Pro.R.id.bottom_focus_view, 8);
    }

    public setPressedItem(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, ah$b, invoke));
    }

    private setPressedItem(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (View) objArr[8], (PrimaryButton) objArr[6], (D11Button) objArr[7], (ImageView) objArr[3], (D11TextView) objArr[5], (D11TextView) objArr[4], (View) objArr[2], (View) objArr[1]);
        this.HaptikWebView = -1L;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.HaptikSDK$d = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.HaptikWebView = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.HaptikWebView != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.HaptikWebView = 0L;
        }
    }
}
