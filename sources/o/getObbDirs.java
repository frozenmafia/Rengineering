package o;

import java.util.ArrayList;
import java.util.List;
import o.MenuItemWrapperICS;
import o.ShareCompat;
/* loaded from: classes3.dex */
public final class getObbDirs extends MenuItemWrapperICS.OnMenuItemClickListenerWrapper {
    private boolean ag$a;
    private List<createFilesDir> ah$a;
    private ShareCompat.Api16Impl toString;
    private ArrayList<getExternalCacheDirs> valueOf;

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int valueOf(int i) {
        return com.app.dream11Pro.R.layout.res_0x7f0d00dd;
    }

    public final ArrayList<getExternalCacheDirs> valueOf() {
        return this.valueOf;
    }

    public final ShareCompat.Api16Impl ah$a() {
        return this.toString;
    }

    public getObbDirs(List<createFilesDir> list, ArrayList<getExternalCacheDirs> arrayList, ShareCompat.Api16Impl api16Impl, boolean z) {
        runAnimators.ag$a(list, "listOfPlayers");
        runAnimators.ag$a(arrayList, "listOfRoles");
        runAnimators.ag$a(api16Impl, "handler");
        this.ah$a = list;
        this.valueOf = arrayList;
        this.toString = api16Impl;
        this.ag$a = z;
    }

    public final boolean ag$a() {
        return this.ag$a;
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int values() {
        return this.ah$a.size();
    }

    @Override // o.MenuItemWrapperICS.OnMenuItemClickListenerWrapper
    public void ag$a(androidx.databinding.ViewDataBinding viewDataBinding, int i) {
        createFilesDir createfilesdir = this.ah$a.get(i);
        if (viewDataBinding == null) {
            return;
        }
        viewDataBinding.setVariable(300, createfilesdir);
        viewDataBinding.setVariable(399, Boolean.valueOf(ag$a()));
        viewDataBinding.setVariable(211, valueOf());
        viewDataBinding.setVariable(androidx.databinding.library.baseAdapters.BR.specialPlayerSelectionHandler, ah$a());
    }
}
