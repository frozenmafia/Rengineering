package com.app.dream11.model;
/* loaded from: classes6.dex */
public class WithdrawResponse {
    private FeatureResponse<String> response;
    TYPE type;
    private WalletWithdrawResponse walletWithdrawResponse;

    /* loaded from: classes6.dex */
    public enum TYPE {
        WITHDRAW,
        RECHARGE_AND_WITHDRAW
    }

    public WalletWithdrawResponse getWalletWithdrawResponse() {
        return this.walletWithdrawResponse;
    }

    public void setWalletWithdrawResponse(WalletWithdrawResponse walletWithdrawResponse) {
        this.walletWithdrawResponse = walletWithdrawResponse;
    }

    public FeatureResponse<String> getResponse() {
        return this.response;
    }

    public void setResponse(FeatureResponse<String> featureResponse) {
        this.response = featureResponse;
    }

    public TYPE getType() {
        return this.type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
