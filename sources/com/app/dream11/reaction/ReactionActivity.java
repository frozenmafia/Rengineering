package com.app.dream11.reaction;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.app.dream11.dream11.BaseActivity;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import com.app.dream11Pro.R;
import java.util.LinkedHashMap;
import java.util.Map;
import o.MenuPresenter;
/* loaded from: classes3.dex */
public final class ReactionActivity extends BaseActivity {
    private MenuPresenter valueOf;
    public Map<Integer, View> values = new LinkedHashMap();

    /* loaded from: classes3.dex */
    public final /* synthetic */ class values {
        public static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[FlowStates.valuesCustom().length];
            iArr[FlowStates.REACTION_HOLDER.ordinal()] = 1;
            valueOf = iArr;
        }
    }

    @Override // com.app.dream11.dream11.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setChildsContent(getLayoutInflater().inflate(R.layout.res_0x7f0d0404, (ViewGroup) null));
        setBlacktoolbar();
        setTitle(getString(R.string.res_0x7f120a5f));
        showBackArrow();
    }

    @Override // com.app.dream11.dream11.BaseActivity
    public boolean handleFlowState(FlowState flowState) {
        FlowStates flowState2 = flowState == null ? null : flowState.getFlowState();
        if ((flowState2 == null ? -1 : values.valueOf[flowState2.ordinal()]) == 1) {
            ReactionListingHolderFragment reactionListingHolderFragment = new ReactionListingHolderFragment();
            reactionListingHolderFragment.setFlowState(flowState);
            MenuPresenter fragmentHelper = getFragmentHelper();
            if (fragmentHelper != null) {
                fragmentHelper.ag$a(reactionListingHolderFragment, flowState.getFlowState().getString());
            }
            return true;
        }
        return false;
    }

    @Override // com.app.dream11.dream11.BaseActivity
    public MenuPresenter getFragmentHelper() {
        if (this.valueOf == null) {
            this.valueOf = new MenuPresenter(getSupportFragmentManager(), R.id.fl_my_container);
        }
        return this.valueOf;
    }
}
