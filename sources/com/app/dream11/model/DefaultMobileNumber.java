package com.app.dream11.model;
/* loaded from: classes6.dex */
public class DefaultMobileNumber {
    private Boolean isMobileNumberEditable;
    private String mobileNumber;

    public DefaultMobileNumber(String str, Boolean bool) {
        this.mobileNumber = str;
        this.isMobileNumberEditable = bool;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public Boolean getMobileNumberEditable() {
        return this.isMobileNumberEditable;
    }

    public void setMobileNumberEditable(Boolean bool) {
        this.isMobileNumberEditable = bool;
    }
}
