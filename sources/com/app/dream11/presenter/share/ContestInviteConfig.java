package com.app.dream11.presenter.share;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.model.FlowState;
import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ContestInviteConfig implements Serializable {
    private final String contestCategory;
    private final String contestId;
    private final String contestType;
    private final double entryFee;
    private final String invitationCode;
    private final int roundId;
    private final long startTime;
    private final int tourId;
    private final String wlsSlug;

    public final String component1() {
        return this.contestType;
    }

    public final String component2() {
        return this.contestCategory;
    }

    public final int component3() {
        return this.tourId;
    }

    public final String component4() {
        return this.contestId;
    }

    public final int component5() {
        return this.roundId;
    }

    public final String component6() {
        return this.wlsSlug;
    }

    public final long component7() {
        return this.startTime;
    }

    public final String component8() {
        return this.invitationCode;
    }

    public final double component9() {
        return this.entryFee;
    }

    public final ContestInviteConfig copy(String str, String str2, int i, String str3, int i2, String str4, long j, String str5, double d) {
        runAnimators.ag$a(str, "contestType");
        runAnimators.ag$a(str2, "contestCategory");
        runAnimators.ag$a(str3, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(str4, FlowState.WLS_SLUG);
        runAnimators.ag$a(str5, "invitationCode");
        return new ContestInviteConfig(str, str2, i, str3, i2, str4, j, str5, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContestInviteConfig) {
            ContestInviteConfig contestInviteConfig = (ContestInviteConfig) obj;
            return runAnimators.values((Object) this.contestType, (Object) contestInviteConfig.contestType) && runAnimators.values((Object) this.contestCategory, (Object) contestInviteConfig.contestCategory) && this.tourId == contestInviteConfig.tourId && runAnimators.values((Object) this.contestId, (Object) contestInviteConfig.contestId) && this.roundId == contestInviteConfig.roundId && runAnimators.values((Object) this.wlsSlug, (Object) contestInviteConfig.wlsSlug) && this.startTime == contestInviteConfig.startTime && runAnimators.values((Object) this.invitationCode, (Object) contestInviteConfig.invitationCode) && runAnimators.values(Double.valueOf(this.entryFee), Double.valueOf(contestInviteConfig.entryFee));
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((this.contestType.hashCode() * 31) + this.contestCategory.hashCode()) * 31) + this.tourId) * 31) + this.contestId.hashCode()) * 31) + this.roundId) * 31) + this.wlsSlug.hashCode()) * 31) + ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.startTime)) * 31) + this.invitationCode.hashCode()) * 31) + Double.doubleToLongBits(this.entryFee);
    }

    public String toString() {
        String str = this.contestType;
        String str2 = this.contestCategory;
        int i = this.tourId;
        String str3 = this.contestId;
        int i2 = this.roundId;
        String str4 = this.wlsSlug;
        long j = this.startTime;
        String str5 = this.invitationCode;
        double d = this.entryFee;
        return "ContestInviteConfig(contestType=" + str + ", contestCategory=" + str2 + ", tourId=" + i + ", contestId=" + str3 + ", roundId=" + i2 + ", wlsSlug=" + str4 + ", startTime=" + j + ", invitationCode=" + str5 + ", entryFee=" + d + ")";
    }

    public ContestInviteConfig(String str, String str2, int i, String str3, int i2, String str4, long j, String str5, double d) {
        runAnimators.ag$a(str, "contestType");
        runAnimators.ag$a(str2, "contestCategory");
        runAnimators.ag$a(str3, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(str4, FlowState.WLS_SLUG);
        runAnimators.ag$a(str5, "invitationCode");
        this.contestType = str;
        this.contestCategory = str2;
        this.tourId = i;
        this.contestId = str3;
        this.roundId = i2;
        this.wlsSlug = str4;
        this.startTime = j;
        this.invitationCode = str5;
        this.entryFee = d;
    }

    public final String getContestType() {
        return this.contestType;
    }

    public final String getContestCategory() {
        return this.contestCategory;
    }

    public final int getTourId() {
        return this.tourId;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final int getRoundId() {
        return this.roundId;
    }

    public final String getWlsSlug() {
        return this.wlsSlug;
    }

    public final double getEntryFee() {
        return this.entryFee;
    }

    public final String getInvitationCode() {
        return this.invitationCode;
    }

    public final long getStartTime() {
        return this.startTime;
    }
}
