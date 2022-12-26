package com.app.dream11.ui.creatteamcomponent;

import androidx.databinding.BindingAdapter;
import java.util.List;
import o.getQ;
import o.getTargetTypes;
/* loaded from: classes3.dex */
public final class TabLayoutWithCount$ah$a {
    public /* synthetic */ TabLayoutWithCount$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private TabLayoutWithCount$ah$a() {
    }

    @BindingAdapter({"tabVms", "tabSelector"})
    public final void values(TabLayoutWithCount tabLayoutWithCount, List<getQ> list, Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (tabLayoutWithCount != null) {
                tabLayoutWithCount.setTabSelector(intValue);
            }
        }
        if (tabLayoutWithCount == null) {
            return;
        }
        tabLayoutWithCount.setListOfTabs(list);
    }
}
