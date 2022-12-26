package o;

import android.widget.TextView;
/* loaded from: classes3.dex */
public final class VelocityTrackerCompat {
    public static final void ah$a(TextView textView, boolean z, boolean z2) {
        runAnimators.ag$a(textView, "<this>");
        if (z && z2) {
            textView.setTypeface(textView.getTypeface(), 3);
        } else if (z) {
            textView.setTypeface(textView.getTypeface(), 1);
        } else if (z2) {
            textView.setTypeface(textView.getTypeface(), 2);
        } else {
            textView.setTypeface(textView.getTypeface(), 0);
        }
    }
}
