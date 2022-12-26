package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import o.AppCompatReceiveContentHelper;
/* loaded from: classes2.dex */
public class tryGetActivity extends AppCompatReceiveContentHelper.AnonymousClass1 {
    private static final SparseIntArray ah$a = null;
    private static final ViewDataBinding.IncludedLayouts valueOf = null;
    private final View ag$a;
    private long toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public tryGetActivity(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, valueOf, ah$a));
    }

    private tryGetActivity(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.toString = -1L;
        View view2 = (View) objArr[0];
        this.ag$a = view2;
        view2.setTag(null);
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
        if (66 == i) {
            toString((setGoneMargin) obj);
            return true;
        }
        return false;
    }

    public void toString(setGoneMargin setgonemargin) {
        this.values = setgonemargin;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.toString = 0L;
        }
    }
}
