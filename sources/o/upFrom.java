package o;

import com.fancode.core.ui.androidhelpers.adapters.BaseAdapter;
import o.Lifecycle;
/* loaded from: classes6.dex */
public abstract class upFrom extends Lifecycle.Event {
    protected abstract void ag$a(androidx.databinding.ViewDataBinding viewDataBinding);

    protected final void values(BaseAdapter.values valuesVar, int i) {
    }

    public upFrom(int i) {
        super(i);
    }

    @Override // o.Lifecycle.Event, com.fancode.core.ui.androidhelpers.adapters.BaseAdapter
    public void valueOf(BaseAdapter.values valuesVar, int i) {
        runAnimators.ag$a(valuesVar, "holder");
        ag$a(((upTo) valuesVar).values());
        super.valueOf(valuesVar, i);
        values(valuesVar, i);
    }
}
