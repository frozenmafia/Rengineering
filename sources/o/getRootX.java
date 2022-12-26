package o;

import com.app.dream11.dream11.AppConstants;
import com.app.dream11.newmycontests.model.CardVm;
import java.util.ArrayList;
import java.util.List;
import o.MenuItemWrapperICS;
/* loaded from: classes3.dex */
public class getRootX extends MenuItemWrapperICS.OnMenuItemClickListenerWrapper {
    private List<CardVm> toString = new ArrayList();
    private AppConstants.LEAGUE_START_VALUE valueOf;

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int valueOf(int i) {
        return com.app.dream11Pro.R.layout.res_0x7f0d0366;
    }

    public getRootX(AppConstants.LEAGUE_START_VALUE league_start_value) {
        this.valueOf = league_start_value;
    }

    public void valueOf(List<CardVm> list) {
        int itemCount = getItemCount();
        this.toString = list;
        ag$a(itemCount, getItemCount());
    }

    @Override // o.MenuItemWrapperICS.OnMenuItemClickListenerWrapper
    public void ag$a(androidx.databinding.ViewDataBinding viewDataBinding, int i) {
        viewDataBinding.setVariable(19, this.toString.get(i));
        viewDataBinding.setVariable(143, this.toString.get(i).getHandler());
        viewDataBinding.setVariable(androidx.databinding.library.baseAdapters.BR.sourceType, this.valueOf);
        viewDataBinding.setVariable(316, Integer.valueOf(i));
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int values() {
        return this.toString.size();
    }
}
