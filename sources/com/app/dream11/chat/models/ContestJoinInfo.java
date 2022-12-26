package com.app.dream11.chat.models;

import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.model.FlowState;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ContestJoinInfo {
    private final String contestId;
    private final int matchId;
    private final int tourId;
    private final String wlsSlug;

    public static /* synthetic */ ContestJoinInfo copy$default(ContestJoinInfo contestJoinInfo, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = contestJoinInfo.tourId;
        }
        if ((i3 & 2) != 0) {
            i2 = contestJoinInfo.matchId;
        }
        if ((i3 & 4) != 0) {
            str = contestJoinInfo.contestId;
        }
        if ((i3 & 8) != 0) {
            str2 = contestJoinInfo.wlsSlug;
        }
        return contestJoinInfo.copy(i, i2, str, str2);
    }

    public final int component1() {
        return this.tourId;
    }

    public final int component2() {
        return this.matchId;
    }

    public final String component3() {
        return this.contestId;
    }

    public final String component4() {
        return this.wlsSlug;
    }

    public final ContestJoinInfo copy(int i, int i2, String str, String str2) {
        runAnimators.ag$a(str, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(str2, FlowState.WLS_SLUG);
        return new ContestJoinInfo(i, i2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContestJoinInfo) {
            ContestJoinInfo contestJoinInfo = (ContestJoinInfo) obj;
            return this.tourId == contestJoinInfo.tourId && this.matchId == contestJoinInfo.matchId && runAnimators.values((Object) this.contestId, (Object) contestJoinInfo.contestId) && runAnimators.values((Object) this.wlsSlug, (Object) contestJoinInfo.wlsSlug);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.tourId * 31) + this.matchId) * 31) + this.contestId.hashCode()) * 31) + this.wlsSlug.hashCode();
    }

    public String toString() {
        int i = this.tourId;
        int i2 = this.matchId;
        String str = this.contestId;
        String str2 = this.wlsSlug;
        return "ContestJoinInfo(tourId=" + i + ", matchId=" + i2 + ", contestId=" + str + ", wlsSlug=" + str2 + ")";
    }

    public ContestJoinInfo(int i, int i2, String str, String str2) {
        runAnimators.ag$a(str, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(str2, FlowState.WLS_SLUG);
        this.tourId = i;
        this.matchId = i2;
        this.contestId = str;
        this.wlsSlug = str2;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final int getMatchId() {
        return this.matchId;
    }

    public final int getTourId() {
        return this.tourId;
    }

    public final String getWlsSlug() {
        return this.wlsSlug;
    }
}
