package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public class setSwitchTypefaceByIndex extends drawableHotspotChanged {
    private static final SparseIntArray ah$a = null;
    private static final ViewDataBinding.IncludedLayouts valueOf = null;
    private final CustomTextView HaptikSDK$a;
    private long ag$a;
    private final LinearLayout toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public setSwitchTypefaceByIndex(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, valueOf, ah$a));
    }

    private setSwitchTypefaceByIndex(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.ag$a = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.toString = linearLayout;
        linearLayout.setTag(null);
        CustomTextView customTextView = (CustomTextView) objArr[1];
        this.HaptikSDK$a = customTextView;
        customTextView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ag$a = 2L;
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
    public boolean setVariable(int i, Object obj) {
        if (146 == i) {
            valueOf((String) obj);
            return true;
        }
        return false;
    }

    public void valueOf(String str) {
        this.values = str;
        synchronized (this) {
            this.ag$a |= 1;
        }
        notifyPropertyChanged(146);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.ag$a;
            this.ag$a = 0L;
        }
        String str = this.values;
        if ((j & 3) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.HaptikSDK$a, str);
        }
    }
}
