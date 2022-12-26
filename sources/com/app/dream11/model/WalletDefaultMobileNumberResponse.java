package com.app.dream11.model;
/* loaded from: classes6.dex */
public class WalletDefaultMobileNumberResponse {
    private Boolean isMobileNumberEditable;
    private String mobileNumber;
    private Boolean status;

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean bool) {
        this.status = bool;
    }

    public Boolean getMobileNumberEditable() {
        return this.isMobileNumberEditable;
    }

    public void setMobileNumberEditable(Boolean bool) {
        this.isMobileNumberEditable = bool;
    }
}
