package com.app.dream11.payment.amountSelection.offers;

import java.io.Serializable;
import o.getTargetTypes;
/* loaded from: classes3.dex */
public final class AddCashDisplayModel implements Serializable {
    public static final String ADD_CASH_FANCODE = "FanCode";
    public static final int ADD_CASH_JOIN_LEAGUE = 2;
    public static final String ADD_CASH_LOW_BALANCE = "LowBalance";
    public static final String ADD_CASH_RECHARGE = "Recharge";
    public static final int ADD_CASH_TOP_UP = 1;
    public static final int ADD_FANCODE_SUBSCRIPTION = 3;
    public static final toString Companion = new toString(null);
    private final SingleItemModel couponIconModel;
    private final double entryAmt;
    private final SingleItemModel finalItemModel;
    private final MatchDetails matchDetails;
    private final SingleItemModel primaryTitleIconModel;
    private final Double remainingAmt;
    private final SingleItemModel secondaryTitleIconModel;
    private final boolean shouldFetchCurrentBalance;
    private final SingleItemModel titleSubtitleModel;
    private final SingleItemModel titleValueModel;
    private final int type;
    private final double usableCashBonusVal;
    private final double userWalletBalance;

    public AddCashDisplayModel(int i, SingleItemModel singleItemModel, SingleItemModel singleItemModel2, SingleItemModel singleItemModel3, SingleItemModel singleItemModel4, SingleItemModel singleItemModel5, SingleItemModel singleItemModel6, double d, Double d2, double d3, double d4, boolean z, MatchDetails matchDetails) {
        this.type = i;
        this.titleValueModel = singleItemModel;
        this.titleSubtitleModel = singleItemModel2;
        this.primaryTitleIconModel = singleItemModel3;
        this.secondaryTitleIconModel = singleItemModel4;
        this.couponIconModel = singleItemModel5;
        this.finalItemModel = singleItemModel6;
        this.userWalletBalance = d;
        this.remainingAmt = d2;
        this.entryAmt = d3;
        this.usableCashBonusVal = d4;
        this.shouldFetchCurrentBalance = z;
        this.matchDetails = matchDetails;
    }

    public /* synthetic */ AddCashDisplayModel(int i, SingleItemModel singleItemModel, SingleItemModel singleItemModel2, SingleItemModel singleItemModel3, SingleItemModel singleItemModel4, SingleItemModel singleItemModel5, SingleItemModel singleItemModel6, double d, Double d2, double d3, double d4, boolean z, MatchDetails matchDetails, int i2, getTargetTypes gettargettypes) {
        this(i, (i2 & 2) != 0 ? null : singleItemModel, (i2 & 4) != 0 ? null : singleItemModel2, (i2 & 8) != 0 ? null : singleItemModel3, (i2 & 16) != 0 ? null : singleItemModel4, (i2 & 32) != 0 ? null : singleItemModel5, (i2 & 64) != 0 ? null : singleItemModel6, (i2 & 128) != 0 ? -1.0d : d, (i2 & 256) != 0 ? null : d2, (i2 & 512) != 0 ? 0.0d : d3, (i2 & 1024) == 0 ? d4 : 0.0d, (i2 & 2048) != 0 ? true : z, (i2 & 4096) == 0 ? matchDetails : null);
    }

    public final int getType() {
        return this.type;
    }

    public final SingleItemModel getTitleValueModel() {
        return this.titleValueModel;
    }

    public final SingleItemModel getTitleSubtitleModel() {
        return this.titleSubtitleModel;
    }

    public final SingleItemModel getPrimaryTitleIconModel() {
        return this.primaryTitleIconModel;
    }

    public final SingleItemModel getSecondaryTitleIconModel() {
        return this.secondaryTitleIconModel;
    }

    public final SingleItemModel getCouponIconModel() {
        return this.couponIconModel;
    }

    public final SingleItemModel getFinalItemModel() {
        return this.finalItemModel;
    }

    public final double getUserWalletBalance() {
        return this.userWalletBalance;
    }

    public final Double getRemainingAmt() {
        return this.remainingAmt;
    }

    public final double getEntryAmt() {
        return this.entryAmt;
    }

    public final double getUsableCashBonusVal() {
        return this.usableCashBonusVal;
    }

    public final boolean getShouldFetchCurrentBalance() {
        return this.shouldFetchCurrentBalance;
    }

    public final MatchDetails getMatchDetails() {
        return this.matchDetails;
    }

    /* loaded from: classes3.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }
}
