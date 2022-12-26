package o;

import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
/* loaded from: classes2.dex */
public class getTitleOptionalHint<VM> extends access$101 {
    private final VM toString;

    public getTitleOptionalHint(final int i, VM vm) {
        new resolveRightShadow(i) { // from class: o.access$101
            protected abstract void toString(androidx.databinding.ViewDataBinding viewDataBinding);

            protected void toString(BaseAdapter$ag$a baseAdapter$ag$a, int i2) {
            }

            @Override // o.resolveRightShadow, com.dream11.androidhelpers.adapters.BaseAdapter
            public final void values(BaseAdapter$ag$a baseAdapter$ag$a, int i2) {
                toString(((hideOverflowMenu) baseAdapter$ag$a).valueOf);
                super.values(baseAdapter$ag$a, i2);
                toString(baseAdapter$ag$a, i2);
            }
        };
        this.toString = vm;
    }

    @Override // o.access$101
    protected void toString(androidx.databinding.ViewDataBinding viewDataBinding) {
        viewDataBinding.setVariable(263, this.toString);
        viewDataBinding.executePendingBindings();
    }
}
