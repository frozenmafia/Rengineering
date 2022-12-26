package o;

import o.MenuItemWrapperICS;
/* loaded from: classes3.dex */
public final class migrateExtraStreamToClipData extends MenuItemWrapperICS.OnMenuItemClickListenerWrapper {
    private final combineArrayExtra toString;

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int valueOf(int i) {
        return com.app.dream11Pro.R.layout.res_0x7f0d0090;
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int values() {
        return 1;
    }

    public migrateExtraStreamToClipData(combineArrayExtra combinearrayextra) {
        runAnimators.ag$a(combinearrayextra, "legendVM");
        this.toString = combinearrayextra;
    }

    @Override // o.MenuItemWrapperICS.OnMenuItemClickListenerWrapper
    public void ag$a(androidx.databinding.ViewDataBinding viewDataBinding, int i) {
        if (viewDataBinding == null) {
            return;
        }
        viewDataBinding.setVariable(263, this.toString);
    }
}
