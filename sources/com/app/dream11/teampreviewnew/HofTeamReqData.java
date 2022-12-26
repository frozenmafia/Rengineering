package com.app.dream11.teampreviewnew;

import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.model.FlowState;
import com.app.dream11.model.GameConfig;
import java.io.Serializable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class HofTeamReqData implements Serializable {
    private final String contestId;
    private GameConfig gameConfig;
    private final int matchId;
    private final String site;
    private final String srcScreen;
    private final int teamId;
    private final int tourId;
    private final int userId;

    public final String component1() {
        return this.site;
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
        return this.contestId;
    }

    public final String component7() {
        return this.srcScreen;
    }

    public final GameConfig component8() {
        return this.gameConfig;
    }

    public final HofTeamReqData copy(String str, int i, int i2, int i3, int i4, String str2, String str3, GameConfig gameConfig) {
        runAnimators.ag$a(str, FlowState.SITE);
        runAnimators.ag$a(str2, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(str3, "srcScreen");
        return new HofTeamReqData(str, i, i2, i3, i4, str2, str3, gameConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HofTeamReqData) {
            HofTeamReqData hofTeamReqData = (HofTeamReqData) obj;
            return runAnimators.values((Object) this.site, (Object) hofTeamReqData.site) && this.matchId == hofTeamReqData.matchId && this.userId == hofTeamReqData.userId && this.teamId == hofTeamReqData.teamId && this.tourId == hofTeamReqData.tourId && runAnimators.values((Object) this.contestId, (Object) hofTeamReqData.contestId) && runAnimators.values((Object) this.srcScreen, (Object) hofTeamReqData.srcScreen) && runAnimators.values(this.gameConfig, hofTeamReqData.gameConfig);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.site.hashCode();
        int i = this.matchId;
        int i2 = this.userId;
        int i3 = this.teamId;
        int i4 = this.tourId;
        int hashCode2 = this.contestId.hashCode();
        int hashCode3 = this.srcScreen.hashCode();
        GameConfig gameConfig = this.gameConfig;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + (gameConfig == null ? 0 : gameConfig.hashCode());
    }

    public String toString() {
        String str = this.site;
        int i = this.matchId;
        int i2 = this.userId;
        int i3 = this.teamId;
        int i4 = this.tourId;
        String str2 = this.contestId;
        String str3 = this.srcScreen;
        GameConfig gameConfig = this.gameConfig;
        return "HofTeamReqData(site=" + str + ", matchId=" + i + ", userId=" + i2 + ", teamId=" + i3 + ", tourId=" + i4 + ", contestId=" + str2 + ", srcScreen=" + str3 + ", gameConfig=" + gameConfig + ")";
    }

    public HofTeamReqData(String str, int i, int i2, int i3, int i4, String str2, String str3, GameConfig gameConfig) {
        runAnimators.ag$a(str, FlowState.SITE);
        runAnimators.ag$a(str2, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(str3, "srcScreen");
        this.site = str;
        this.matchId = i;
        this.userId = i2;
        this.teamId = i3;
        this.tourId = i4;
        this.contestId = str2;
        this.srcScreen = str3;
        this.gameConfig = gameConfig;
    }

    public /* synthetic */ HofTeamReqData(String str, int i, int i2, int i3, int i4, String str2, String str3, GameConfig gameConfig, int i5, getTargetTypes gettargettypes) {
        this(str, i, i2, i3, i4, str2, str3, (i5 & 128) != 0 ? null : gameConfig);
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final GameConfig getGameConfig() {
        return this.gameConfig;
    }

    public final int getMatchId() {
        return this.matchId;
    }

    public final String getSite() {
        return this.site;
    }

    public final String getSrcScreen() {
        return this.srcScreen;
    }

    public final int getTeamId() {
        return this.teamId;
    }

    public final int getTourId() {
        return this.tourId;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final void setGameConfig(GameConfig gameConfig) {
        this.gameConfig = gameConfig;
    }
}
