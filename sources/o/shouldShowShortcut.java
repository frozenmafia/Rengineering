package o;

import com.sendbird.android.SendBird;
import o.ActivityResultContracts;
/* loaded from: classes.dex */
public final class shouldShowShortcut {
    private final onActionViewExpanded values;

    public shouldShowShortcut(onActionViewExpanded onactionviewexpanded) {
        runAnimators.ag$a(onactionviewexpanded, "device");
        this.values = onactionviewexpanded;
    }

    public final void ah$a() {
        onActionViewExpanded onactionviewexpanded = this.values;
        String ag$a = onactionviewexpanded.ag$a(ActivityResultContracts.PickContact.values(onactionviewexpanded.HaptikWebView()));
        runAnimators.ah$a(ag$a, "device.getConfigProperty…onfigKey(device.context))");
        String upperCase = ag$a.toUpperCase();
        runAnimators.ah$a(upperCase, "this as java.lang.String).toUpperCase()");
        SendBird.init(upperCase, this.values.HaptikWebView());
    }
}
