package o;

import com.fancode.core.ui.androidhelpers.adapters.BaseAdapter;
/* loaded from: classes6.dex */
public final class upTo extends BaseAdapter.values {
    private androidx.databinding.ViewDataBinding toString;

    public final androidx.databinding.ViewDataBinding values() {
        return this.toString;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upTo(androidx.databinding.ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());
        runAnimators.ag$a(viewDataBinding, "viewDataBinding");
        this.toString = viewDataBinding;
    }
}
