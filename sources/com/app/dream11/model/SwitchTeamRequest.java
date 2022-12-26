package com.app.dream11.model;

import java.util.List;
import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class SwitchTeamRequest extends CommonRequest {
    private String leagueId;
    private long roundId;
    List<Integer> teamIds;

    public SwitchTeamRequest(List<Integer> list, String str, int i, onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
        this.teamIds = list;
        this.leagueId = str;
        this.roundId = i;
    }

    public List<Integer> getTeamIds() {
        return this.teamIds;
    }

    public String getLeagueId() {
        return this.leagueId;
    }

    public long getRoundId() {
        return this.roundId;
    }
}
