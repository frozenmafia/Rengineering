package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public class getLogo extends getNavigationIcon {
    private static final SparseIntArray ah$a = null;
    private static final ViewDataBinding.IncludedLayouts values = null;
    private final CustomTextView HaptikSDK$b;
    private final FrameLayout ag$a;
    private final CustomTextView invoke;
    private long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public getLogo(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, values, ah$a));
    }

    private getLogo(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.valueOf = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.ag$a = frameLayout;
        frameLayout.setTag(null);
        CustomTextView customTextView = (CustomTextView) objArr[1];
        this.invoke = customTextView;
        customTextView.setTag(null);
        CustomTextView customTextView2 = (CustomTextView) objArr[2];
        this.HaptikSDK$b = customTextView2;
        customTextView2.setTag(null);
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
        if (112 == i) {
            ah$a((setCustomContentView) obj);
            return true;
        }
        return false;
    }

    public void ah$a(setCustomContentView setcustomcontentview) {
        this.toString = setcustomcontentview;
        synchronized (this) {
            this.valueOf |= 1;
        }
        notifyPropertyChanged(112);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        String str;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        setCustomContentView setcustomcontentview = this.toString;
        String str2 = null;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i == 0 || setcustomcontentview == null) {
            str = null;
        } else {
            str2 = setcustomcontentview.ah$a();
            str = setcustomcontentview.values();
        }
        if (i != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.invoke, str2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.HaptikSDK$b, str);
        }
    }
}
