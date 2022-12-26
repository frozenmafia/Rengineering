package com.app.dream11.chat.groups;

import o.getAlphabeticModifiers;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupsEntryComponentData {
    private final String contestId;
    private final IMatchDetails currentMatchStatus;
    private final Integer matchId;
    private final getAlphabeticModifiers performanceParams;
    private final boolean shouldFetchMappedGroup;
    private final boolean shouldShowMappedGroup;
    private final String source;

    public static /* synthetic */ GroupsEntryComponentData copy$default(GroupsEntryComponentData groupsEntryComponentData, Integer num, String str, String str2, IMatchDetails iMatchDetails, boolean z, boolean z2, getAlphabeticModifiers getalphabeticmodifiers, int i, Object obj) {
        if ((i & 1) != 0) {
            num = groupsEntryComponentData.matchId;
        }
        if ((i & 2) != 0) {
            str = groupsEntryComponentData.contestId;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = groupsEntryComponentData.source;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            iMatchDetails = groupsEntryComponentData.currentMatchStatus;
        }
        IMatchDetails iMatchDetails2 = iMatchDetails;
        if ((i & 16) != 0) {
            z = groupsEntryComponentData.shouldFetchMappedGroup;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = groupsEntryComponentData.shouldShowMappedGroup;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            getalphabeticmodifiers = groupsEntryComponentData.performanceParams;
        }
        return groupsEntryComponentData.copy(num, str3, str4, iMatchDetails2, z3, z4, getalphabeticmodifiers);
    }

    public final Integer component1() {
        return this.matchId;
    }

    public final String component2() {
        return this.contestId;
    }

    public final String component3() {
        return this.source;
    }

    public final IMatchDetails component4() {
        return this.currentMatchStatus;
    }

    public final boolean component5() {
        return this.shouldFetchMappedGroup;
    }

    public final boolean component6() {
        return this.shouldShowMappedGroup;
    }

    public final getAlphabeticModifiers component7() {
        return this.performanceParams;
    }

    public final GroupsEntryComponentData copy(Integer num, String str, String str2, IMatchDetails iMatchDetails, boolean z, boolean z2, getAlphabeticModifiers getalphabeticmodifiers) {
        return new GroupsEntryComponentData(num, str, str2, iMatchDetails, z, z2, getalphabeticmodifiers);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GroupsEntryComponentData) {
            GroupsEntryComponentData groupsEntryComponentData = (GroupsEntryComponentData) obj;
            return runAnimators.values(this.matchId, groupsEntryComponentData.matchId) && runAnimators.values((Object) this.contestId, (Object) groupsEntryComponentData.contestId) && runAnimators.values((Object) this.source, (Object) groupsEntryComponentData.source) && runAnimators.values(this.currentMatchStatus, groupsEntryComponentData.currentMatchStatus) && this.shouldFetchMappedGroup == groupsEntryComponentData.shouldFetchMappedGroup && this.shouldShowMappedGroup == groupsEntryComponentData.shouldShowMappedGroup && runAnimators.values(this.performanceParams, groupsEntryComponentData.performanceParams);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Integer num = this.matchId;
        int hashCode = num == null ? 0 : num.hashCode();
        String str = this.contestId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.source;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        IMatchDetails iMatchDetails = this.currentMatchStatus;
        int hashCode4 = iMatchDetails == null ? 0 : iMatchDetails.hashCode();
        boolean z = this.shouldFetchMappedGroup;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        boolean z2 = this.shouldShowMappedGroup;
        int i2 = z2 ? 1 : z2 ? 1 : 0;
        getAlphabeticModifiers getalphabeticmodifiers = this.performanceParams;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + i2) * 31) + (getalphabeticmodifiers != null ? getalphabeticmodifiers.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.matchId;
        String str = this.contestId;
        String str2 = this.source;
        IMatchDetails iMatchDetails = this.currentMatchStatus;
        boolean z = this.shouldFetchMappedGroup;
        boolean z2 = this.shouldShowMappedGroup;
        getAlphabeticModifiers getalphabeticmodifiers = this.performanceParams;
        return "GroupsEntryComponentData(matchId=" + num + ", contestId=" + str + ", source=" + str2 + ", currentMatchStatus=" + iMatchDetails + ", shouldFetchMappedGroup=" + z + ", shouldShowMappedGroup=" + z2 + ", performanceParams=" + getalphabeticmodifiers + ")";
    }

    public GroupsEntryComponentData(Integer num, String str, String str2, IMatchDetails iMatchDetails, boolean z, boolean z2, getAlphabeticModifiers getalphabeticmodifiers) {
        this.matchId = num;
        this.contestId = str;
        this.source = str2;
        this.currentMatchStatus = iMatchDetails;
        this.shouldFetchMappedGroup = z;
        this.shouldShowMappedGroup = z2;
        this.performanceParams = getalphabeticmodifiers;
    }

    public /* synthetic */ GroupsEntryComponentData(Integer num, String str, String str2, IMatchDetails iMatchDetails, boolean z, boolean z2, getAlphabeticModifiers getalphabeticmodifiers, int i, getTargetTypes gettargettypes) {
        this(num, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : iMatchDetails, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : getalphabeticmodifiers);
    }

    public final Integer getMatchId() {
        return this.matchId;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final String getSource() {
        return this.source;
    }

    public final IMatchDetails getCurrentMatchStatus() {
        return this.currentMatchStatus;
    }

    public final boolean getShouldFetchMappedGroup() {
        return this.shouldFetchMappedGroup;
    }

    public final boolean getShouldShowMappedGroup() {
        return this.shouldShowMappedGroup;
    }

    public final getAlphabeticModifiers getPerformanceParams() {
        return this.performanceParams;
    }
}
