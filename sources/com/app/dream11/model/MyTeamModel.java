package com.app.dream11.model;

import com.app.dream11.teamselection.teampreivew.PreviewPlayerInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o.createFilesDir;
import o.onIsPermissionRevocationEnabledForAppResult;
/* loaded from: classes3.dex */
public class MyTeamModel {
    LinkedHashMap<String, Integer> allPlayerCount;
    String captainName;
    PreviewPlayerInfo captainVM;
    int position;
    int team1Count;
    int teamId;
    String teamName1;
    boolean userJoinedWithTeam;
    ArrayList<PlayersBean> userTeam;
    ArrayList<PlayersBean> userTeams;
    String viceCaptainName;
    PreviewPlayerInfo viceCaptainVM;
    boolean isSelected = false;
    String teamName2 = "";
    int team2Count = 0;

    public boolean isUserJoinedWithTeam() {
        return this.userJoinedWithTeam;
    }

    public MyTeamModel() {
    }

    public MyTeamModel(onIsPermissionRevocationEnabledForAppResult onispermissionrevocationenabledforappresult) {
        List<createFilesDir> onXdkEvent = onispermissionrevocationenabledforappresult.onXdkEvent();
        this.userTeam = new ArrayList<>();
        for (createFilesDir createfilesdir : onXdkEvent) {
            this.userTeam.add(new PlayersBean(createfilesdir));
        }
    }

    public void setUserJoinedWithTeam(boolean z) {
        this.userJoinedWithTeam = z;
    }

    public int getTeamId() {
        return this.teamId;
    }

    public void setTeamId(int i) {
        this.teamId = i;
    }

    public String getCaptainName() {
        return this.captainName;
    }

    public void setCaptainName(String str) {
        this.captainName = str;
    }

    public String getViceCaptainName() {
        return this.viceCaptainName;
    }

    public void setViceCaptainName(String str) {
        this.viceCaptainName = str;
    }

    public List<PlayersBean> getUserTeam() {
        ArrayList<PlayersBean> arrayList = this.userTeam;
        return arrayList != null ? arrayList : this.userTeams;
    }

    public void setUserTeam(ArrayList<PlayersBean> arrayList) {
        this.userTeam = arrayList;
    }

    public LinkedHashMap<String, Integer> getAllPlayerCount() {
        return this.allPlayerCount;
    }

    public void setAllPlayerCount(LinkedHashMap<String, Integer> linkedHashMap) {
        this.allPlayerCount = linkedHashMap;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public PreviewPlayerInfo getCaptainVM() {
        return this.captainVM;
    }

    public void setCaptainVM(PreviewPlayerInfo previewPlayerInfo) {
        this.captainVM = previewPlayerInfo;
    }

    public PreviewPlayerInfo getViceCaptainVM() {
        return this.viceCaptainVM;
    }

    public void setViceCaptainVM(PreviewPlayerInfo previewPlayerInfo) {
        this.viceCaptainVM = previewPlayerInfo;
    }

    public String getTeamName1() {
        return this.teamName1;
    }

    public void setTeamName1(String str) {
        this.teamName1 = str;
    }

    public String getTeamName2() {
        return this.teamName2;
    }

    public void setTeamName2(String str) {
        this.teamName2 = str;
    }

    public int getTeam1Count() {
        return this.team1Count;
    }

    public void setTeam1Count(int i) {
        this.team1Count = i;
    }

    public int getTeam2Count() {
        return this.team2Count;
    }

    public void setTeam2Count(int i) {
        this.team2Count = i;
    }
}
