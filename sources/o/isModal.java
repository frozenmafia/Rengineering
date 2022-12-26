package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.textview.D11TextView;
import o.AppCompatViewInflater;
/* loaded from: classes2.dex */
public class isModal extends getSoftInputMode {
    private static final SparseIntArray ag$a;
    private static final ViewDataBinding.IncludedLayouts toString = null;
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$c;
    private long ah$b;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ag$a = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.section_title_tv, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.section_subtitle_tv, 2);
    }

    public isModal(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, toString, ag$a));
    }

    private isModal(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (D11TextView) objArr[2], (D11TextView) objArr[1]);
        this.ah$b = -1L;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.HaptikSDK$c = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ah$b = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ah$b != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (358 == i) {
            values((AppCompatViewInflater.DeclaredOnClickListener) obj);
            return true;
        }
        return false;
    }

    public void values(AppCompatViewInflater.DeclaredOnClickListener declaredOnClickListener) {
        this.valueOf = declaredOnClickListener;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ah$b = 0L;
        }
    }
}
