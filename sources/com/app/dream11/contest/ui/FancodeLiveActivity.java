package com.app.dream11.contest.ui;

import android.os.Build;
import android.view.View;
import com.app.dream11.dream11.BaseActivity;
import com.app.dream11.model.FlowState;
import java.util.LinkedHashMap;
import java.util.Map;
import o.MenuPresenter;
/* loaded from: classes.dex */
public final class FancodeLiveActivity extends BaseActivity {
    public Map<Integer, View> values = new LinkedHashMap();

    @Override // com.app.dream11.dream11.BaseActivity
    public boolean shouldShowDefaultToolbar() {
        return false;
    }

    @Override // com.app.dream11.dream11.BaseActivity
    public boolean handleFlowState(FlowState flowState) {
        if (flowState != null) {
            if (FancodeLiveActivity$ah$a.toString[flowState.getFlowState().ordinal()] == 1) {
                MenuPresenter fragmentHelper = getFragmentHelper();
                FancodeLiveFragment fancodeLiveFragment = new FancodeLiveFragment();
                fancodeLiveFragment.setFlowState(flowState);
                fragmentHelper.ag$a(fancodeLiveFragment, flowState.getFlowState().getString());
                return true;
            }
            return false;
        }
        return super.handleFlowState(flowState);
    }

    @Override // com.app.dream11.dream11.BaseActivity
    public boolean shouldSetOrientation() {
        return Build.VERSION.SDK_INT != 26;
    }
}
