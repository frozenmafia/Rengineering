package androidx.lifecycle;

import android.view.View;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ViewKt {
    public static final LifecycleOwner findViewTreeLifecycleOwner(View view) {
        runAnimators.ag$a(view, "$this$findViewTreeLifecycleOwner");
        return ViewTreeLifecycleOwner.get(view);
    }
}
