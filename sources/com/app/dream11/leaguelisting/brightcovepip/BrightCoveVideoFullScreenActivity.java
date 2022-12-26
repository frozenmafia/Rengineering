package com.app.dream11.leaguelisting.brightcovepip;

import android.view.View;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class BrightCoveVideoFullScreenActivity extends BrightcovePipActivity {
    public Map<Integer, View> values = new LinkedHashMap();

    /* loaded from: classes3.dex */
    public final /* synthetic */ class values {
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[FlowStates.valuesCustom().length];
            iArr[FlowStates.BRIGHTCOVE_VIDEO_FULL_SCREEN.ordinal()] = 1;
            values = iArr;
        }
    }

    @Override // com.app.dream11.leaguelisting.brightcovepip.BrightcovePipActivity
    public View valueOf(int i) {
        Map<Integer, View> map = this.values;
        View view = map.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            if (findViewById == null) {
                return null;
            }
            map.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    @Override // com.app.dream11.leaguelisting.brightcovepip.BrightcovePipActivity, com.app.dream11.dream11.BaseActivity
    public boolean handleFlowState(FlowState flowState) {
        if (flowState != null) {
            if (values.values[flowState.getFlowState().ordinal()] == 1) {
                values(flowState);
            } else {
                return super.handleFlowState(flowState);
            }
        }
        return super.handleFlowState(flowState);
    }
}
