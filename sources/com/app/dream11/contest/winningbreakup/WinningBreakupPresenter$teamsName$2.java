package com.app.dream11.contest.winningbreakup;

import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setSpinEnabled;
/* loaded from: classes2.dex */
public final class WinningBreakupPresenter$teamsName$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ setSpinEnabled this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinningBreakupPresenter$teamsName$2(setSpinEnabled setspinenabled) {
        super(0);
        this.this$0 = setspinenabled;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        FlowState flowState;
        String teamsName;
        flowState = this.this$0.flowState;
        WinningDataFlowState winningDataFlowState = flowState instanceof WinningDataFlowState ? (WinningDataFlowState) flowState : null;
        return (winningDataFlowState == null || (teamsName = winningDataFlowState.getTeamsName()) == null) ? "" : teamsName;
    }
}
