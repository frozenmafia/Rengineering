package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public class setTextSize extends getCompoundPaddingLeft {
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private static final SparseIntArray toString = null;
    private final FrameLayout HaptikSDK$a;
    private long ag$a;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public setTextSize(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ah$a, toString));
    }

    private setTextSize(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (D11TextView) objArr[1]);
        this.ag$a = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.HaptikSDK$a = frameLayout;
        frameLayout.setTag(null);
        this.valueOf.setTag(null);
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
        if (67 == i) {
            ah$a((setShouldShowIcon$HaptikSDK$c) obj);
            return true;
        }
        return false;
    }

    public void ah$a(setShouldShowIcon$HaptikSDK$c setshouldshowicon_haptiksdk_c) {
        this.values = setshouldshowicon_haptiksdk_c;
        synchronized (this) {
            this.ag$a |= 1;
        }
        notifyPropertyChanged(67);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.ag$a;
            this.ag$a = 0L;
        }
        setShouldShowIcon$HaptikSDK$c setshouldshowicon_haptiksdk_c = this.values;
        String str = null;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i != 0 && setshouldshowicon_haptiksdk_c != null) {
            str = setshouldshowicon_haptiksdk_c.valueOf();
        }
        if (i != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.valueOf, str);
        }
    }
}
