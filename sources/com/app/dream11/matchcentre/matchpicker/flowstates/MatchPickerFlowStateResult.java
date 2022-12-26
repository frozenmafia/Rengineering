package com.app.dream11.matchcentre.matchpicker.flowstates;

import com.app.dream11.model.FlowStateResult;
import com.app.dream11.model.LeagueInfo;
import com.app.dream11.payment.amountSelection.AmountSelectionFlowState;
import java.io.Serializable;
import o.isRequestPinShortcutSupported;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class MatchPickerFlowStateResult extends FlowStateResult {
    private final String argLeagueInfo;
    private final String argTourName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchPickerFlowStateResult(boolean z, LeagueInfo leagueInfo, String str) {
        super(z);
        runAnimators.ag$a(str, "tourName");
        this.argLeagueInfo = AmountSelectionFlowState.INFO_MODEL;
        this.argTourName = "tourName";
        if (leagueInfo != null) {
            putExtra(AmountSelectionFlowState.INFO_MODEL, leagueInfo);
        }
        putExtra("tourName", str);
    }

    public final String getTourName() {
        String isrequestpinshortcutsupported = isRequestPinShortcutSupported.toString(this, this.argTourName);
        return isrequestpinshortcutsupported == null ? "" : isrequestpinshortcutsupported;
    }

    public final LeagueInfo getLeagueInfo() {
        Serializable extra = getExtra(this.argLeagueInfo);
        if (extra instanceof LeagueInfo) {
            return (LeagueInfo) extra;
        }
        return null;
    }
}
