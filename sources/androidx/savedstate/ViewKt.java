package androidx.savedstate;

import android.view.View;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ViewKt {
    public static final SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View view) {
        runAnimators.ag$a(view, "$this$findViewTreeSavedStateRegistryOwner");
        return ViewTreeSavedStateRegistryOwner.get(view);
    }
}
