package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public class AppCompatAutoCompleteTextView extends forceUniformWidth {
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private static final SparseIntArray values = null;
    private long ag$a;
    private final D11TextView invoke;
    private final LinearLayout toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public AppCompatAutoCompleteTextView(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ah$a, values));
    }

    private AppCompatAutoCompleteTextView(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.ag$a = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.toString = linearLayout;
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
        if (263 == i) {
            toString((String) obj);
            return true;
        }
        return false;
    }

    public void toString(String str) {
        this.valueOf = str;
        synchronized (this) {
            this.ag$a |= 1;
        }
        notifyPropertyChanged(263);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.ag$a;
            this.ag$a = 0L;
        }
        String str = this.valueOf;
        if ((j & 3) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.invoke, str);
        }
    }
}
