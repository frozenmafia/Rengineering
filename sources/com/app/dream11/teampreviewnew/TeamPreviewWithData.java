package com.app.dream11.teampreviewnew;

import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.FlowState;
import com.app.dream11.model.GameConfig;
import java.io.Serializable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class TeamPreviewWithData implements Serializable {
    private final TeamPreviewWithDataCriteria criteria;
    private final TeamPreviewModel dataResponse;
    private GameConfig gameConfig;
    private boolean isFromCreateTeam;
    private final int matchId;
    private final MatchStatus matchStatus;
    private final String maxPlayers;
    private final String remainingCredits;
    private final String selectedPlayersCount;
    private final String site;
    private final String squad1;
    private final String squad1BgColor;
    private String squad1FontColor;
    private int squad1Id;
    private int squad1PlayerCount;
    private String squad1ShortName;
    private String squad2;
    private String squad2BgColor;
    private String squad2FontColor;
    private int squad2Id;
    private int squad2PlayerCount;
    private String squad2ShortName;
    private final String srcScreen;
    private final int teamId;
    private final int tourId;
    private final int userId;

    public final TeamPreviewModel component1() {
        return this.dataResponse;
    }

    public final String component10() {
        return this.remainingCredits;
    }

    public final String component11() {
        return this.maxPlayers;
    }

    public final String component12() {
        return this.squad1;
    }

    public final String component13() {
        return this.squad2;
    }

    public final int component14() {
        return this.squad1PlayerCount;
    }

    public final int component15() {
        return this.squad2PlayerCount;
    }

    public final String component16() {
        return this.squad1BgColor;
    }

    public final String component17() {
        return this.squad1FontColor;
    }

    public final String component18() {
        return this.squad2BgColor;
    }

    public final String component19() {
        return this.squad2FontColor;
    }

    public final int component2() {
        return this.userId;
    }

    public final boolean component20() {
        return this.isFromCreateTeam;
    }

    public final TeamPreviewWithDataCriteria component21() {
        return this.criteria;
    }

    public final int component22() {
        return this.squad1Id;
    }

    public final int component23() {
        return this.squad2Id;
    }

    public final String component24() {
        return this.squad1ShortName;
    }

    public final String component25() {
        return this.squad2ShortName;
    }

    public final String component3() {
        return this.srcScreen;
    }

    public final int component4() {
        return this.matchId;
    }

    public final int component5() {
        return this.tourId;
    }

    public final String component6() {
        return this.site;
    }

    public final MatchStatus component7() {
        return this.matchStatus;
    }

    public final int component8() {
        return this.teamId;
    }

    public final String component9() {
        return this.selectedPlayersCount;
    }

    public final TeamPreviewWithData copy(TeamPreviewModel teamPreviewModel, int i, String str, int i2, int i3, String str2, MatchStatus matchStatus, int i4, String str3, String str4, String str5, String str6, String str7, int i5, int i6, String str8, String str9, String str10, String str11, boolean z, TeamPreviewWithDataCriteria teamPreviewWithDataCriteria, int i7, int i8, String str12, String str13) {
        runAnimators.ag$a(str, "srcScreen");
        runAnimators.ag$a(str2, FlowState.SITE);
        runAnimators.ag$a(matchStatus, HeadToHeadMatchPickerFlowState.MATCH_STATUS);
        runAnimators.ag$a(str3, "selectedPlayersCount");
        runAnimators.ag$a(str4, "remainingCredits");
        runAnimators.ag$a(str5, "maxPlayers");
        runAnimators.ag$a(str6, "squad1");
        runAnimators.ag$a(str7, "squad2");
        runAnimators.ag$a(str8, "squad1BgColor");
        runAnimators.ag$a(str9, "squad1FontColor");
        runAnimators.ag$a(str10, "squad2BgColor");
        runAnimators.ag$a(str11, "squad2FontColor");
        runAnimators.ag$a(teamPreviewWithDataCriteria, "criteria");
        runAnimators.ag$a(str12, "squad1ShortName");
        runAnimators.ag$a(str13, "squad2ShortName");
        return new TeamPreviewWithData(teamPreviewModel, i, str, i2, i3, str2, matchStatus, i4, str3, str4, str5, str6, str7, i5, i6, str8, str9, str10, str11, z, teamPreviewWithDataCriteria, i7, i8, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TeamPreviewWithData) {
            TeamPreviewWithData teamPreviewWithData = (TeamPreviewWithData) obj;
            return runAnimators.values(this.dataResponse, teamPreviewWithData.dataResponse) && this.userId == teamPreviewWithData.userId && runAnimators.values((Object) this.srcScreen, (Object) teamPreviewWithData.srcScreen) && this.matchId == teamPreviewWithData.matchId && this.tourId == teamPreviewWithData.tourId && runAnimators.values((Object) this.site, (Object) teamPreviewWithData.site) && this.matchStatus == teamPreviewWithData.matchStatus && this.teamId == teamPreviewWithData.teamId && runAnimators.values((Object) this.selectedPlayersCount, (Object) teamPreviewWithData.selectedPlayersCount) && runAnimators.values((Object) this.remainingCredits, (Object) teamPreviewWithData.remainingCredits) && runAnimators.values((Object) this.maxPlayers, (Object) teamPreviewWithData.maxPlayers) && runAnimators.values((Object) this.squad1, (Object) teamPreviewWithData.squad1) && runAnimators.values((Object) this.squad2, (Object) teamPreviewWithData.squad2) && this.squad1PlayerCount == teamPreviewWithData.squad1PlayerCount && this.squad2PlayerCount == teamPreviewWithData.squad2PlayerCount && runAnimators.values((Object) this.squad1BgColor, (Object) teamPreviewWithData.squad1BgColor) && runAnimators.values((Object) this.squad1FontColor, (Object) teamPreviewWithData.squad1FontColor) && runAnimators.values((Object) this.squad2BgColor, (Object) teamPreviewWithData.squad2BgColor) && runAnimators.values((Object) this.squad2FontColor, (Object) teamPreviewWithData.squad2FontColor) && this.isFromCreateTeam == teamPreviewWithData.isFromCreateTeam && runAnimators.values(this.criteria, teamPreviewWithData.criteria) && this.squad1Id == teamPreviewWithData.squad1Id && this.squad2Id == teamPreviewWithData.squad2Id && runAnimators.values((Object) this.squad1ShortName, (Object) teamPreviewWithData.squad1ShortName) && runAnimators.values((Object) this.squad2ShortName, (Object) teamPreviewWithData.squad2ShortName);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        TeamPreviewModel teamPreviewModel = this.dataResponse;
        int hashCode = teamPreviewModel == null ? 0 : teamPreviewModel.hashCode();
        int i = this.userId;
        int hashCode2 = this.srcScreen.hashCode();
        int i2 = this.matchId;
        int i3 = this.tourId;
        int hashCode3 = this.site.hashCode();
        int hashCode4 = this.matchStatus.hashCode();
        int i4 = this.teamId;
        int hashCode5 = this.selectedPlayersCount.hashCode();
        int hashCode6 = this.remainingCredits.hashCode();
        int hashCode7 = this.maxPlayers.hashCode();
        int hashCode8 = this.squad1.hashCode();
        int hashCode9 = this.squad2.hashCode();
        int i5 = this.squad1PlayerCount;
        int i6 = this.squad2PlayerCount;
        int hashCode10 = this.squad1BgColor.hashCode();
        int hashCode11 = this.squad1FontColor.hashCode();
        int hashCode12 = this.squad2BgColor.hashCode();
        int hashCode13 = this.squad2FontColor.hashCode();
        boolean z = this.isFromCreateTeam;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        return (((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + hashCode2) * 31) + i2) * 31) + i3) * 31) + hashCode3) * 31) + hashCode4) * 31) + i4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i5) * 31) + i6) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + i7) * 31) + this.criteria.hashCode()) * 31) + this.squad1Id) * 31) + this.squad2Id) * 31) + this.squad1ShortName.hashCode()) * 31) + this.squad2ShortName.hashCode();
    }

    public String toString() {
        TeamPreviewModel teamPreviewModel = this.dataResponse;
        int i = this.userId;
        String str = this.srcScreen;
        int i2 = this.matchId;
        int i3 = this.tourId;
        String str2 = this.site;
        MatchStatus matchStatus = this.matchStatus;
        int i4 = this.teamId;
        String str3 = this.selectedPlayersCount;
        String str4 = this.remainingCredits;
        String str5 = this.maxPlayers;
        String str6 = this.squad1;
        String str7 = this.squad2;
        int i5 = this.squad1PlayerCount;
        int i6 = this.squad2PlayerCount;
        String str8 = this.squad1BgColor;
        String str9 = this.squad1FontColor;
        String str10 = this.squad2BgColor;
        String str11 = this.squad2FontColor;
        boolean z = this.isFromCreateTeam;
        TeamPreviewWithDataCriteria teamPreviewWithDataCriteria = this.criteria;
        int i7 = this.squad1Id;
        int i8 = this.squad2Id;
        String str12 = this.squad1ShortName;
        String str13 = this.squad2ShortName;
        return "TeamPreviewWithData(dataResponse=" + teamPreviewModel + ", userId=" + i + ", srcScreen=" + str + ", matchId=" + i2 + ", tourId=" + i3 + ", site=" + str2 + ", matchStatus=" + matchStatus + ", teamId=" + i4 + ", selectedPlayersCount=" + str3 + ", remainingCredits=" + str4 + ", maxPlayers=" + str5 + ", squad1=" + str6 + ", squad2=" + str7 + ", squad1PlayerCount=" + i5 + ", squad2PlayerCount=" + i6 + ", squad1BgColor=" + str8 + ", squad1FontColor=" + str9 + ", squad2BgColor=" + str10 + ", squad2FontColor=" + str11 + ", isFromCreateTeam=" + z + ", criteria=" + teamPreviewWithDataCriteria + ", squad1Id=" + i7 + ", squad2Id=" + i8 + ", squad1ShortName=" + str12 + ", squad2ShortName=" + str13 + ")";
    }

    public TeamPreviewWithData(TeamPreviewModel teamPreviewModel, int i, String str, int i2, int i3, String str2, MatchStatus matchStatus, int i4, String str3, String str4, String str5, String str6, String str7, int i5, int i6, String str8, String str9, String str10, String str11, boolean z, TeamPreviewWithDataCriteria teamPreviewWithDataCriteria, int i7, int i8, String str12, String str13) {
        runAnimators.ag$a(str, "srcScreen");
        runAnimators.ag$a(str2, FlowState.SITE);
        runAnimators.ag$a(matchStatus, HeadToHeadMatchPickerFlowState.MATCH_STATUS);
        runAnimators.ag$a(str3, "selectedPlayersCount");
        runAnimators.ag$a(str4, "remainingCredits");
        runAnimators.ag$a(str5, "maxPlayers");
        runAnimators.ag$a(str6, "squad1");
        runAnimators.ag$a(str7, "squad2");
        runAnimators.ag$a(str8, "squad1BgColor");
        runAnimators.ag$a(str9, "squad1FontColor");
        runAnimators.ag$a(str10, "squad2BgColor");
        runAnimators.ag$a(str11, "squad2FontColor");
        runAnimators.ag$a(teamPreviewWithDataCriteria, "criteria");
        runAnimators.ag$a(str12, "squad1ShortName");
        runAnimators.ag$a(str13, "squad2ShortName");
        this.dataResponse = teamPreviewModel;
        this.userId = i;
        this.srcScreen = str;
        this.matchId = i2;
        this.tourId = i3;
        this.site = str2;
        this.matchStatus = matchStatus;
        this.teamId = i4;
        this.selectedPlayersCount = str3;
        this.remainingCredits = str4;
        this.maxPlayers = str5;
        this.squad1 = str6;
        this.squad2 = str7;
        this.squad1PlayerCount = i5;
        this.squad2PlayerCount = i6;
        this.squad1BgColor = str8;
        this.squad1FontColor = str9;
        this.squad2BgColor = str10;
        this.squad2FontColor = str11;
        this.isFromCreateTeam = z;
        this.criteria = teamPreviewWithDataCriteria;
        this.squad1Id = i7;
        this.squad2Id = i8;
        this.squad1ShortName = str12;
        this.squad2ShortName = str13;
    }

    public final TeamPreviewModel getDataResponse() {
        return this.dataResponse;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getSrcScreen() {
        return this.srcScreen;
    }

    public final int getMatchId() {
        return this.matchId;
    }

    public final int getTourId() {
        return this.tourId;
    }

    public final String getSite() {
        return this.site;
    }

    public final MatchStatus getMatchStatus() {
        return this.matchStatus;
    }

    public final int getTeamId() {
        return this.teamId;
    }

    public final String getSelectedPlayersCount() {
        return this.selectedPlayersCount;
    }

    public final String getRemainingCredits() {
        return this.remainingCredits;
    }

    public final String getMaxPlayers() {
        return this.maxPlayers;
    }

    public final String getSquad1() {
        return this.squad1;
    }

    public final String getSquad2() {
        return this.squad2;
    }

    public final void setSquad2(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.squad2 = str;
    }

    public final int getSquad1PlayerCount() {
        return this.squad1PlayerCount;
    }

    public final void setSquad1PlayerCount(int i) {
        this.squad1PlayerCount = i;
    }

    public final int getSquad2PlayerCount() {
        return this.squad2PlayerCount;
    }

    public final void setSquad2PlayerCount(int i) {
        this.squad2PlayerCount = i;
    }

    public final String getSquad1BgColor() {
        return this.squad1BgColor;
    }

    public final String getSquad1FontColor() {
        return this.squad1FontColor;
    }

    public final void setSquad1FontColor(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.squad1FontColor = str;
    }

    public final String getSquad2BgColor() {
        return this.squad2BgColor;
    }

    public final void setSquad2BgColor(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.squad2BgColor = str;
    }

    public final String getSquad2FontColor() {
        return this.squad2FontColor;
    }

    public final void setSquad2FontColor(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.squad2FontColor = str;
    }

    public final boolean isFromCreateTeam() {
        return this.isFromCreateTeam;
    }

    public final void setFromCreateTeam(boolean z) {
        this.isFromCreateTeam = z;
    }

    public /* synthetic */ TeamPreviewWithData(TeamPreviewModel teamPreviewModel, int i, String str, int i2, int i3, String str2, MatchStatus matchStatus, int i4, String str3, String str4, String str5, String str6, String str7, int i5, int i6, String str8, String str9, String str10, String str11, boolean z, TeamPreviewWithDataCriteria teamPreviewWithDataCriteria, int i7, int i8, String str12, String str13, int i9, getTargetTypes gettargettypes) {
        this(teamPreviewModel, i, str, i2, i3, str2, matchStatus, i4, str3, str4, str5, (i9 & 2048) != 0 ? "" : str6, (i9 & 4096) != 0 ? "" : str7, i5, i6, str8, str9, str10, str11, z, (1048576 & i9) != 0 ? new TeamPreviewWithDataCriteria(0, 0, 0, 7, null) : teamPreviewWithDataCriteria, (2097152 & i9) != 0 ? 0 : i7, (4194304 & i9) != 0 ? 0 : i8, (8388608 & i9) != 0 ? "" : str12, (i9 & 16777216) != 0 ? "" : str13);
    }

    public final TeamPreviewWithDataCriteria getCriteria() {
        return this.criteria;
    }

    public final int getSquad1Id() {
        return this.squad1Id;
    }

    public final void setSquad1Id(int i) {
        this.squad1Id = i;
    }

    public final int getSquad2Id() {
        return this.squad2Id;
    }

    public final void setSquad2Id(int i) {
        this.squad2Id = i;
    }

    public final String getSquad1ShortName() {
        return this.squad1ShortName;
    }

    public final void setSquad1ShortName(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.squad1ShortName = str;
    }

    public final String getSquad2ShortName() {
        return this.squad2ShortName;
    }

    public final void setSquad2ShortName(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.squad2ShortName = str;
    }

    public final GameConfig getGameConfig() {
        return this.gameConfig;
    }

    public final void setGameConfig(GameConfig gameConfig) {
        this.gameConfig = gameConfig;
    }
}
