package com.app.dream11.contest;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes.dex */
public final class FomoData implements Serializable {
    private final String leagueId;
    private final double points;
    private final String profileUrl;
    private final int rank;
    private final int roundId;
    private final int teamId;
    private final String teamName;
    private final int tourId;
    private final int userId;
    private final double winingAmount;

    public final int component1() {
        return this.roundId;
    }

    public final int component10() {
        return this.rank;
    }

    public final int component2() {
        return this.tourId;
    }

    public final String component3() {
        return this.leagueId;
    }

    public final int component4() {
        return this.userId;
    }

    public final double component5() {
        return this.winingAmount;
    }

    public final String component6() {
        return this.profileUrl;
    }

    public final String component7() {
        return this.teamName;
    }

    public final int component8() {
        return this.teamId;
    }

    public final double component9() {
        return this.points;
    }

    public final FomoData copy(int i, int i2, String str, int i3, double d, String str2, String str3, int i4, double d2, int i5) {
        runAnimators.ag$a(str, "leagueId");
        runAnimators.ag$a(str2, "profileUrl");
        runAnimators.ag$a(str3, "teamName");
        return new FomoData(i, i2, str, i3, d, str2, str3, i4, d2, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FomoData) {
            FomoData fomoData = (FomoData) obj;
            return this.roundId == fomoData.roundId && this.tourId == fomoData.tourId && runAnimators.values((Object) this.leagueId, (Object) fomoData.leagueId) && this.userId == fomoData.userId && runAnimators.values(Double.valueOf(this.winingAmount), Double.valueOf(fomoData.winingAmount)) && runAnimators.values((Object) this.profileUrl, (Object) fomoData.profileUrl) && runAnimators.values((Object) this.teamName, (Object) fomoData.teamName) && this.teamId == fomoData.teamId && runAnimators.values(Double.valueOf(this.points), Double.valueOf(fomoData.points)) && this.rank == fomoData.rank;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((this.roundId * 31) + this.tourId) * 31) + this.leagueId.hashCode()) * 31) + this.userId) * 31) + Double.doubleToLongBits(this.winingAmount)) * 31) + this.profileUrl.hashCode()) * 31) + this.teamName.hashCode()) * 31) + this.teamId) * 31) + Double.doubleToLongBits(this.points)) * 31) + this.rank;
    }

    public String toString() {
        int i = this.roundId;
        int i2 = this.tourId;
        String str = this.leagueId;
        int i3 = this.userId;
        double d = this.winingAmount;
        String str2 = this.profileUrl;
        String str3 = this.teamName;
        int i4 = this.teamId;
        double d2 = this.points;
        int i5 = this.rank;
        return "FomoData(roundId=" + i + ", tourId=" + i2 + ", leagueId=" + str + ", userId=" + i3 + ", winingAmount=" + d + ", profileUrl=" + str2 + ", teamName=" + str3 + ", teamId=" + i4 + ", points=" + d2 + ", rank=" + i5 + ")";
    }

    public FomoData(int i, int i2, String str, int i3, double d, String str2, String str3, int i4, double d2, int i5) {
        runAnimators.ag$a(str, "leagueId");
        runAnimators.ag$a(str2, "profileUrl");
        runAnimators.ag$a(str3, "teamName");
        this.roundId = i;
        this.tourId = i2;
        this.leagueId = str;
        this.userId = i3;
        this.winingAmount = d;
        this.profileUrl = str2;
        this.teamName = str3;
        this.teamId = i4;
        this.points = d2;
        this.rank = i5;
    }

    public final int getRoundId() {
        return this.roundId;
    }

    public final int getTourId() {
        return this.tourId;
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final double getWiningAmount() {
        return this.winingAmount;
    }

    public final String getProfileUrl() {
        return this.profileUrl;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    public final int getTeamId() {
        return this.teamId;
    }

    public final double getPoints() {
        return this.points;
    }

    public final int getRank() {
        return this.rank;
    }
}
