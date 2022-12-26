package androidx.activity.result;

import androidx.core.app.ActivityOptionsCompat;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes5.dex */
public final class ActivityResultLauncherKt {
    public static /* synthetic */ void launch$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i, Object obj) {
        if ((i & 1) != 0) {
            activityOptionsCompat = null;
        }
        launch(activityResultLauncher, activityOptionsCompat);
    }

    public static final void launch(ActivityResultLauncher<Void> activityResultLauncher, ActivityOptionsCompat activityOptionsCompat) {
        runAnimators.ag$a(activityResultLauncher, "$this$launch");
        activityResultLauncher.launch(null, activityOptionsCompat);
    }

    public static /* synthetic */ void launchUnit$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i, Object obj) {
        if ((i & 1) != 0) {
            activityOptionsCompat = null;
        }
        launchUnit(activityResultLauncher, activityOptionsCompat);
    }

    public static final void launchUnit(ActivityResultLauncher<setAnimationMatrix> activityResultLauncher, ActivityOptionsCompat activityOptionsCompat) {
        runAnimators.ag$a(activityResultLauncher, "$this$launch");
        activityResultLauncher.launch(null, activityOptionsCompat);
    }
}
