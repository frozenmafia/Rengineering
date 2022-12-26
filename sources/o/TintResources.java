package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public class TintResources extends TintInfo {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray valueOf = null;
    private final ScrollView HaptikSDK$a;
    private long toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public TintResources(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ag$a, valueOf));
    }

    private TintResources(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CustomTextView) objArr[1]);
        this.toString = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.HaptikSDK$a = scrollView;
        scrollView.setTag(null);
        this.values.setTag(null);
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
        if (271 == i) {
            values((View.OnClickListener) obj);
            return true;
        }
        return false;
    }

    @Override // o.TintInfo
    public void values(View.OnClickListener onClickListener) {
        this.ah$a = onClickListener;
        synchronized (this) {
            this.toString |= 1;
        }
        notifyPropertyChanged(271);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.toString;
            this.toString = 0L;
        }
        View.OnClickListener onClickListener = this.ah$a;
        if ((j & 3) != 0) {
            this.values.setOnClickListener(onClickListener);
        }
    }
}
