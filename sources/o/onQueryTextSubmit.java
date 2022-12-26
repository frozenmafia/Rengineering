package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.gradienttablayout.Dream11GradientTabLayout;
/* loaded from: classes2.dex */
public class onQueryTextSubmit extends onSuggestionSelect {
    private static final ViewDataBinding.IncludedLayouts toString = null;
    private static final SparseIntArray values;
    private final LinearLayout HaptikSDK$c;
    private long invoke;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        values = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.dream11GradientTabLabLayout, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.fl_on_boarding_match_center, 2);
    }

    public onQueryTextSubmit(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, toString, values));
    }

    private onQueryTextSubmit(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (Dream11GradientTabLayout) objArr[1], (FrameLayout) objArr[2]);
        this.invoke = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.HaptikSDK$c = linearLayout;
        linearLayout.setTag(null);
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
            valueOf((setLastHorizontalBias) obj);
            return true;
        }
        return false;
    }

    public void valueOf(setLastHorizontalBias setlasthorizontalbias) {
        this.valueOf = setlasthorizontalbias;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return ah$a((setLastHorizontalBias) obj, i2);
    }

    private boolean ah$a(setLastHorizontalBias setlasthorizontalbias, int i) {
        if (i == 0) {
            synchronized (this) {
                this.invoke |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.invoke = 0L;
        }
    }
}
