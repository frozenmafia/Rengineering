package com.app.dream11.homescreen;

import android.os.Bundle;
import com.dream11.react.D11ReactFragment;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ReactHomeFragment$ah$a {
    public /* synthetic */ ReactHomeFragment$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private ReactHomeFragment$ah$a() {
    }

    public final ReactHomeFragment values(String str, Bundle bundle) {
        runAnimators.ag$a(str, "moduleName");
        ReactHomeFragment reactHomeFragment = new ReactHomeFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString(D11ReactFragment.ARG_COMPONENT_NAME, str);
        if (bundle != null) {
            bundle2.putBundle(D11ReactFragment.ARG_INITIAL_PARAMS, bundle);
        }
        reactHomeFragment.setArguments(bundle2);
        return reactHomeFragment;
    }
}
