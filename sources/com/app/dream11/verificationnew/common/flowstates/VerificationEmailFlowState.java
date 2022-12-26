package com.app.dream11.verificationnew.common.flowstates;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
/* loaded from: classes3.dex */
public final class VerificationEmailFlowState extends FlowState {
    public static final valueOf Companion = new valueOf(null);
    private static final String PRE_FILL = "preFill";

    public VerificationEmailFlowState() {
        this(null, 1, null);
    }

    public VerificationEmailFlowState(String str) {
        super(FlowStates.VERIFICATION_EMAIL, null, 2, null);
        putExtra(PRE_FILL, str);
    }

    public /* synthetic */ VerificationEmailFlowState(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : str);
    }

    public final String getPreFill() {
        return getString(PRE_FILL);
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }
}
