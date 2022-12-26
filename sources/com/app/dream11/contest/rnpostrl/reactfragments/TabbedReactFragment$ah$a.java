package com.app.dream11.contest.rnpostrl.reactfragments;

import android.os.Bundle;
import com.dream11.react.D11ReactFragment;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class TabbedReactFragment$ah$a {
    public /* synthetic */ TabbedReactFragment$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private TabbedReactFragment$ah$a() {
    }

    public final TabbedReactFragment values(String str, Bundle bundle) {
        runAnimators.ag$a(str, "moduleName");
        TabbedReactFragment tabbedReactFragment = new TabbedReactFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString(D11ReactFragment.ARG_COMPONENT_NAME, str);
        if (bundle != null) {
            bundle2.putBundle(D11ReactFragment.ARG_INITIAL_PARAMS, bundle);
        }
        tabbedReactFragment.setArguments(bundle2);
        return tabbedReactFragment;
    }
}
