package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.contest.TeamCompareItemVM;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public class buildDropDown extends setWeightSum {
    private static final SparseIntArray ag$a;
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private final RelativeLayout invoke;
    private long valueOf;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ag$a = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.spannable_text, 1);
    }

    public buildDropDown(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ah$a, ag$a));
    }

    private buildDropDown(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (CustomTextView) objArr[1]);
        this.valueOf = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.invoke = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (32 == i) {
            values((TeamCompareItemVM) obj);
            return true;
        }
        return false;
    }

    @Override // o.setWeightSum
    public void values(TeamCompareItemVM teamCompareItemVM) {
        this.toString = teamCompareItemVM;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return values((TeamCompareItemVM) obj, i2);
    }

    private boolean values(TeamCompareItemVM teamCompareItemVM, int i) {
        if (i == 0) {
            synchronized (this) {
                this.valueOf |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}
