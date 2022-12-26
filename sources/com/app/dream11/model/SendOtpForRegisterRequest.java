package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class SendOtpForRegisterRequest extends BaseCampaignRequest {
    private String email;
    private Boolean isMobileOnlyRegister;
    private String mobileNumber;
    private String password;
    private String shortCode;
    private String wlsSlugName;

    public SendOtpForRegisterRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public Boolean getMobileOnlyRegister() {
        return this.isMobileOnlyRegister;
    }

    public void setMobileOnlyRegister(Boolean bool) {
        this.isMobileOnlyRegister = bool;
    }

    public String getWlsSlugName() {
        return this.wlsSlugName;
    }

    public void setWlsSlugName(String str) {
        this.wlsSlugName = str;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public String getShortCode() {
        return this.shortCode;
    }

    public void setShortCode(String str) {
        this.shortCode = str;
    }
}
