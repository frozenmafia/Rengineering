package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes6.dex */
public class VerifyWalletOtpRequest extends BaseRequest {
    private String mobileNumber;
    private String otp;
    private String otpToken;
    private String wallet;

    public VerifyWalletOtpRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider, String str, String str2, String str3, String str4) {
        super(onactionviewexpanded, iEventDataProvider);
        this.mobileNumber = str;
        this.otp = str2;
        this.otpToken = str3;
        this.wallet = str4;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public String getOtp() {
        return this.otp;
    }

    public void setOtp(String str) {
        this.otp = str;
    }

    public String getOtpToken() {
        return this.otpToken;
    }

    public void setOtpToken(String str) {
        this.otpToken = str;
    }

    public String getWallet() {
        return this.wallet;
    }

    public void setWallet(String str) {
        this.wallet = str;
    }
}
