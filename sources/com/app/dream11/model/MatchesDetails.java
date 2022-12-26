package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class MatchesDetails implements Serializable {
    private static final long serialVersionUID = 121;
    private String MatchId;
    private String MatchTag;
    private int TeamId1;
    private int TeamId2;
    private String TeamName1;
    private String TeamName1Flag;
    private String TeamName1FlagUrl;
    private String TeamName1JerseyUrl;
    private String TeamName2;
    private String TeamName2Flag;
    private String TeamName2FlagUrl;
    private String TeamName2JerseyUrl;

    public MatchesDetails() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MatchesDetails(ShmeCreateTeamQuery.Squad squad, ShmeCreateTeamQuery.Squad squad2) {
        setTeamName1(squad.getName());
        setTeamName2(squad2.getName());
    }

    public MatchesDetails(String str, String str2) {
        setTeamName1(str);
        setTeamName2(str2);
    }

    public void setTeamId1(int i) {
        this.TeamId1 = i;
    }

    public void setTeamId2(int i) {
        this.TeamId2 = i;
    }

    public String getTeamName1FlagUrl() {
        return this.TeamName1FlagUrl;
    }

    public String getTeamName2FlagUrl() {
        return this.TeamName2FlagUrl;
    }

    public String getTeamName1Flag() {
        return this.TeamName1Flag;
    }

    public void setTeamName1Flag(String str) {
        this.TeamName1Flag = str;
    }

    public String getTeamName2Flag() {
        return this.TeamName2Flag;
    }

    public void setTeamName2Flag(String str) {
        this.TeamName2Flag = str;
    }

    public String getTeamName2() {
        String str = this.TeamName2;
        return str != null ? str.trim() : "";
    }

    public void setTeamName2(String str) {
        this.TeamName2 = str;
    }

    public String getTeamName1() {
        String str = this.TeamName1;
        return str != null ? str.trim() : "";
    }

    public void setTeamName1(String str) {
        this.TeamName1 = str;
    }

    public String getMatchTag() {
        return this.MatchTag;
    }

    public void setMatchTag(String str) {
        this.MatchTag = str;
    }

    public String getMatchId() {
        return this.MatchId;
    }

    public void setMatchId(String str) {
        this.MatchId = str;
    }

    public String getTeamName1JerseyUrl() {
        return this.TeamName1JerseyUrl;
    }

    public void setTeamName1JerseyUrl(String str) {
        this.TeamName1JerseyUrl = str;
    }

    public String getTeamName2JerseyUrl() {
        return this.TeamName2JerseyUrl;
    }

    public void setTeamName2JerseyUrl(String str) {
        this.TeamName2JerseyUrl = str;
    }

    public void setTeamName2FlagUrl(String str) {
        this.TeamName2FlagUrl = str;
    }

    public void setTeamName1FlagUrl(String str) {
        this.TeamName1FlagUrl = str;
    }

    public int getTeamId1() {
        return this.TeamId1;
    }

    public int getTeamId2() {
        return this.TeamId2;
    }
}
