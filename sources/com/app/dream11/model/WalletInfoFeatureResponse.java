package com.app.dream11.model;
/* loaded from: classes3.dex */
public class WalletInfoFeatureResponse {
    private Double balance;
    private DefaultMobileNumber defaultMobileNumber;
    private boolean isSuccess;
    private String walletType;

    public WalletInfoFeatureResponse(Boolean bool, String str, Double d) {
        this.isSuccess = bool.booleanValue();
        this.walletType = str;
        this.balance = d;
    }

    public WalletInfoFeatureResponse(String str, DefaultMobileNumber defaultMobileNumber) {
        this.walletType = str;
        this.defaultMobileNumber = defaultMobileNumber;
    }

    public String getWalletType() {
        return this.walletType;
    }

    public void setWalletType(String str) {
        this.walletType = str;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double d) {
        this.balance = d;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public DefaultMobileNumber getDefaultMobileNumber() {
        return this.defaultMobileNumber;
    }

    public void setDefaultMobileNumber(DefaultMobileNumber defaultMobileNumber) {
        this.defaultMobileNumber = defaultMobileNumber;
    }
}
