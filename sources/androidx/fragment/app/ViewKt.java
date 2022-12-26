package androidx.fragment.app;

import android.view.View;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ViewKt {
    public static final <F extends Fragment> F findFragment(View view) {
        runAnimators.ag$a(view, "$this$findFragment");
        F f = (F) FragmentManager.findFragment(view);
        runAnimators.ah$a(f, "FragmentManager.findFragment(this)");
        return f;
    }
}
