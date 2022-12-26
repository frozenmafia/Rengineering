package com.app.dream11.verificationnew.common.flowstates;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
/* loaded from: classes3.dex */
public final class VerificationMobileFlowState extends FlowState {
    public static final values Companion = new values(null);
    private static final String PRE_FILL = "preFill";

    public VerificationMobileFlowState() {
        this(null, 1, null);
    }

    public VerificationMobileFlowState(String str) {
        super(FlowStates.VERIFICATION_MOBILE, null, 2, null);
        putExtra(PRE_FILL, str);
    }

    public /* synthetic */ VerificationMobileFlowState(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : str);
    }

    public final String getPreFill() {
        return getString(PRE_FILL);
    }

    /* loaded from: classes3.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }
}
