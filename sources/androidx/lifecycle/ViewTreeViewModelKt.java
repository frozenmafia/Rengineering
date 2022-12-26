package androidx.lifecycle;

import android.view.View;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ViewTreeViewModelKt {
    public static final ViewModelStoreOwner findViewTreeViewModelStoreOwner(View view) {
        runAnimators.ag$a(view, "$this$findViewTreeViewModelStoreOwner");
        return ViewTreeViewModelStoreOwner.get(view);
    }
}
