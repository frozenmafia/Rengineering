package com.dreampay.commons.netbanking;

import java.util.List;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class AllBanks {
    private final List<Bank> otherBanks;
    private final List<Bank> popularBanks;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllBanks copy$default(AllBanks allBanks, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = allBanks.popularBanks;
        }
        if ((i & 2) != 0) {
            list2 = allBanks.otherBanks;
        }
        return allBanks.copy(list, list2);
    }

    public final List<Bank> component1() {
        return this.popularBanks;
    }

    public final List<Bank> component2() {
        return this.otherBanks;
    }

    public final AllBanks copy(List<Bank> list, List<Bank> list2) {
        runAnimators.ag$a(list, "popularBanks");
        runAnimators.ag$a(list2, "otherBanks");
        return new AllBanks(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AllBanks) {
            AllBanks allBanks = (AllBanks) obj;
            return runAnimators.values(this.popularBanks, allBanks.popularBanks) && runAnimators.values(this.otherBanks, allBanks.otherBanks);
        }
        return false;
    }

    public int hashCode() {
        return (this.popularBanks.hashCode() * 31) + this.otherBanks.hashCode();
    }

    public String toString() {
        return "AllBanks(popularBanks=" + this.popularBanks + ", otherBanks=" + this.otherBanks + ')';
    }

    public AllBanks(List<Bank> list, List<Bank> list2) {
        runAnimators.ag$a(list, "popularBanks");
        runAnimators.ag$a(list2, "otherBanks");
        this.popularBanks = list;
        this.otherBanks = list2;
    }

    public final List<Bank> getOtherBanks() {
        return this.otherBanks;
    }

    public final List<Bank> getPopularBanks() {
        return this.popularBanks;
    }
}
