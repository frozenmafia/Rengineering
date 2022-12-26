package com.app.dream11.social.contactsync.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.app.dream11.dream11.BaseActivity;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import com.app.dream11Pro.R;
import java.util.LinkedHashMap;
import java.util.Map;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ContactSyncActivity extends BaseActivity {
    public Map<Integer, View> values = new LinkedHashMap();

    /* loaded from: classes3.dex */
    public final /* synthetic */ class valueOf {
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[FlowStates.valuesCustom().length];
            iArr[FlowStates.CONTACT_SYNC.ordinal()] = 1;
            values = iArr;
        }
    }

    @Override // com.app.dream11.dream11.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColor(R.color.d11_color_bg__neutralDarkest);
        setToolbarBackgroundColor(R.color.d11_color_bg__neutralDarkest);
    }

    @Override // com.app.dream11.dream11.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        runAnimators.ag$a(menuItem, "item");
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.app.dream11.dream11.BaseActivity
    public boolean handleFlowState(FlowState flowState) {
        if (flowState == null) {
            return false;
        }
        if (valueOf.values[flowState.getFlowState().ordinal()] == 1) {
            ContactsSyncFragment contactsSyncFragment = new ContactsSyncFragment();
            contactsSyncFragment.setFlowState(flowState);
            getFragmentHelper().ag$a(contactsSyncFragment, flowState.getFlowState().name());
            return true;
        }
        return false;
    }
}
