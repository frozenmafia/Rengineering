package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.contest.teamcompare.HighlightedHeaderComponent;
import o.AppCompatViewInflater;
/* loaded from: classes2.dex */
public class setBaselineAlignedChildIndex extends measureNullChild {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray valueOf = null;
    private long toString;
    private final HighlightedHeaderComponent values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public setBaselineAlignedChildIndex(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ag$a, valueOf));
    }

    private setBaselineAlignedChildIndex(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.toString = -1L;
        HighlightedHeaderComponent highlightedHeaderComponent = (HighlightedHeaderComponent) objArr[0];
        this.values = highlightedHeaderComponent;
        highlightedHeaderComponent.setTag(null);
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
            ah$a((AppCompatViewInflater.DeclaredOnClickListener) obj);
            return true;
        }
        return false;
    }

    public void ah$a(AppCompatViewInflater.DeclaredOnClickListener declaredOnClickListener) {
        this.ah$a = declaredOnClickListener;
        synchronized (this) {
            this.toString |= 1;
        }
        notifyPropertyChanged(32);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.toString;
            this.toString = 0L;
        }
        AppCompatViewInflater.DeclaredOnClickListener declaredOnClickListener = this.ah$a;
        if ((j & 3) != 0) {
            HighlightedHeaderComponent.setSectionItemData(this.values, declaredOnClickListener);
        }
    }
}
