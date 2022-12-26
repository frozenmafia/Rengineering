package o;

import android.util.Log;
import com.app.dream11.model.viewmodel.LeaderboardRoundViewItem;
import java.util.List;
import o.MenuItemWrapperICS;
/* loaded from: classes3.dex */
public class createConstraintWidget extends MenuItemWrapperICS.OnMenuItemClickListenerWrapper {
    private List<LeaderboardRoundViewItem> toString;
    createConstraintWidget$ag$a valueOf;

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int valueOf(int i) {
        return com.app.dream11Pro.R.layout.res_0x7f0d0354;
    }

    public createConstraintWidget(createConstraintWidget$ag$a createconstraintwidget_ag_a) {
        this.valueOf = createconstraintwidget_ag_a;
    }

    @Override // o.MenuItemWrapperICS.OnMenuItemClickListenerWrapper
    public void ag$a(androidx.databinding.ViewDataBinding viewDataBinding, int i) {
        Log.e("LinkRowAdapter", "setViewDataBinding " + i);
        viewDataBinding.setVariable(209, this.toString.get(i));
        viewDataBinding.setVariable(androidx.databinding.library.baseAdapters.BR.rowHandler, this.valueOf);
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int values() {
        List<LeaderboardRoundViewItem> list = this.toString;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void valueOf(List<LeaderboardRoundViewItem> list) {
        int values = values();
        this.toString = list;
        ag$a(values, values());
    }
}
