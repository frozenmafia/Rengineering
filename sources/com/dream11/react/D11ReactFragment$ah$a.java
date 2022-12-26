package com.dream11.react;

import android.os.Bundle;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class D11ReactFragment$ah$a {
    private D11ReactFragment$ah$a() {
    }

    public /* synthetic */ D11ReactFragment$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    public static /* synthetic */ D11ReactFragment ag$a(D11ReactFragment$ah$a d11ReactFragment$ah$a, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return d11ReactFragment$ah$a.values(str, bundle);
    }

    public final D11ReactFragment values(String str, Bundle bundle) {
        runAnimators.ag$a(str, "moduleName");
        D11ReactFragment d11ReactFragment = new D11ReactFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString(D11ReactFragment.ARG_COMPONENT_NAME, str);
        if (bundle != null) {
            bundle2.putBundle(D11ReactFragment.ARG_INITIAL_PARAMS, bundle);
        }
        d11ReactFragment.setArguments(bundle2);
        return d11ReactFragment;
    }
}
