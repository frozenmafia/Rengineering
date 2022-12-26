package com.app.dream11.chat.models;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class MuteInfo {
    private final Long endTime;
    private final boolean isUserMuted;
    private final String muteDescription;
    private final Long remainingTime;
    private final Long startTime;

    public MuteInfo() {
        this(false, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MuteInfo copy$default(MuteInfo muteInfo, boolean z, String str, Long l, Long l2, Long l3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = muteInfo.isUserMuted;
        }
        if ((i & 2) != 0) {
            str = muteInfo.muteDescription;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            l = muteInfo.startTime;
        }
        Long l4 = l;
        if ((i & 8) != 0) {
            l2 = muteInfo.endTime;
        }
        Long l5 = l2;
        if ((i & 16) != 0) {
            l3 = muteInfo.remainingTime;
        }
        return muteInfo.copy(z, str2, l4, l5, l3);
    }

    public final boolean component1() {
        return this.isUserMuted;
    }

    public final String component2() {
        return this.muteDescription;
    }

    public final Long component3() {
        return this.startTime;
    }

    public final Long component4() {
        return this.endTime;
    }

    public final Long component5() {
        return this.remainingTime;
    }

    public final MuteInfo copy(boolean z, String str, Long l, Long l2, Long l3) {
        return new MuteInfo(z, str, l, l2, l3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MuteInfo) {
            MuteInfo muteInfo = (MuteInfo) obj;
            return this.isUserMuted == muteInfo.isUserMuted && runAnimators.values((Object) this.muteDescription, (Object) muteInfo.muteDescription) && runAnimators.values(this.startTime, muteInfo.startTime) && runAnimators.values(this.endTime, muteInfo.endTime) && runAnimators.values(this.remainingTime, muteInfo.remainingTime);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.isUserMuted;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        String str = this.muteDescription;
        int hashCode = str == null ? 0 : str.hashCode();
        Long l = this.startTime;
        int hashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.endTime;
        int hashCode3 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.remainingTime;
        return (((((((r0 * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + (l3 != null ? l3.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.isUserMuted;
        String str = this.muteDescription;
        Long l = this.startTime;
        Long l2 = this.endTime;
        Long l3 = this.remainingTime;
        return "MuteInfo(isUserMuted=" + z + ", muteDescription=" + str + ", startTime=" + l + ", endTime=" + l2 + ", remainingTime=" + l3 + ")";
    }

    public MuteInfo(boolean z, String str, Long l, Long l2, Long l3) {
        this.isUserMuted = z;
        this.muteDescription = str;
        this.startTime = l;
        this.endTime = l2;
        this.remainingTime = l3;
    }

    public final boolean isUserMuted() {
        return this.isUserMuted;
    }

    public final String getMuteDescription() {
        return this.muteDescription;
    }

    public /* synthetic */ MuteInfo(boolean z, String str, Long l, Long l2, Long l3, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? -1L : l, (i & 8) != 0 ? -1L : l2, (i & 16) != 0 ? -1L : l3);
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final Long getRemainingTime() {
        return this.remainingTime;
    }
}
