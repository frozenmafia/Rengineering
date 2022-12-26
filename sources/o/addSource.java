package o;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
/* loaded from: classes4.dex */
public class addSource extends activeStateChanged {
    private static final ViewDataBinding.IncludedLayouts valueOf = null;
    private static final SparseIntArray values = null;
    private long HaptikSDK$c;
    private final androidx.constraintlayout.widget.ConstraintLayout invoke;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public addSource(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, valueOf, values));
    }

    private addSource(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1], (TextView) objArr[2]);
        this.HaptikSDK$c = -1L;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.invoke = constraintLayout;
        constraintLayout.setTag(null);
        this.toString.setTag(null);
        this.ah$a.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.HaptikSDK$c = 2L;
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
    public boolean setVariable(int i, Object obj) {
        if (enforceMainThreadIfNeeded.HaptikSDK$c == i) {
            valueOf((Boolean) obj);
            return true;
        }
        return false;
    }

    public void valueOf(Boolean bool) {
        this.ag$a = bool;
        synchronized (this) {
            this.HaptikSDK$c |= 1;
        }
        notifyPropertyChanged(enforceMainThreadIfNeeded.HaptikSDK$c);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        String str;
        Resources resources;
        int i;
        long j2;
        long j3;
        synchronized (this) {
            j = this.HaptikSDK$c;
            this.HaptikSDK$c = 0L;
        }
        Boolean bool = this.ag$a;
        String str2 = null;
        int i2 = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i2 != 0) {
            boolean safeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(bool);
            if (i2 != 0) {
                if (safeUnbox) {
                    j2 = j | 8;
                    j3 = 32;
                } else {
                    j2 = j | 4;
                    j3 = 16;
                }
                j = j2 | j3;
            }
            str2 = this.toString.getResources().getString(safeUnbox ? isSynced$HaptikSDK$b.fc_unlimited_fancode_passes : isSynced$HaptikSDK$b.fc_match_tour_only);
            if (safeUnbox) {
                resources = this.ah$a.getResources();
                i = isSynced$HaptikSDK$b.fc_yearly_monthly;
            } else {
                resources = this.ah$a.getResources();
                i = isSynced$HaptikSDK$b.fc_match_tour_pass;
            }
            str = resources.getString(i);
        } else {
            str = null;
        }
        if ((j & 3) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.toString, str2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ah$a, str);
        }
    }
}
