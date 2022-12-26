package com.app.dream11.teampreviewnew;

import java.io.Serializable;
import java.util.List;
import o.getTargetTypes;
import o.reserveEndViewTransition;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class TeamPreviewModel implements Serializable {
    private final List<PlayersOfType> groupedPlayersList;
    private final List<PlayerType> playerTypes;
    private final double totalPts;
    private final String userName;

    public static /* synthetic */ TeamPreviewModel copy$default(TeamPreviewModel teamPreviewModel, String str, double d, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teamPreviewModel.userName;
        }
        if ((i & 2) != 0) {
            d = teamPreviewModel.totalPts;
        }
        double d2 = d;
        List<PlayersOfType> list3 = list;
        if ((i & 4) != 0) {
            list3 = teamPreviewModel.groupedPlayersList;
        }
        List list4 = list3;
        List<PlayerType> list5 = list2;
        if ((i & 8) != 0) {
            list5 = teamPreviewModel.playerTypes;
        }
        return teamPreviewModel.copy(str, d2, list4, list5);
    }

    public final String component1() {
        return this.userName;
    }

    public final double component2() {
        return this.totalPts;
    }

    public final List<PlayersOfType> component3() {
        return this.groupedPlayersList;
    }

    public final List<PlayerType> component4() {
        return this.playerTypes;
    }

    public final TeamPreviewModel copy(String str, double d, List<PlayersOfType> list, List<PlayerType> list2) {
        runAnimators.ag$a(str, "userName");
        return new TeamPreviewModel(str, d, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TeamPreviewModel) {
            TeamPreviewModel teamPreviewModel = (TeamPreviewModel) obj;
            return runAnimators.values((Object) this.userName, (Object) teamPreviewModel.userName) && runAnimators.values(Double.valueOf(this.totalPts), Double.valueOf(teamPreviewModel.totalPts)) && runAnimators.values(this.groupedPlayersList, teamPreviewModel.groupedPlayersList) && runAnimators.values(this.playerTypes, teamPreviewModel.playerTypes);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.userName.hashCode();
        int doubleToLongBits = Double.doubleToLongBits(this.totalPts);
        List<PlayersOfType> list = this.groupedPlayersList;
        int hashCode2 = list == null ? 0 : list.hashCode();
        List<PlayerType> list2 = this.playerTypes;
        return (((((hashCode * 31) + doubleToLongBits) * 31) + hashCode2) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.userName;
        double d = this.totalPts;
        List<PlayersOfType> list = this.groupedPlayersList;
        List<PlayerType> list2 = this.playerTypes;
        return "TeamPreviewModel(userName=" + str + ", totalPts=" + d + ", groupedPlayersList=" + list + ", playerTypes=" + list2 + ")";
    }

    public TeamPreviewModel(String str, double d, List<PlayersOfType> list, List<PlayerType> list2) {
        runAnimators.ag$a(str, "userName");
        this.userName = str;
        this.totalPts = d;
        this.groupedPlayersList = list;
        this.playerTypes = list2;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final double getTotalPts() {
        return this.totalPts;
    }

    public final List<PlayersOfType> getGroupedPlayersList() {
        return this.groupedPlayersList;
    }

    public /* synthetic */ TeamPreviewModel(String str, double d, List list, List list2, int i, getTargetTypes gettargettypes) {
        this(str, d, list, (i & 8) != 0 ? reserveEndViewTransition.valueOf() : list2);
    }

    public final List<PlayerType> getPlayerTypes() {
        return this.playerTypes;
    }
}
