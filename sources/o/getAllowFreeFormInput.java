package o;

import com.app.dream11.teamselection.newcreateteam.FCInfoBannerLayout;
/* loaded from: classes3.dex */
public final class getAllowFreeFormInput {
    @androidx.databinding.BindingAdapter({"setFCInfoVM"})
    public static final void valueOf(FCInfoBannerLayout fCInfoBannerLayout, configureMenuItem configuremenuitem) {
        if (configuremenuitem == null || fCInfoBannerLayout == null) {
            return;
        }
        fCInfoBannerLayout.setFcInfoVM(configuremenuitem);
    }
}
