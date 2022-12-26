package androidx.window.layout;

import android.view.DisplayCutout;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class DisplayCompatHelperApi28 {
    public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();

    private DisplayCompatHelperApi28() {
    }

    public final int safeInsetLeft(DisplayCutout displayCutout) {
        runAnimators.ag$a(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int safeInsetTop(DisplayCutout displayCutout) {
        runAnimators.ag$a(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }

    public final int safeInsetRight(DisplayCutout displayCutout) {
        runAnimators.ag$a(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int safeInsetBottom(DisplayCutout displayCutout) {
        runAnimators.ag$a(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }
}
