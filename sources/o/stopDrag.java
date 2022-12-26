package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public class stopDrag extends getThumbScrollRange {
    private static final SparseIntArray HaptikSDK$b = null;
    private static final ViewDataBinding.IncludedLayouts values = null;
    private long invoke;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public stopDrag(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, values, HaptikSDK$b));
    }

    private stopDrag(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[0], (D11TextView) objArr[2], (D11TextView) objArr[1]);
        this.invoke = -1L;
        this.toString.setTag(null);
        this.valueOf.setTag(null);
        this.ag$a.setTag(null);
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
        if (464 == i) {
            valueOf((kotlin.Pair) obj);
            return true;
        }
        return false;
    }

    @Override // o.getThumbScrollRange
    public void valueOf(kotlin.Pair<String, String> pair) {
        this.ah$a = pair;
        synchronized (this) {
            this.invoke |= 1;
        }
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.squadAndPlayersPair);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        String str;
        synchronized (this) {
            j = this.invoke;
            this.invoke = 0L;
        }
        kotlin.Pair<String, String> pair = this.ah$a;
        String str2 = null;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i == 0 || pair == null) {
            str = null;
        } else {
            String first = pair.getFirst();
            str2 = pair.getSecond();
            str = first;
        }
        if (i != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.valueOf, str2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ag$a, str);
        }
    }
}
