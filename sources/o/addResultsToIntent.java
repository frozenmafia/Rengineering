package o;

import com.app.dream11.teamselection.newcreateteam.ComponentFilterItem;
/* loaded from: classes3.dex */
public final class addResultsToIntent {
    @androidx.databinding.BindingAdapter({"teamNameFilter"})
    public static final void ag$a(ComponentFilterItem componentFilterItem, getAttributionTag getattributiontag) {
        if (componentFilterItem == null) {
            return;
        }
        componentFilterItem.setFilterVm(getattributiontag);
    }
}
