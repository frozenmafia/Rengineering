package com.app.dream11.model;
/* loaded from: classes3.dex */
public class InitReferralResponse {
    private CostBreakup costBreakup;
    private String inviteFriendAppBG;
    private int showReferralPromotion = 1;

    public InitReferralResponse(CostBreakup costBreakup) {
        this.costBreakup = costBreakup;
    }

    public CostBreakup getCostBreakup() {
        return this.costBreakup;
    }

    public void setCostBreakup(CostBreakup costBreakup) {
        this.costBreakup = costBreakup;
    }

    public String getInviteFriendAppBG() {
        return this.inviteFriendAppBG;
    }

    public void setInviteFriendAppBG(String str) {
        this.inviteFriendAppBG = str;
    }

    public boolean showReferralPromotion() {
        return this.showReferralPromotion != 0;
    }
}
