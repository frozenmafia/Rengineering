package com.app.dream11.teampreviewnew;

import com.app.dream11.model.FlowState;
import com.app.dream11.model.GameConfig;
import java.io.Serializable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class TeamPreviewReqData implements Serializable {
    private String callbackKey;
    private final int currentUserId;
    private final Integer currentUserRank;
    private final int currentUserTeamId;
    private GameConfig gameConfig;
    private final int matchId;
    private final Integer rank;
    private final String site;
    private final String srcScreen;
    private final int teamId;
    private final int tourId;
    private final int userId;

    public final String component1() {
        return this.site;
    }

    public final Integer component10() {
        return this.currentUserRank;
    }

    public final int component2() {
        return this.matchId;
    }

    public final int component3() {
        return this.userId;
    }

    public final int component4() {
        return this.teamId;
    }

    public final int component5() {
        return this.tourId;
    }

    public final String component6() {
        return this.srcScreen;
    }

    public final Integer component7() {
        return this.rank;
    }

    public final int component8() {
        return this.currentUserId;
    }

    public final int component9() {
        return this.currentUserTeamId;
    }

    public final TeamPreviewReqData copy(String str, int i, int i2, int i3, int i4, String str2, Integer num, int i5, int i6, Integer num2) {
        runAnimators.ag$a(str, FlowState.SITE);
        runAnimators.ag$a(str2, "srcScreen");
        return new TeamPreviewReqData(str, i, i2, i3, i4, str2, num, i5, i6, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TeamPreviewReqData) {
            TeamPreviewReqData teamPreviewReqData = (TeamPreviewReqData) obj;
            return runAnimators.values((Object) this.site, (Object) teamPreviewReqData.site) && this.matchId == teamPreviewReqData.matchId && this.userId == teamPreviewReqData.userId && this.teamId == teamPreviewReqData.teamId && this.tourId == teamPreviewReqData.tourId && runAnimators.values((Object) this.srcScreen, (Object) teamPreviewReqData.srcScreen) && runAnimators.values(this.rank, teamPreviewReqData.rank) && this.currentUserId == teamPreviewReqData.currentUserId && this.currentUserTeamId == teamPreviewReqData.currentUserTeamId && runAnimators.values(this.currentUserRank, teamPreviewReqData.currentUserRank);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.site.hashCode();
        int i = this.matchId;
        int i2 = this.userId;
        int i3 = this.teamId;
        int i4 = this.tourId;
        int hashCode2 = this.srcScreen.hashCode();
        Integer num = this.rank;
        int hashCode3 = num == null ? 0 : num.hashCode();
        int i5 = this.currentUserId;
        int i6 = this.currentUserTeamId;
        Integer num2 = this.currentUserRank;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + i5) * 31) + i6) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.site;
        int i = this.matchId;
        int i2 = this.userId;
        int i3 = this.teamId;
        int i4 = this.tourId;
        String str2 = this.srcScreen;
        Integer num = this.rank;
        int i5 = this.currentUserId;
        int i6 = this.currentUserTeamId;
        Integer num2 = this.currentUserRank;
        return "TeamPreviewReqData(site=" + str + ", matchId=" + i + ", userId=" + i2 + ", teamId=" + i3 + ", tourId=" + i4 + ", srcScreen=" + str2 + ", rank=" + num + ", currentUserId=" + i5 + ", currentUserTeamId=" + i6 + ", currentUserRank=" + num2 + ")";
    }

    public TeamPreviewReqData(String str, int i, int i2, int i3, int i4, String str2, Integer num, int i5, int i6, Integer num2) {
        runAnimators.ag$a(str, FlowState.SITE);
        runAnimators.ag$a(str2, "srcScreen");
        this.site = str;
        this.matchId = i;
        this.userId = i2;
        this.teamId = i3;
        this.tourId = i4;
        this.srcScreen = str2;
        this.rank = num;
        this.currentUserId = i5;
        this.currentUserTeamId = i6;
        this.currentUserRank = num2;
    }

    public /* synthetic */ TeamPreviewReqData(String str, int i, int i2, int i3, int i4, String str2, Integer num, int i5, int i6, Integer num2, int i7, getTargetTypes gettargettypes) {
        this(str, i, i2, i3, i4, str2, (i7 & 64) != 0 ? null : num, (i7 & 128) != 0 ? -1 : i5, (i7 & 256) != 0 ? -1 : i6, (i7 & 512) != 0 ? null : num2);
    }

    public final String getSite() {
        return this.site;
    }

    public final int getMatchId() {
        return this.matchId;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final int getTeamId() {
        return this.teamId;
    }

    public final int getTourId() {
        return this.tourId;
    }

    public final String getSrcScreen() {
        return this.srcScreen;
    }

    public final Integer getRank() {
        return this.rank;
    }

    public final int getCurrentUserId() {
        return this.currentUserId;
    }

    public final int getCurrentUserTeamId() {
        return this.currentUserTeamId;
    }

    public final Integer getCurrentUserRank() {
        return this.currentUserRank;
    }

    public final GameConfig getGameConfig() {
        return this.gameConfig;
    }

    public final void setGameConfig(GameConfig gameConfig) {
        this.gameConfig = gameConfig;
    }

    public final String getCallbackKey() {
        return this.callbackKey;
    }

    public final void setCallbackKey(String str) {
        this.callbackKey = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TeamPreviewReqData(String str, int i, int i2, int i3, int i4, String str2) {
        this(str, i, i2, i3, i4, str2, null, -1, -1, null);
        runAnimators.ag$a(str, FlowState.SITE);
        runAnimators.ag$a(str2, "srcScreen");
    }
}
