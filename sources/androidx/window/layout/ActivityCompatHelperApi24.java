package androidx.window.layout;

import android.app.Activity;
import com.apxor.androidsdk.core.ce.Constants;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ActivityCompatHelperApi24 {
    public static final ActivityCompatHelperApi24 INSTANCE = new ActivityCompatHelperApi24();

    private ActivityCompatHelperApi24() {
    }

    public final boolean isInMultiWindowMode(Activity activity) {
        runAnimators.ag$a(activity, Constants.ACTIVITY);
        return activity.isInMultiWindowMode();
    }
}
