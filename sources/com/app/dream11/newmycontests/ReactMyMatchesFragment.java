package com.app.dream11.newmycontests;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.app.dream11.dream11.BaseActivity;
import com.app.dream11Pro.R;
import com.dream11.react.D11ReactFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getTargetTypes;
import o.isVerticalAnchor;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ReactMyMatchesFragment extends D11ReactFragment {
    public static final valueOf ag$a = new valueOf(null);
    public Map<Integer, View> values = new LinkedHashMap();

    public void ah$a() {
        this.values.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        ah$a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        isVerticalAnchor isverticalanchor;
        super.onResume();
        Fragment parentFragment = getParentFragment();
        FragmentActivity activity = parentFragment == null ? null : parentFragment.getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null) {
            baseActivity.setTitle(getString(R.string.res_0x7f12086a));
        }
        if (!(getParentFragment() instanceof isVerticalAnchor) || (isverticalanchor = (isVerticalAnchor) getParentFragment()) == null) {
            return;
        }
        isverticalanchor.ah$a(this);
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }

        public final ReactMyMatchesFragment ag$a(String str, Bundle bundle) {
            runAnimators.ag$a(str, "moduleName");
            ReactMyMatchesFragment reactMyMatchesFragment = new ReactMyMatchesFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString(D11ReactFragment.ARG_COMPONENT_NAME, str);
            if (bundle != null) {
                bundle2.putBundle(D11ReactFragment.ARG_INITIAL_PARAMS, bundle);
            }
            reactMyMatchesFragment.setArguments(bundle2);
            return reactMyMatchesFragment;
        }
    }
}
