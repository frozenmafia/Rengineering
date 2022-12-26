package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public class FastSafeIterableMap extends TaskExecutor {
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private static final SparseIntArray toString = null;
    private final LinearLayout HaptikSDK$a;
    private long HaptikSDK$b;
    private final D11TextView invoke;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public FastSafeIterableMap(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ah$a, toString));
    }

    private FastSafeIterableMap(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.HaptikSDK$b = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.HaptikSDK$a = linearLayout;
        linearLayout.setTag(null);
        D11TextView d11TextView = (D11TextView) objArr[1];
        this.invoke = d11TextView;
        d11TextView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.HaptikSDK$b = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.HaptikSDK$b != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (466 == i) {
            ag$a((Integer) obj);
        } else if (465 == i) {
            ah$a((String) obj);
        } else if (14 != i) {
            return false;
        } else {
            valueOf((Integer) obj);
        }
        return true;
    }

    @Override // o.TaskExecutor
    public void ag$a(Integer num) {
        this.valueOf = num;
        synchronized (this) {
            this.HaptikSDK$b |= 1;
        }
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.statusTextColor);
        super.requestRebind();
    }

    @Override // o.TaskExecutor
    public void ah$a(String str) {
        this.ag$a = str;
        synchronized (this) {
            this.HaptikSDK$b |= 2;
        }
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.status);
        super.requestRebind();
    }

    @Override // o.TaskExecutor
    public void valueOf(Integer num) {
        this.values = num;
        synchronized (this) {
            this.HaptikSDK$b |= 4;
        }
        notifyPropertyChanged(14);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.HaptikSDK$b;
            this.HaptikSDK$b = 0L;
        }
        Integer num = this.valueOf;
        String str = this.ag$a;
        Integer num2 = this.values;
        int i = ((9 & j) > 0L ? 1 : ((9 & j) == 0L ? 0 : -1));
        int safeUnbox = i != 0 ? androidx.databinding.ViewDataBinding.safeUnbox(num) : 0;
        int i2 = ((12 & j) > 0L ? 1 : ((12 & j) == 0L ? 0 : -1));
        int safeUnbox2 = i2 != 0 ? androidx.databinding.ViewDataBinding.safeUnbox(num2) : 0;
        if (i2 != 0) {
            addCapabilityBinding.toString(this.HaptikSDK$a, safeUnbox2);
        }
        if ((j & 10) != 0) {
            addCapabilityBinding.values((TextView) this.invoke, str);
        }
        if (i != 0) {
            addCapabilityBinding.valueOf((TextView) this.invoke, safeUnbox);
        }
    }
}
