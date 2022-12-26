package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public class tintDrawable extends onSetButtonDrawable {
    private static final SparseIntArray HaptikSDK$a;
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$b;
    private long invoke;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        HaptikSDK$a = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.txt_no_teams_top, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.img_empty, 2);
        sparseIntArray.put(com.app.dream11Pro.R.id.txt_no_teams_bottom, 3);
    }

    public tintDrawable(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, ag$a, HaptikSDK$a));
    }

    private tintDrawable(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (CustomTextView) objArr[3], (CustomTextView) objArr[1]);
        this.invoke = -1L;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.HaptikSDK$b = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.invoke = 2L;
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
    public boolean setVariable(int i, Object obj) {
        if (532 == i) {
            values((parsePathStrategy) obj);
            return true;
        }
        return false;
    }

    public void values(parsePathStrategy parsepathstrategy) {
        this.values = parsepathstrategy;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.invoke = 0L;
        }
    }
}
