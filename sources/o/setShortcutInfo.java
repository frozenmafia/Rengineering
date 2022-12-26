package o;

import com.app.dream11.social.pendingrequest.PendingRequestCarousalComponent;
/* loaded from: classes3.dex */
public final class setShortcutInfo {
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"pendingRequestBarData", "refreshPendingRequestBarComponent", "refreshListener"})
    public static final void valueOf(PendingRequestCarousalComponent pendingRequestCarousalComponent, setSettingsText setsettingstext, Boolean bool, setShowWhen setshowwhen) {
        if (setsettingstext != null && pendingRequestCarousalComponent != null) {
            pendingRequestCarousalComponent.setData(setsettingstext);
        }
        if (runAnimators.values((Object) bool, (Object) true)) {
            if (pendingRequestCarousalComponent != null) {
                pendingRequestCarousalComponent.ah$a();
            }
            if (setshowwhen == null) {
                return;
            }
            setshowwhen.onRefreshStarted();
        }
    }

    @androidx.databinding.BindingAdapter({"chatListFilled"})
    public static final void values(PendingRequestCarousalComponent pendingRequestCarousalComponent, Boolean bool) {
        if (pendingRequestCarousalComponent == null) {
            return;
        }
        pendingRequestCarousalComponent.setChatListFilled(bool);
    }
}
