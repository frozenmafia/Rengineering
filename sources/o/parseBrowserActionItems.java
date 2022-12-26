package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.textview.D11TextView;
import o.BrowserActionsIntent;
/* loaded from: classes3.dex */
public class parseBrowserActionItems extends BrowserActionsIntent.BrowserActionsFallDialogListener {
    private static final SparseIntArray valueOf;
    private static final ViewDataBinding.IncludedLayouts values = null;
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$c;
    private long ag$a;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.section_title_tv, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.section_subtitle_tv, 2);
    }

    public parseBrowserActionItems(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, values, valueOf));
    }

    private parseBrowserActionItems(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (D11TextView) objArr[2], (D11TextView) objArr[1]);
        this.ag$a = -1L;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.HaptikSDK$c = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ag$a = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.ag$a = 0L;
        }
    }
}
