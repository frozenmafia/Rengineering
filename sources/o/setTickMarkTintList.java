package o;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
/* loaded from: classes2.dex */
public class setTickMarkTintList extends setTickMarkTintMode {
    private static final SparseIntArray ah$a = null;
    private static final ViewDataBinding.IncludedLayouts values = null;
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$a;
    private long toString;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public setTickMarkTintList(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, values, ah$a));
    }

    private setTickMarkTintList(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1]);
        this.toString = -1L;
        this.valueOf.setTag(null);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.HaptikSDK$a = constraintLayout;
        constraintLayout.setTag(null);
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
        if (263 == i) {
            ag$a((String) obj);
            return true;
        }
        return false;
    }

    public void ag$a(String str) {
        this.ag$a = str;
        synchronized (this) {
            this.toString |= 1;
        }
        notifyPropertyChanged(263);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.toString;
            this.toString = 0L;
        }
        String str = this.ag$a;
        if ((j & 3) != 0) {
            Drawable drawable = null;
            String str2 = null;
            createPopup.ah$a(this.valueOf, str, drawable, drawable, false, str2, str2, str2);
        }
    }
}
