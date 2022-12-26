package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.contest.TeamCompareItemVM;
import com.app.dream11.contest.ui.CompareSectionHeaderComponent;
/* loaded from: classes3.dex */
public class onDialogShown extends setDialogShownListenter {
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private static final SparseIntArray values = null;
    private final CompareSectionHeaderComponent ag$a;
    private long toString;

    public onDialogShown(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ah$a, values));
    }

    private onDialogShown(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1);
        this.toString = -1L;
        CompareSectionHeaderComponent compareSectionHeaderComponent = (CompareSectionHeaderComponent) objArr[0];
        this.ag$a = compareSectionHeaderComponent;
        compareSectionHeaderComponent.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.toString = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.toString != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (32 == i) {
            valueOf((TeamCompareItemVM) obj);
            return true;
        }
        return false;
    }

    public void valueOf(TeamCompareItemVM teamCompareItemVM) {
        updateRegistration(0, teamCompareItemVM);
        this.valueOf = teamCompareItemVM;
        synchronized (this) {
            this.toString |= 1;
        }
        notifyPropertyChanged(32);
        super.requestRebind();
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
                this.toString |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.toString;
            this.toString = 0L;
        }
        TeamCompareItemVM teamCompareItemVM = this.valueOf;
        if ((j & 3) != 0) {
            CompareSectionHeaderComponent.values(this.ag$a, teamCompareItemVM);
        }
    }
}
