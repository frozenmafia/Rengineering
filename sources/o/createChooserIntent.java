package o;

import com.app.dream11.teamselection.newcreateteam.NewComponentSortItem;
import com.google.android.gms.analytics.ecommerce.Promotion;
/* loaded from: classes3.dex */
public final class createChooserIntent {
    @androidx.databinding.BindingAdapter({"sortType"})
    public static final void valueOf(NewComponentSortItem newComponentSortItem, getSystemServiceName getsystemservicename) {
        runAnimators.ag$a(newComponentSortItem, Promotion.ACTION_VIEW);
        newComponentSortItem.setVm(getsystemservicename);
    }

    @androidx.databinding.BindingAdapter({"selectedSortVm"})
    public static final void ah$a(NewComponentSortItem newComponentSortItem, getSystemServiceName getsystemservicename) {
        runAnimators.ag$a(newComponentSortItem, Promotion.ACTION_VIEW);
        newComponentSortItem.setCurrentSelectedSortVm(getsystemservicename);
    }
}
