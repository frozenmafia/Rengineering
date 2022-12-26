package com.app.dream11.model;

import o.onActionViewExpanded;
import o.updateChildrenFromSolver;
/* loaded from: classes3.dex */
public class RoundPlayerRequest extends BaseRequest {
    private Integer eventId;
    private int roundId;
    private int teamId;
    private int tourId;
    private int userTeamId;

    public RoundPlayerRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider, updateChildrenFromSolver updatechildrenfromsolver) {
        super(onactionviewexpanded, iEventDataProvider);
        this.userTeamId = this.teamId;
        MatchCentreBean ag$a = updatechildrenfromsolver.ag$a();
        setTeamId(updatechildrenfromsolver.values());
        setUserTeamId(updatechildrenfromsolver.values());
        setTourId(ag$a.getTourId());
        setRoundId(ag$a.getRoundId());
    }

    public int getTeamId() {
        return this.teamId;
    }

    public void setTeamId(int i) {
        this.teamId = i;
    }

    public int getRoundId() {
        return this.roundId;
    }

    public void setRoundId(int i) {
        this.roundId = i;
    }

    public long getTourId() {
        return this.tourId;
    }

    public void setTourId(int i) {
        this.tourId = i;
    }

    public int getUserTeamId() {
        return this.userTeamId;
    }

    public void setUserTeamId(int i) {
        this.userTeamId = i;
    }

    public void setEventId(int i) {
        this.eventId = Integer.valueOf(i);
    }

    public int getEventId() {
        return this.eventId.intValue();
    }
}
