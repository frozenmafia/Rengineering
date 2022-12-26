package com.app.dream11.teamselection.newcreateteam;

import com.app.dream11.model.BaseRequest;
import com.app.dream11.model.IEventDataProvider;
import java.util.ArrayList;
import java.util.List;
import o.onActionViewExpanded;
import o.startActivity;
/* loaded from: classes6.dex */
public class SaveTeamRequest extends BaseRequest {
    private String captainId;
    List<startActivity> listOfSpecialPlayers;
    boolean onboardingFlag;
    private String players;
    private String positions;
    private long roundId;
    long selectionDuration;
    private int teamId;
    private long tourId;
    private int userTeamId;
    private String vcID;

    public SaveTeamRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
        this.userTeamId = this.teamId;
        this.players = "";
        this.positions = "";
        this.captainId = "";
        this.vcID = "";
        this.listOfSpecialPlayers = new ArrayList();
    }

    public String getPlayers() {
        return this.players;
    }

    public void setPlayers(String str) {
        this.players = str;
    }

    public void addPlayer(String str) {
        if (this.players.isEmpty()) {
            this.players += str;
            return;
        }
        this.players += "," + str;
    }

    public String getPositions() {
        return this.positions;
    }

    public void setPositions(String str) {
        this.positions = str;
    }

    public void addSpecialPlayer(int i, int i2) {
        this.listOfSpecialPlayers.add(new startActivity(i2, i));
    }

    public void addPosition(String str) {
        if (this.positions.isEmpty()) {
            this.positions += str;
            return;
        }
        this.positions += "," + str;
    }

    public String getCaptainId() {
        return this.captainId;
    }

    public void setCaptainId(String str) {
        this.captainId = str;
    }

    public String getVcId() {
        return this.vcID;
    }

    public void setVcId(String str) {
        this.vcID = str;
    }

    public boolean isOnboardingFlag() {
        return this.onboardingFlag;
    }

    public void setOnboardingFlag(boolean z) {
        this.onboardingFlag = z;
    }

    public long getSelectionDuration() {
        return this.selectionDuration;
    }

    public void setSelectionDuration(long j) {
        this.selectionDuration = j;
    }

    public int getTeamId() {
        return this.teamId;
    }

    public void setTeamId(int i) {
        this.teamId = i;
    }

    public long getRoundId() {
        return this.roundId;
    }

    public void setRoundId(long j) {
        this.roundId = j;
    }

    public long getTourId() {
        return this.tourId;
    }

    public void setTourId(long j) {
        this.tourId = j;
    }

    public int getUserTeamId() {
        return this.userTeamId;
    }

    public void setUserTeamId(int i) {
        this.userTeamId = i;
    }
}
