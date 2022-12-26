package o;

import android.os.Build;
import android.widget.TextView;
/* loaded from: classes3.dex */
public final class TintableBackgroundView {
    public static final void ah$a(TextView textView) {
        runAnimators.ag$a(textView, "<this>");
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            textView.setBreakStrategy(0);
        } else if (i >= 29) {
            textView.setBreakStrategy(0);
        }
    }
}
