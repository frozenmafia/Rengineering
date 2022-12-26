package com.app.dream11.presenter.share;

import com.app.dream11.chat.models.ChatMessageSectionKey$$ExternalSyntheticBackport0;
import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PrivateContestConfig implements Serializable {
    private final double entryFee;
    private final boolean isDynamicContest;
    private final boolean isMulti;
    private final int leagueSize;
    private final String name;
    private final long winningAmt;

    public final String component1() {
        return this.name;
    }

    public final double component2() {
        return this.entryFee;
    }

    public final int component3() {
        return this.leagueSize;
    }

    public final long component4() {
        return this.winningAmt;
    }

    public final boolean component5() {
        return this.isMulti;
    }

    public final boolean component6() {
        return this.isDynamicContest;
    }

    public final PrivateContestConfig copy(String str, double d, int i, long j, boolean z, boolean z2) {
        runAnimators.ag$a(str, "name");
        return new PrivateContestConfig(str, d, i, j, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrivateContestConfig) {
            PrivateContestConfig privateContestConfig = (PrivateContestConfig) obj;
            return runAnimators.values((Object) this.name, (Object) privateContestConfig.name) && runAnimators.values(Double.valueOf(this.entryFee), Double.valueOf(privateContestConfig.entryFee)) && this.leagueSize == privateContestConfig.leagueSize && this.winningAmt == privateContestConfig.winningAmt && this.isMulti == privateContestConfig.isMulti && this.isDynamicContest == privateContestConfig.isDynamicContest;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.name.hashCode();
        int doubleToLongBits = Double.doubleToLongBits(this.entryFee);
        int i = this.leagueSize;
        int m = ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.winningAmt);
        boolean z = this.isMulti;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        boolean z2 = this.isDynamicContest;
        return (((((((((hashCode * 31) + doubleToLongBits) * 31) + i) * 31) + m) * 31) + i2) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.name;
        double d = this.entryFee;
        int i = this.leagueSize;
        long j = this.winningAmt;
        boolean z = this.isMulti;
        boolean z2 = this.isDynamicContest;
        return "PrivateContestConfig(name=" + str + ", entryFee=" + d + ", leagueSize=" + i + ", winningAmt=" + j + ", isMulti=" + z + ", isDynamicContest=" + z2 + ")";
    }

    public PrivateContestConfig(String str, double d, int i, long j, boolean z, boolean z2) {
        runAnimators.ag$a(str, "name");
        this.name = str;
        this.entryFee = d;
        this.leagueSize = i;
        this.winningAmt = j;
        this.isMulti = z;
        this.isDynamicContest = z2;
    }

    public final double getEntryFee() {
        return this.entryFee;
    }

    public final String getName() {
        return this.name;
    }

    public final int getLeagueSize() {
        return this.leagueSize;
    }

    public final long getWinningAmt() {
        return this.winningAmt;
    }

    public final boolean isDynamicContest() {
        return this.isDynamicContest;
    }

    public final boolean isMulti() {
        return this.isMulti;
    }
}
