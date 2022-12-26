package o;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
/* loaded from: classes7.dex */
class PreferenceInflater extends androidx.core.view.AccessibilityDelegateCompat {
    private final AccessibilityNodeInfoCompat.AccessibilityActionCompat ag$a;

    public PreferenceInflater(Context context, int i) {
        this.ag$a = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, context.getString(i));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(this.ag$a);
    }
}
