package com.app.dream11.contest.buypass;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.runAnimators;
/* loaded from: classes.dex */
public final class BuyNowFlowState extends FlowState {
    private final Double cashBonusBlockedAmount;
    private final String cashBonusToolTipText;
    private final String ctaText;
    private final String disclaimerMessage;
    private final String payableAmount;
    private final String purchaseAmount;
    private final String purchaseSubTitle;
    private final String purchaseTitle;
    private final String totalAvailableAmount;
    private final String usableCashBonusAmount;

    public final String component1() {
        return this.totalAvailableAmount;
    }

    public final String component10() {
        return this.ctaText;
    }

    public final String component2() {
        return this.purchaseTitle;
    }

    public final String component3() {
        return this.purchaseSubTitle;
    }

    public final String component4() {
        return this.purchaseAmount;
    }

    public final String component5() {
        return this.usableCashBonusAmount;
    }

    public final String component6() {
        return this.cashBonusToolTipText;
    }

    public final Double component7() {
        return this.cashBonusBlockedAmount;
    }

    public final String component8() {
        return this.payableAmount;
    }

    public final String component9() {
        return this.disclaimerMessage;
    }

    public final BuyNowFlowState copy(String str, String str2, String str3, String str4, String str5, String str6, Double d, String str7, String str8, String str9) {
        runAnimators.ag$a(str, "totalAvailableAmount");
        runAnimators.ag$a(str2, "purchaseTitle");
        runAnimators.ag$a(str4, "purchaseAmount");
        runAnimators.ag$a(str5, "usableCashBonusAmount");
        runAnimators.ag$a(str7, "payableAmount");
        runAnimators.ag$a(str9, "ctaText");
        return new BuyNowFlowState(str, str2, str3, str4, str5, str6, d, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuyNowFlowState) {
            BuyNowFlowState buyNowFlowState = (BuyNowFlowState) obj;
            return runAnimators.values((Object) this.totalAvailableAmount, (Object) buyNowFlowState.totalAvailableAmount) && runAnimators.values((Object) this.purchaseTitle, (Object) buyNowFlowState.purchaseTitle) && runAnimators.values((Object) this.purchaseSubTitle, (Object) buyNowFlowState.purchaseSubTitle) && runAnimators.values((Object) this.purchaseAmount, (Object) buyNowFlowState.purchaseAmount) && runAnimators.values((Object) this.usableCashBonusAmount, (Object) buyNowFlowState.usableCashBonusAmount) && runAnimators.values((Object) this.cashBonusToolTipText, (Object) buyNowFlowState.cashBonusToolTipText) && runAnimators.values(this.cashBonusBlockedAmount, buyNowFlowState.cashBonusBlockedAmount) && runAnimators.values((Object) this.payableAmount, (Object) buyNowFlowState.payableAmount) && runAnimators.values((Object) this.disclaimerMessage, (Object) buyNowFlowState.disclaimerMessage) && runAnimators.values((Object) this.ctaText, (Object) buyNowFlowState.ctaText);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.totalAvailableAmount.hashCode();
        int hashCode2 = this.purchaseTitle.hashCode();
        String str = this.purchaseSubTitle;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.purchaseAmount.hashCode();
        int hashCode5 = this.usableCashBonusAmount.hashCode();
        String str2 = this.cashBonusToolTipText;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        Double d = this.cashBonusBlockedAmount;
        int hashCode7 = d == null ? 0 : d.hashCode();
        int hashCode8 = this.payableAmount.hashCode();
        String str3 = this.disclaimerMessage;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.ctaText.hashCode();
    }

    @Override // com.app.dream11.model.FlowState
    public String toString() {
        String str = this.totalAvailableAmount;
        String str2 = this.purchaseTitle;
        String str3 = this.purchaseSubTitle;
        String str4 = this.purchaseAmount;
        String str5 = this.usableCashBonusAmount;
        String str6 = this.cashBonusToolTipText;
        Double d = this.cashBonusBlockedAmount;
        String str7 = this.payableAmount;
        String str8 = this.disclaimerMessage;
        String str9 = this.ctaText;
        return "BuyNowFlowState(totalAvailableAmount=" + str + ", purchaseTitle=" + str2 + ", purchaseSubTitle=" + str3 + ", purchaseAmount=" + str4 + ", usableCashBonusAmount=" + str5 + ", cashBonusToolTipText=" + str6 + ", cashBonusBlockedAmount=" + d + ", payableAmount=" + str7 + ", disclaimerMessage=" + str8 + ", ctaText=" + str9 + ")";
    }

    public final String getTotalAvailableAmount() {
        return this.totalAvailableAmount;
    }

    public final String getPurchaseTitle() {
        return this.purchaseTitle;
    }

    public final String getPurchaseSubTitle() {
        return this.purchaseSubTitle;
    }

    public final String getPurchaseAmount() {
        return this.purchaseAmount;
    }

    public final String getUsableCashBonusAmount() {
        return this.usableCashBonusAmount;
    }

    public final String getCashBonusToolTipText() {
        return this.cashBonusToolTipText;
    }

    public final Double getCashBonusBlockedAmount() {
        return this.cashBonusBlockedAmount;
    }

    public final String getPayableAmount() {
        return this.payableAmount;
    }

    public final String getDisclaimerMessage() {
        return this.disclaimerMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNowFlowState(String str, String str2, String str3, String str4, String str5, String str6, Double d, String str7, String str8, String str9) {
        super(FlowStates.LEAGUE_DETAILS, null, 2, null);
        runAnimators.ag$a(str, "totalAvailableAmount");
        runAnimators.ag$a(str2, "purchaseTitle");
        runAnimators.ag$a(str4, "purchaseAmount");
        runAnimators.ag$a(str5, "usableCashBonusAmount");
        runAnimators.ag$a(str7, "payableAmount");
        runAnimators.ag$a(str9, "ctaText");
        this.totalAvailableAmount = str;
        this.purchaseTitle = str2;
        this.purchaseSubTitle = str3;
        this.purchaseAmount = str4;
        this.usableCashBonusAmount = str5;
        this.cashBonusToolTipText = str6;
        this.cashBonusBlockedAmount = d;
        this.payableAmount = str7;
        this.disclaimerMessage = str8;
        this.ctaText = str9;
    }

    public final String getCtaText() {
        return this.ctaText;
    }
}
