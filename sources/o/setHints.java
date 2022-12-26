package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public class setHints extends itemType {
    private static final SparseIntArray ag$a = null;
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private final ImageView HaptikSDK$a;
    private final CustomTextView HaptikSDK$c;
    private long toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public setHints(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, ah$a, ag$a));
    }

    private setHints(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[0]);
        this.toString = -1L;
        this.valueOf.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.HaptikSDK$a = imageView;
        imageView.setTag(null);
        CustomTextView customTextView = (CustomTextView) objArr[2];
        this.HaptikSDK$c = customTextView;
        customTextView.setTag(null);
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
        if (170 == i) {
            valueOf((Boolean) obj);
            return true;
        }
        return false;
    }

    public void valueOf(Boolean bool) {
        this.values = bool;
        synchronized (this) {
            this.toString |= 1;
        }
        notifyPropertyChanged(170);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.toString;
            this.toString = 0L;
        }
        Boolean bool = this.values;
        int i = 0;
        int i2 = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i2 != 0) {
            boolean safeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(bool);
            if (i2 != 0) {
                j |= safeUnbox ? 8L : 4L;
            }
            if (!safeUnbox) {
                i = 8;
            }
        }
        if ((j & 3) != 0) {
            FullLifecycleObserverAdapter.toString(this.HaptikSDK$a, i);
            FullLifecycleObserverAdapter.toString(this.HaptikSDK$c, i);
        }
    }
}
