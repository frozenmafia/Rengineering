package com.app.dream11.model;
/* loaded from: classes.dex */
public class CostBreakup {
    private int emailVerify;
    private int mobileVerify;
    private int registration;

    public CostBreakup(int i, int i2, int i3) {
        this.mobileVerify = i;
        this.emailVerify = i2;
        this.registration = i3;
    }

    public int getMobileVerify() {
        return this.mobileVerify;
    }

    public void setMobileVerify(int i) {
        this.mobileVerify = i;
    }

    public int getEmailVerify() {
        return this.emailVerify;
    }

    public void setEmailVerify(int i) {
        this.emailVerify = i;
    }

    public int getRegistration() {
        return this.registration;
    }

    public void setRegistration(int i) {
        this.registration = i;
    }
}
