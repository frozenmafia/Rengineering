package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes6.dex */
public class WalletRechargeRequest extends BaseRequest {
    private Double amount;
    private String wallet;

    public WalletRechargeRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public String getWallet() {
        return this.wallet;
    }

    public void setWallet(String str) {
        this.wallet = str;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double d) {
        this.amount = d;
    }
}
