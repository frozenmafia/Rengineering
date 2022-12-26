package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes2.dex */
public class lookForSelectablePosition extends onForwardedEvent {
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private static final SparseIntArray values;
    private long ag$a;
    private final LinearLayout valueOf;

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
        values = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.rvActionItems, 1);
    }

    public lookForSelectablePosition(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ah$a, values));
    }

    private lookForSelectablePosition(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (DreamRecyclerView) objArr[1]);
        this.ag$a = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.valueOf = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ag$a = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.ag$a = 0L;
        }
    }
}
