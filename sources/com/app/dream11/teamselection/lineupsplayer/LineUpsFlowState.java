package com.app.dream11.teamselection.lineupsplayer;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.util.List;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class LineUpsFlowState extends FlowState {
    private final int roundId;
    private final List<Integer> selectedPlayersIds;
    private final int teamId;
    private final int tourId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LineUpsFlowState copy$default(LineUpsFlowState lineUpsFlowState, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = lineUpsFlowState.teamId;
        }
        if ((i4 & 2) != 0) {
            i2 = lineUpsFlowState.tourId;
        }
        if ((i4 & 4) != 0) {
            i3 = lineUpsFlowState.roundId;
        }
        if ((i4 & 8) != 0) {
            list = lineUpsFlowState.selectedPlayersIds;
        }
        return lineUpsFlowState.copy(i, i2, i3, list);
    }

    public final int component1() {
        return this.teamId;
    }

    public final int component2() {
        return this.tourId;
    }

    public final int component3() {
        return this.roundId;
    }

    public final List<Integer> component4() {
        return this.selectedPlayersIds;
    }

    public final LineUpsFlowState copy(int i, int i2, int i3, List<Integer> list) {
        return new LineUpsFlowState(i, i2, i3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LineUpsFlowState) {
            LineUpsFlowState lineUpsFlowState = (LineUpsFlowState) obj;
            return this.teamId == lineUpsFlowState.teamId && this.tourId == lineUpsFlowState.tourId && this.roundId == lineUpsFlowState.roundId && runAnimators.values(this.selectedPlayersIds, lineUpsFlowState.selectedPlayersIds);
        }
        return false;
    }

    public int hashCode() {
        int i = this.teamId;
        int i2 = this.tourId;
        int i3 = this.roundId;
        List<Integer> list = this.selectedPlayersIds;
        return (((((i * 31) + i2) * 31) + i3) * 31) + (list == null ? 0 : list.hashCode());
    }

    @Override // com.app.dream11.model.FlowState
    public String toString() {
        int i = this.teamId;
        int i2 = this.tourId;
        int i3 = this.roundId;
        List<Integer> list = this.selectedPlayersIds;
        return "LineUpsFlowState(teamId=" + i + ", tourId=" + i2 + ", roundId=" + i3 + ", selectedPlayersIds=" + list + ")";
    }

    public final int getTeamId() {
        return this.teamId;
    }

    public final int getTourId() {
        return this.tourId;
    }

    public final int getRoundId() {
        return this.roundId;
    }

    public LineUpsFlowState(int i, int i2, int i3, List<Integer> list) {
        super(FlowStates.LEAGUE_DETAILS, null, 2, null);
        this.teamId = i;
        this.tourId = i2;
        this.roundId = i3;
        this.selectedPlayersIds = list;
    }

    public final List<Integer> getSelectedPlayersIds() {
        return this.selectedPlayersIds;
    }
}
