package com.app.dream11.model;
/* loaded from: classes.dex */
public class ReferralSummaryResponse {
    private String imageurl;
    private Referral referral = new Referral();
    private ReferralUser user = new ReferralUser();

    public Referral getReferral() {
        return this.referral;
    }

    public void setReferral(Referral referral) {
        this.referral = referral;
    }

    public ReferralUser getUser() {
        return this.user;
    }

    public void setUser(ReferralUser referralUser) {
        this.user = referralUser;
    }

    public String getImageurl() {
        return this.imageurl;
    }

    public void setImageurl(String str) {
        this.imageurl = str;
    }
}
