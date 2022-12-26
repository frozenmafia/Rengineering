package androidx.fragment.app;

import android.os.Bundle;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class FragmentTransactionKt {
    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, int i, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        runAnimators.ag$a(fragmentTransaction, "$this$add");
        runAnimators.values(4, "F");
        FragmentTransaction add = fragmentTransaction.add(i, Fragment.class, bundle, str);
        runAnimators.ah$a(add, "add(containerViewId, F::class.java, args, tag)");
        return add;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, int i, String str, Bundle bundle) {
        runAnimators.ag$a(fragmentTransaction, "$this$add");
        runAnimators.values(4, "F");
        FragmentTransaction add = fragmentTransaction.add(i, Fragment.class, bundle, str);
        runAnimators.ah$a(add, "add(containerViewId, F::class.java, args, tag)");
        return add;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        runAnimators.ag$a(fragmentTransaction, "$this$add");
        runAnimators.ag$a(str, "tag");
        runAnimators.values(4, "F");
        FragmentTransaction add = fragmentTransaction.add(Fragment.class, bundle, str);
        runAnimators.ah$a(add, "add(F::class.java, args, tag)");
        return add;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, String str, Bundle bundle) {
        runAnimators.ag$a(fragmentTransaction, "$this$add");
        runAnimators.ag$a(str, "tag");
        runAnimators.values(4, "F");
        FragmentTransaction add = fragmentTransaction.add(Fragment.class, bundle, str);
        runAnimators.ah$a(add, "add(F::class.java, args, tag)");
        return add;
    }

    public static /* synthetic */ FragmentTransaction replace$default(FragmentTransaction fragmentTransaction, int i, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        runAnimators.ag$a(fragmentTransaction, "$this$replace");
        runAnimators.values(4, "F");
        FragmentTransaction replace = fragmentTransaction.replace(i, Fragment.class, bundle, str);
        runAnimators.ah$a(replace, "replace(containerViewId, F::class.java, args, tag)");
        return replace;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction replace(FragmentTransaction fragmentTransaction, int i, String str, Bundle bundle) {
        runAnimators.ag$a(fragmentTransaction, "$this$replace");
        runAnimators.values(4, "F");
        FragmentTransaction replace = fragmentTransaction.replace(i, Fragment.class, bundle, str);
        runAnimators.ah$a(replace, "replace(containerViewId, F::class.java, args, tag)");
        return replace;
    }
}
