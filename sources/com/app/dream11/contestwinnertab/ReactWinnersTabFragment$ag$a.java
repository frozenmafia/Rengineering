package com.app.dream11.contestwinnertab;

import android.os.Bundle;
import com.dream11.react.D11ReactFragment;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class ReactWinnersTabFragment$ag$a {
    public /* synthetic */ ReactWinnersTabFragment$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private ReactWinnersTabFragment$ag$a() {
    }

    public final ReactWinnersTabFragment values(String str, Bundle bundle) {
        runAnimators.ag$a(str, "moduleName");
        ReactWinnersTabFragment reactWinnersTabFragment = new ReactWinnersTabFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString(D11ReactFragment.ARG_COMPONENT_NAME, str);
        if (bundle != null) {
            bundle2.putBundle(D11ReactFragment.ARG_INITIAL_PARAMS, bundle);
        }
        reactWinnersTabFragment.setArguments(bundle2);
        return reactWinnersTabFragment;
    }
}
