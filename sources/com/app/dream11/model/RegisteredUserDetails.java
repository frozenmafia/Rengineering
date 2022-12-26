package com.app.dream11.model;
/* loaded from: classes.dex */
public class RegisteredUserDetails {
    private RegisteredUserInfo UserInfo;
    private String VerifiedStatus;

    public String getVerifiedStatus() {
        return this.VerifiedStatus;
    }

    public void setVerifiedStatus(String str) {
        this.VerifiedStatus = str;
    }

    public RegisteredUserInfo getUserInfo() {
        return this.UserInfo;
    }

    public void setUserInfo(RegisteredUserInfo registeredUserInfo) {
        this.UserInfo = registeredUserInfo;
    }
}
