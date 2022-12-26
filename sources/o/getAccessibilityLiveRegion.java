package o;

import android.os.Build;
import android.view.View;
/* loaded from: classes3.dex */
public final class getAccessibilityLiveRegion {
    public static final void ag$a(View view) {
        runAnimators.ag$a(view, "<this>");
        if (Build.VERSION.SDK_INT >= 19) {
            view.setImportantForAccessibility(4);
        }
    }
}
