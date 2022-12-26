package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.ArrayList;
import java.util.Date;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class MatchModel {
    private final int id;
    private final String name;
    private ArrayList<SquadModel> squads;
    private final Date startTime;
    private final MatchStatus status;

    public static /* synthetic */ MatchModel copy$default(MatchModel matchModel, int i, Date date, MatchStatus matchStatus, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = matchModel.id;
        }
        if ((i2 & 2) != 0) {
            date = matchModel.startTime;
        }
        if ((i2 & 4) != 0) {
            matchStatus = matchModel.status;
        }
        if ((i2 & 8) != 0) {
            str = matchModel.name;
        }
        return matchModel.copy(i, date, matchStatus, str);
    }

    public final int component1() {
        return this.id;
    }

    public final Date component2() {
        return this.startTime;
    }

    public final MatchStatus component3() {
        return this.status;
    }

    public final String component4() {
        return this.name;
    }

    public final MatchModel copy(int i, Date date, MatchStatus matchStatus, String str) {
        runAnimators.ag$a(date, HeadToHeadMatchPickerFlowState.START_TIME);
        runAnimators.ag$a(matchStatus, "status");
        runAnimators.ag$a(str, "name");
        return new MatchModel(i, date, matchStatus, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MatchModel) {
            MatchModel matchModel = (MatchModel) obj;
            return this.id == matchModel.id && runAnimators.values(this.startTime, matchModel.startTime) && this.status == matchModel.status && runAnimators.values((Object) this.name, (Object) matchModel.name);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.id * 31) + this.startTime.hashCode()) * 31) + this.status.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        int i = this.id;
        Date date = this.startTime;
        MatchStatus matchStatus = this.status;
        String str = this.name;
        return "MatchModel(id=" + i + ", startTime=" + date + ", status=" + matchStatus + ", name=" + str + ")";
    }

    public MatchModel(int i, Date date, MatchStatus matchStatus, String str) {
        runAnimators.ag$a(date, HeadToHeadMatchPickerFlowState.START_TIME);
        runAnimators.ag$a(matchStatus, "status");
        runAnimators.ag$a(str, "name");
        this.id = i;
        this.startTime = date;
        this.status = matchStatus;
        this.name = str;
    }

    public final int getId() {
        return this.id;
    }

    public final Date getStartTime() {
        return this.startTime;
    }

    public final MatchStatus getStatus() {
        return this.status;
    }

    public final String getName() {
        return this.name;
    }

    public final ArrayList<SquadModel> getSquads() {
        return this.squads;
    }

    public final void setSquads(ArrayList<SquadModel> arrayList) {
        this.squads = arrayList;
    }
}
