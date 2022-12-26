package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import com.apxor.androidsdk.core.ce.Constants;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ActivityCompatHelperApi30 {
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    public final Rect currentWindowBounds(Activity activity) {
        runAnimators.ag$a(activity, Constants.ACTIVITY);
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        runAnimators.ah$a(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public final Rect maximumWindowBounds(Activity activity) {
        runAnimators.ag$a(activity, Constants.ACTIVITY);
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        runAnimators.ah$a(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
