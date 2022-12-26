package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.type.Behaviour;
import com.app.dream11.core.service.graphql.api.type.ContestCategory;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ContestModel {
    private final Behaviour behaviour;
    private final ContestCategory contestCategory;
    private final String contestName;
    private final int contestSize;
    private final String contestType;
    private final EntryFeeModel entryFee;
    private final String id;
    private final String inviteCode;
    private final boolean isGuaranteed;
    private final boolean isMultipleEntry;
    private final Boolean isPartnerContest;
    private final MatchModel match;
    private final PrizeAmountModel prizeAmount;
    private final String prizeDisplayText;
    private final Tours tour;

    public final String component1() {
        return this.inviteCode;
    }

    public final int component10() {
        return this.contestSize;
    }

    public final String component11() {
        return this.contestName;
    }

    public final String component12() {
        return this.prizeDisplayText;
    }

    public final Tours component13() {
        return this.tour;
    }

    public final Behaviour component14() {
        return this.behaviour;
    }

    public final MatchModel component15() {
        return this.match;
    }

    public final String component2() {
        return this.contestType;
    }

    public final String component3() {
        return this.id;
    }

    public final ContestCategory component4() {
        return this.contestCategory;
    }

    public final EntryFeeModel component5() {
        return this.entryFee;
    }

    public final Boolean component6() {
        return this.isPartnerContest;
    }

    public final boolean component7() {
        return this.isMultipleEntry;
    }

    public final boolean component8() {
        return this.isGuaranteed;
    }

    public final PrizeAmountModel component9() {
        return this.prizeAmount;
    }

    public final ContestModel copy(String str, String str2, String str3, ContestCategory contestCategory, EntryFeeModel entryFeeModel, Boolean bool, boolean z, boolean z2, PrizeAmountModel prizeAmountModel, int i, String str4, String str5, Tours tours, Behaviour behaviour, MatchModel matchModel) {
        runAnimators.ag$a(str, "inviteCode");
        runAnimators.ag$a(str2, "contestType");
        runAnimators.ag$a(contestCategory, "contestCategory");
        runAnimators.ag$a(entryFeeModel, "entryFee");
        runAnimators.ag$a(prizeAmountModel, "prizeAmount");
        runAnimators.ag$a(tours, "tour");
        runAnimators.ag$a(matchModel, "match");
        return new ContestModel(str, str2, str3, contestCategory, entryFeeModel, bool, z, z2, prizeAmountModel, i, str4, str5, tours, behaviour, matchModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContestModel) {
            ContestModel contestModel = (ContestModel) obj;
            return runAnimators.values((Object) this.inviteCode, (Object) contestModel.inviteCode) && runAnimators.values((Object) this.contestType, (Object) contestModel.contestType) && runAnimators.values((Object) this.id, (Object) contestModel.id) && this.contestCategory == contestModel.contestCategory && runAnimators.values(this.entryFee, contestModel.entryFee) && runAnimators.values(this.isPartnerContest, contestModel.isPartnerContest) && this.isMultipleEntry == contestModel.isMultipleEntry && this.isGuaranteed == contestModel.isGuaranteed && runAnimators.values(this.prizeAmount, contestModel.prizeAmount) && this.contestSize == contestModel.contestSize && runAnimators.values((Object) this.contestName, (Object) contestModel.contestName) && runAnimators.values((Object) this.prizeDisplayText, (Object) contestModel.prizeDisplayText) && runAnimators.values(this.tour, contestModel.tour) && this.behaviour == contestModel.behaviour && runAnimators.values(this.match, contestModel.match);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.inviteCode.hashCode();
        int hashCode2 = this.contestType.hashCode();
        String str = this.id;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.contestCategory.hashCode();
        int hashCode5 = this.entryFee.hashCode();
        Boolean bool = this.isPartnerContest;
        int hashCode6 = bool == null ? 0 : bool.hashCode();
        boolean z = this.isMultipleEntry;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        boolean z2 = this.isGuaranteed;
        int i2 = z2 ? 1 : z2 ? 1 : 0;
        int hashCode7 = this.prizeAmount.hashCode();
        int i3 = this.contestSize;
        String str2 = this.contestName;
        int hashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.prizeDisplayText;
        int hashCode9 = str3 == null ? 0 : str3.hashCode();
        int hashCode10 = this.tour.hashCode();
        Behaviour behaviour = this.behaviour;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i) * 31) + i2) * 31) + hashCode7) * 31) + i3) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (behaviour != null ? behaviour.hashCode() : 0)) * 31) + this.match.hashCode();
    }

    public String toString() {
        String str = this.inviteCode;
        String str2 = this.contestType;
        String str3 = this.id;
        ContestCategory contestCategory = this.contestCategory;
        EntryFeeModel entryFeeModel = this.entryFee;
        Boolean bool = this.isPartnerContest;
        boolean z = this.isMultipleEntry;
        boolean z2 = this.isGuaranteed;
        PrizeAmountModel prizeAmountModel = this.prizeAmount;
        int i = this.contestSize;
        String str4 = this.contestName;
        String str5 = this.prizeDisplayText;
        Tours tours = this.tour;
        Behaviour behaviour = this.behaviour;
        MatchModel matchModel = this.match;
        return "ContestModel(inviteCode=" + str + ", contestType=" + str2 + ", id=" + str3 + ", contestCategory=" + contestCategory + ", entryFee=" + entryFeeModel + ", isPartnerContest=" + bool + ", isMultipleEntry=" + z + ", isGuaranteed=" + z2 + ", prizeAmount=" + prizeAmountModel + ", contestSize=" + i + ", contestName=" + str4 + ", prizeDisplayText=" + str5 + ", tour=" + tours + ", behaviour=" + behaviour + ", match=" + matchModel + ")";
    }

    public ContestModel(String str, String str2, String str3, ContestCategory contestCategory, EntryFeeModel entryFeeModel, Boolean bool, boolean z, boolean z2, PrizeAmountModel prizeAmountModel, int i, String str4, String str5, Tours tours, Behaviour behaviour, MatchModel matchModel) {
        runAnimators.ag$a(str, "inviteCode");
        runAnimators.ag$a(str2, "contestType");
        runAnimators.ag$a(contestCategory, "contestCategory");
        runAnimators.ag$a(entryFeeModel, "entryFee");
        runAnimators.ag$a(prizeAmountModel, "prizeAmount");
        runAnimators.ag$a(tours, "tour");
        runAnimators.ag$a(matchModel, "match");
        this.inviteCode = str;
        this.contestType = str2;
        this.id = str3;
        this.contestCategory = contestCategory;
        this.entryFee = entryFeeModel;
        this.isPartnerContest = bool;
        this.isMultipleEntry = z;
        this.isGuaranteed = z2;
        this.prizeAmount = prizeAmountModel;
        this.contestSize = i;
        this.contestName = str4;
        this.prizeDisplayText = str5;
        this.tour = tours;
        this.behaviour = behaviour;
        this.match = matchModel;
    }

    public final String getInviteCode() {
        return this.inviteCode;
    }

    public final String getContestType() {
        return this.contestType;
    }

    public final String getId() {
        return this.id;
    }

    public final ContestCategory getContestCategory() {
        return this.contestCategory;
    }

    public final EntryFeeModel getEntryFee() {
        return this.entryFee;
    }

    public final Boolean isPartnerContest() {
        return this.isPartnerContest;
    }

    public final boolean isMultipleEntry() {
        return this.isMultipleEntry;
    }

    public final boolean isGuaranteed() {
        return this.isGuaranteed;
    }

    public final PrizeAmountModel getPrizeAmount() {
        return this.prizeAmount;
    }

    public final int getContestSize() {
        return this.contestSize;
    }

    public final String getContestName() {
        return this.contestName;
    }

    public final String getPrizeDisplayText() {
        return this.prizeDisplayText;
    }

    public final Tours getTour() {
        return this.tour;
    }

    public final Behaviour getBehaviour() {
        return this.behaviour;
    }

    public final MatchModel getMatch() {
        return this.match;
    }
}
