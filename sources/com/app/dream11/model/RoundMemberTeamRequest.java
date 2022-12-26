package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes6.dex */
public class RoundMemberTeamRequest extends CommonRequest {
    long roundId;
    int teamId;
    String userGuid;

    public RoundMemberTeamRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public String getUserGuid() {
        return this.userGuid;
    }

    public long getRoundId() {
        return this.roundId;
    }

    public int getTeamId() {
        return this.teamId;
    }

    public void setUserGuid(String str) {
        this.userGuid = str;
    }

    public void setRoundId(long j) {
        this.roundId = j;
    }

    public void setTeamId(int i) {
        this.teamId = i;
    }
}
