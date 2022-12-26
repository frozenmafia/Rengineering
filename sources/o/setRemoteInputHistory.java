package o;

import com.app.dream11.social.pendingrequest.PendingRequestBarComponent;
/* loaded from: classes3.dex */
public final class setRemoteInputHistory {
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"pendingRequestBarData", "refreshPendingRequestBarComponent", "refreshListener"})
    public static final void values(PendingRequestBarComponent pendingRequestBarComponent, setSettingsText setsettingstext, Boolean bool, setShowWhen setshowwhen) {
        if (setsettingstext != null && pendingRequestBarComponent != null) {
            pendingRequestBarComponent.setData(setsettingstext);
        }
        if (runAnimators.values((Object) bool, (Object) true)) {
            if (pendingRequestBarComponent != null) {
                pendingRequestBarComponent.ah$a();
            }
            if (setshowwhen == null) {
                return;
            }
            setshowwhen.onRefreshStarted();
        }
    }
}
