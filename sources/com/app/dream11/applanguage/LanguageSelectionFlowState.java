package com.app.dream11.applanguage;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.runAnimators;
/* loaded from: classes.dex */
public final class LanguageSelectionFlowState extends FlowState {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectionFlowState(FlowState flowState) {
        super(FlowStates.LANGUAGE_SELECTION, flowState);
        runAnimators.ag$a(flowState, "nextFlowState");
    }
}
