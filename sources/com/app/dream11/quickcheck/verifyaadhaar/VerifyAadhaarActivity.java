package com.app.dream11.quickcheck.verifyaadhaar;

import android.os.Bundle;
import android.view.View;
import com.app.dream11.dream11.BaseActivity;
import com.app.dream11.model.FlowState;
import com.app.dream11.quickcheck.verifyaadhaar.fragment.VerifyAadhaarFragment;
import com.app.dream11.utils.FlowStates;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class VerifyAadhaarActivity extends BaseActivity {
    public Map<Integer, View> valueOf = new LinkedHashMap();

    @Override // com.app.dream11.dream11.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBlacktoolbar();
        setTitle("Verify Address");
    }

    @Override // com.app.dream11.dream11.BaseActivity
    public boolean handleFlowState(FlowState flowState) {
        FlowStates flowState2 = flowState == null ? null : flowState.getFlowState();
        if ((flowState2 == null ? -1 : VerifyAadhaarActivity$ah$a.toString[flowState2.ordinal()]) == 1) {
            VerifyAadhaarFragment verifyAadhaarFragment = new VerifyAadhaarFragment();
            verifyAadhaarFragment.setFlowState(flowState);
            getFragmentHelper().ag$a(verifyAadhaarFragment, flowState.getFlowState().name());
            return true;
        }
        return super.handleFlowState(flowState);
    }
}
