package com.app.dream11.contest.rnpostrl.reactfragments;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.app.dream11.dream11.BaseActivity;
import com.dream11.react.D11ReactFragment;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class TabbedReactFragment extends D11ReactFragment {
    public static final TabbedReactFragment$ah$a toString = new TabbedReactFragment$ah$a(null);
    public Map<Integer, View> ah$a = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        values();
    }

    public void values() {
        this.ah$a.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Fragment parentFragment = getParentFragment();
        FragmentActivity activity = parentFragment == null ? null : parentFragment.getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity == null) {
            return;
        }
        baseActivity.hideToolbar();
    }
}
