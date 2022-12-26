package com.app.dream11.chat;

import android.os.Bundle;
import android.view.View;
import com.app.dream11.dream11.BaseActivity;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class EditImageActivity extends BaseActivity {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowStates.valuesCustom().length];
            iArr[FlowStates.CHAT_SHARE_CROP_IMAGE.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
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

    @Override // com.app.dream11.dream11.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideToolbar();
        setBlacktoolbar();
    }

    @Override // com.app.dream11.dream11.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        hideToolbar();
    }

    @Override // com.app.dream11.dream11.BaseActivity
    public boolean handleFlowState(FlowState flowState) {
        if (flowState != null) {
            if (WhenMappings.$EnumSwitchMapping$0[flowState.getFlowState().ordinal()] == 1) {
                EditChatImageFragment editChatImageFragment = new EditChatImageFragment();
                editChatImageFragment.setFlowState(flowState);
                getFragmentHelper().ag$a(editChatImageFragment, flowState.getFlowState().getString());
                return true;
            }
            return false;
        }
        return super.handleFlowState(flowState);
    }
}
