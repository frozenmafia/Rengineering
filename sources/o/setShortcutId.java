package o;

import com.app.dream11.social.pendingrequest.PendingRequestIconComponent;
/* loaded from: classes3.dex */
public final class setShortcutId {
    @androidx.databinding.BindingAdapter({"pendingRequestIconData"})
    public static final void toString(PendingRequestIconComponent pendingRequestIconComponent, setSettingsText setsettingstext) {
        if (setsettingstext == null || pendingRequestIconComponent == null) {
            return;
        }
        pendingRequestIconComponent.setData(setsettingstext);
    }
}
