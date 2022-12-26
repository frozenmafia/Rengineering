package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CircularTextView;
/* loaded from: classes2.dex */
public class AlertDialogLayout extends notifyOnDismissListener {
    private static final ViewDataBinding.IncludedLayouts ag$a = null;
    private static final SparseIntArray values = null;
    private final CircularTextView invoke;
    private final FrameLayout toString;
    private long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public AlertDialogLayout(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ag$a, values));
    }

    private AlertDialogLayout(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.valueOf = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.toString = frameLayout;
        frameLayout.setTag(null);
        CircularTextView circularTextView = (CircularTextView) objArr[1];
        this.invoke = circularTextView;
        circularTextView.setTag(null);
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
        if (263 == i) {
            ag$a((String) obj);
            return true;
        }
        return false;
    }

    public void ag$a(String str) {
        this.ah$a = str;
        synchronized (this) {
            this.valueOf |= 1;
        }
        notifyPropertyChanged(263);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        String str = this.ah$a;
        if ((j & 3) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.invoke, str);
        }
    }
}
