package o;

import com.app.dream11.dream11.messagepool.NotifyType;
import o.DrawerLayout;
/* loaded from: classes3.dex */
public final class ActivityCompat$2$ag$a extends setPaddingRelative {
    private final DrawerLayout.SavedState.AnonymousClass1.toString toString;
    private final DrawerLayout.ChildAccessibilityDelegate valueOf;

    public final DrawerLayout.ChildAccessibilityDelegate ag$a() {
        return this.valueOf;
    }

    public final DrawerLayout.SavedState.AnonymousClass1.toString values() {
        return this.toString;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityCompat$2$ag$a(DrawerLayout.ChildAccessibilityDelegate childAccessibilityDelegate, DrawerLayout.SavedState.AnonymousClass1.toString tostring) {
        super(NotifyType.REACT_CALLBACK);
        runAnimators.ag$a(childAccessibilityDelegate, "name");
        runAnimators.ag$a(tostring, com.dreampay.commons.constants.Constants.RESULT);
        this.valueOf = childAccessibilityDelegate;
        this.toString = tostring;
    }
}
