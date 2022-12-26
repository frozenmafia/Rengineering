package com.app.dream11.teampreviewnew;

import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.teampreviewnew.vms.PlayersOfTypeVM;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class TeamPreviewVMModel implements Serializable {
    private String awaySquad;
    private final String awaySquadFontColor;
    private final String awaySquadPlayerBgColor;
    private final boolean enableDreamTeam;
    private final boolean enableEdit;
    private final boolean enableShare;
    private final List<PlayersOfTypeVM> groupedPlayersList;
    private final String homeSquad;
    private String homeSquadFontColor;
    private final String homeSquadPlayerBgColor;
    private boolean isFromCreateTeam;
    private final int mFirstSquadCount;
    private final int mSecondSquadCount;
    private final Date matchStartTime;
    private final MatchStatus matchStatus;
    private final String maxPlayers;
    private final String remainingCredits;
    private final String selectedPlayersCount;
    private boolean showInDreamTeam;
    private final String src;
    private final String teamNumber;
    private final double totalPts;
    private final String userName;

    public final String component1() {
        return this.userName;
    }

    public final String component10() {
        return this.selectedPlayersCount;
    }

    public final String component11() {
        return this.remainingCredits;
    }

    public final String component12() {
        return this.maxPlayers;
    }

    public final String component13() {
        return this.homeSquad;
    }

    public final String component14() {
        return this.awaySquad;
    }

    public final int component15() {
        return this.mFirstSquadCount;
    }

    public final int component16() {
        return this.mSecondSquadCount;
    }

    public final String component17() {
        return this.homeSquadPlayerBgColor;
    }

    public final String component18() {
        return this.homeSquadFontColor;
    }

    public final String component19() {
        return this.awaySquadPlayerBgColor;
    }

    public final double component2() {
        return this.totalPts;
    }

    public final String component20() {
        return this.awaySquadFontColor;
    }

    public final boolean component21() {
        return this.isFromCreateTeam;
    }

    public final boolean component22() {
        return this.showInDreamTeam;
    }

    public final Date component23() {
        return this.matchStartTime;
    }

    public final List<PlayersOfTypeVM> component3() {
        return this.groupedPlayersList;
    }

    public final MatchStatus component4() {
        return this.matchStatus;
    }

    public final String component5() {
        return this.src;
    }

    public final boolean component6() {
        return this.enableEdit;
    }

    public final boolean component7() {
        return this.enableShare;
    }

    public final boolean component8() {
        return this.enableDreamTeam;
    }

    public final String component9() {
        return this.teamNumber;
    }

    public final TeamPreviewVMModel copy(String str, double d, List<PlayersOfTypeVM> list, MatchStatus matchStatus, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10, String str11, String str12, boolean z4, boolean z5, Date date) {
        runAnimators.ag$a(str, "userName");
        runAnimators.ag$a(matchStatus, HeadToHeadMatchPickerFlowState.MATCH_STATUS);
        runAnimators.ag$a(str2, "src");
        runAnimators.ag$a(str3, "teamNumber");
        runAnimators.ag$a(str4, "selectedPlayersCount");
        runAnimators.ag$a(str5, "remainingCredits");
        runAnimators.ag$a(str6, "maxPlayers");
        runAnimators.ag$a(str7, "homeSquad");
        runAnimators.ag$a(str8, "awaySquad");
        runAnimators.ag$a(str9, "homeSquadPlayerBgColor");
        runAnimators.ag$a(str10, "homeSquadFontColor");
        runAnimators.ag$a(str11, "awaySquadPlayerBgColor");
        runAnimators.ag$a(str12, "awaySquadFontColor");
        return new TeamPreviewVMModel(str, d, list, matchStatus, str2, z, z2, z3, str3, str4, str5, str6, str7, str8, i, i2, str9, str10, str11, str12, z4, z5, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TeamPreviewVMModel) {
            TeamPreviewVMModel teamPreviewVMModel = (TeamPreviewVMModel) obj;
            return runAnimators.values((Object) this.userName, (Object) teamPreviewVMModel.userName) && runAnimators.values(Double.valueOf(this.totalPts), Double.valueOf(teamPreviewVMModel.totalPts)) && runAnimators.values(this.groupedPlayersList, teamPreviewVMModel.groupedPlayersList) && this.matchStatus == teamPreviewVMModel.matchStatus && runAnimators.values((Object) this.src, (Object) teamPreviewVMModel.src) && this.enableEdit == teamPreviewVMModel.enableEdit && this.enableShare == teamPreviewVMModel.enableShare && this.enableDreamTeam == teamPreviewVMModel.enableDreamTeam && runAnimators.values((Object) this.teamNumber, (Object) teamPreviewVMModel.teamNumber) && runAnimators.values((Object) this.selectedPlayersCount, (Object) teamPreviewVMModel.selectedPlayersCount) && runAnimators.values((Object) this.remainingCredits, (Object) teamPreviewVMModel.remainingCredits) && runAnimators.values((Object) this.maxPlayers, (Object) teamPreviewVMModel.maxPlayers) && runAnimators.values((Object) this.homeSquad, (Object) teamPreviewVMModel.homeSquad) && runAnimators.values((Object) this.awaySquad, (Object) teamPreviewVMModel.awaySquad) && this.mFirstSquadCount == teamPreviewVMModel.mFirstSquadCount && this.mSecondSquadCount == teamPreviewVMModel.mSecondSquadCount && runAnimators.values((Object) this.homeSquadPlayerBgColor, (Object) teamPreviewVMModel.homeSquadPlayerBgColor) && runAnimators.values((Object) this.homeSquadFontColor, (Object) teamPreviewVMModel.homeSquadFontColor) && runAnimators.values((Object) this.awaySquadPlayerBgColor, (Object) teamPreviewVMModel.awaySquadPlayerBgColor) && runAnimators.values((Object) this.awaySquadFontColor, (Object) teamPreviewVMModel.awaySquadFontColor) && this.isFromCreateTeam == teamPreviewVMModel.isFromCreateTeam && this.showInDreamTeam == teamPreviewVMModel.showInDreamTeam && runAnimators.values(this.matchStartTime, teamPreviewVMModel.matchStartTime);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.userName.hashCode();
        int doubleToLongBits = Double.doubleToLongBits(this.totalPts);
        List<PlayersOfTypeVM> list = this.groupedPlayersList;
        int hashCode2 = list == null ? 0 : list.hashCode();
        int hashCode3 = this.matchStatus.hashCode();
        int hashCode4 = this.src.hashCode();
        boolean z = this.enableEdit;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        boolean z2 = this.enableShare;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        boolean z3 = this.enableDreamTeam;
        int i3 = z3;
        if (z3 != 0) {
            i3 = 1;
        }
        int hashCode5 = this.teamNumber.hashCode();
        int hashCode6 = this.selectedPlayersCount.hashCode();
        int hashCode7 = this.remainingCredits.hashCode();
        int hashCode8 = this.maxPlayers.hashCode();
        int hashCode9 = this.homeSquad.hashCode();
        int hashCode10 = this.awaySquad.hashCode();
        int i4 = this.mFirstSquadCount;
        int i5 = this.mSecondSquadCount;
        int hashCode11 = this.homeSquadPlayerBgColor.hashCode();
        int hashCode12 = this.homeSquadFontColor.hashCode();
        int hashCode13 = this.awaySquadPlayerBgColor.hashCode();
        int hashCode14 = this.awaySquadFontColor.hashCode();
        boolean z4 = this.isFromCreateTeam;
        int i6 = z4 ? 1 : z4 ? 1 : 0;
        boolean z5 = this.showInDreamTeam;
        int i7 = z5 ? 1 : z5 ? 1 : 0;
        Date date = this.matchStartTime;
        return (((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + doubleToLongBits) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + i2) * 31) + i3) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i4) * 31) + i5) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + i6) * 31) + i7) * 31) + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        String str = this.userName;
        double d = this.totalPts;
        List<PlayersOfTypeVM> list = this.groupedPlayersList;
        MatchStatus matchStatus = this.matchStatus;
        String str2 = this.src;
        boolean z = this.enableEdit;
        boolean z2 = this.enableShare;
        boolean z3 = this.enableDreamTeam;
        String str3 = this.teamNumber;
        String str4 = this.selectedPlayersCount;
        String str5 = this.remainingCredits;
        String str6 = this.maxPlayers;
        String str7 = this.homeSquad;
        String str8 = this.awaySquad;
        int i = this.mFirstSquadCount;
        int i2 = this.mSecondSquadCount;
        String str9 = this.homeSquadPlayerBgColor;
        String str10 = this.homeSquadFontColor;
        String str11 = this.awaySquadPlayerBgColor;
        String str12 = this.awaySquadFontColor;
        boolean z4 = this.isFromCreateTeam;
        boolean z5 = this.showInDreamTeam;
        Date date = this.matchStartTime;
        return "TeamPreviewVMModel(userName=" + str + ", totalPts=" + d + ", groupedPlayersList=" + list + ", matchStatus=" + matchStatus + ", src=" + str2 + ", enableEdit=" + z + ", enableShare=" + z2 + ", enableDreamTeam=" + z3 + ", teamNumber=" + str3 + ", selectedPlayersCount=" + str4 + ", remainingCredits=" + str5 + ", maxPlayers=" + str6 + ", homeSquad=" + str7 + ", awaySquad=" + str8 + ", mFirstSquadCount=" + i + ", mSecondSquadCount=" + i2 + ", homeSquadPlayerBgColor=" + str9 + ", homeSquadFontColor=" + str10 + ", awaySquadPlayerBgColor=" + str11 + ", awaySquadFontColor=" + str12 + ", isFromCreateTeam=" + z4 + ", showInDreamTeam=" + z5 + ", matchStartTime=" + date + ")";
    }

    public TeamPreviewVMModel(String str, double d, List<PlayersOfTypeVM> list, MatchStatus matchStatus, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10, String str11, String str12, boolean z4, boolean z5, Date date) {
        runAnimators.ag$a(str, "userName");
        runAnimators.ag$a(matchStatus, HeadToHeadMatchPickerFlowState.MATCH_STATUS);
        runAnimators.ag$a(str2, "src");
        runAnimators.ag$a(str3, "teamNumber");
        runAnimators.ag$a(str4, "selectedPlayersCount");
        runAnimators.ag$a(str5, "remainingCredits");
        runAnimators.ag$a(str6, "maxPlayers");
        runAnimators.ag$a(str7, "homeSquad");
        runAnimators.ag$a(str8, "awaySquad");
        runAnimators.ag$a(str9, "homeSquadPlayerBgColor");
        runAnimators.ag$a(str10, "homeSquadFontColor");
        runAnimators.ag$a(str11, "awaySquadPlayerBgColor");
        runAnimators.ag$a(str12, "awaySquadFontColor");
        this.userName = str;
        this.totalPts = d;
        this.groupedPlayersList = list;
        this.matchStatus = matchStatus;
        this.src = str2;
        this.enableEdit = z;
        this.enableShare = z2;
        this.enableDreamTeam = z3;
        this.teamNumber = str3;
        this.selectedPlayersCount = str4;
        this.remainingCredits = str5;
        this.maxPlayers = str6;
        this.homeSquad = str7;
        this.awaySquad = str8;
        this.mFirstSquadCount = i;
        this.mSecondSquadCount = i2;
        this.homeSquadPlayerBgColor = str9;
        this.homeSquadFontColor = str10;
        this.awaySquadPlayerBgColor = str11;
        this.awaySquadFontColor = str12;
        this.isFromCreateTeam = z4;
        this.showInDreamTeam = z5;
        this.matchStartTime = date;
    }

    public /* synthetic */ TeamPreviewVMModel(String str, double d, List list, MatchStatus matchStatus, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10, String str11, String str12, boolean z4, boolean z5, Date date, int i3, getTargetTypes gettargettypes) {
        this(str, d, list, matchStatus, str2, z, z2, z3, str3, str4, str5, str6, str7, str8, i, i2, str9, str10, str11, str12, z4, z5, (i3 & 4194304) != 0 ? null : date);
    }

    public final String getUserName() {
        return this.userName;
    }

    public final double getTotalPts() {
        return this.totalPts;
    }

    public final List<PlayersOfTypeVM> getGroupedPlayersList() {
        return this.groupedPlayersList;
    }

    public final MatchStatus getMatchStatus() {
        return this.matchStatus;
    }

    public final String getSrc() {
        return this.src;
    }

    public final boolean getEnableEdit() {
        return this.enableEdit;
    }

    public final boolean getEnableShare() {
        return this.enableShare;
    }

    public final boolean getEnableDreamTeam() {
        return this.enableDreamTeam;
    }

    public final String getTeamNumber() {
        return this.teamNumber;
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

    public final String getHomeSquad() {
        return this.homeSquad;
    }

    public final String getAwaySquad() {
        return this.awaySquad;
    }

    public final void setAwaySquad(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.awaySquad = str;
    }

    public final int getMFirstSquadCount() {
        return this.mFirstSquadCount;
    }

    public final int getMSecondSquadCount() {
        return this.mSecondSquadCount;
    }

    public final String getHomeSquadPlayerBgColor() {
        return this.homeSquadPlayerBgColor;
    }

    public final String getHomeSquadFontColor() {
        return this.homeSquadFontColor;
    }

    public final void setHomeSquadFontColor(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.homeSquadFontColor = str;
    }

    public final String getAwaySquadPlayerBgColor() {
        return this.awaySquadPlayerBgColor;
    }

    public final String getAwaySquadFontColor() {
        return this.awaySquadFontColor;
    }

    public final boolean isFromCreateTeam() {
        return this.isFromCreateTeam;
    }

    public final void setFromCreateTeam(boolean z) {
        this.isFromCreateTeam = z;
    }

    public final boolean getShowInDreamTeam() {
        return this.showInDreamTeam;
    }

    public final void setShowInDreamTeam(boolean z) {
        this.showInDreamTeam = z;
    }

    public final Date getMatchStartTime() {
        return this.matchStartTime;
    }
}
