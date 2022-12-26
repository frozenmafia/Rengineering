package o;

import com.app.dream11.contest.headtoheadrematch.HeadToHeadRematchComponent;
/* loaded from: classes.dex */
public final class checkCloseActionMenu {
    @androidx.databinding.BindingAdapter({"headToHeadRematchData"})
    public static final void ah$a(HeadToHeadRematchComponent headToHeadRematchComponent, updateStatusGuardColor updatestatusguardcolor) {
        if (updatestatusguardcolor == null || headToHeadRematchComponent == null) {
            return;
        }
        headToHeadRematchComponent.setData(updatestatusguardcolor);
    }
}
