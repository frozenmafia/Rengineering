package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public class createDrawableFor extends AppCompatEditText {
    private static final SparseIntArray toString;
    private static final ViewDataBinding.IncludedLayouts valueOf = null;
    private final androidx.constraintlayout.widget.ConstraintLayout ah$b;
    private long values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        toString = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.txt_pro_tip, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.img_left, 2);
    }

    public createDrawableFor(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, valueOf, toString));
    }

    private createDrawableFor(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (D11TextView) objArr[1]);
        this.values = -1L;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) objArr[0];
        this.ah$b = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
