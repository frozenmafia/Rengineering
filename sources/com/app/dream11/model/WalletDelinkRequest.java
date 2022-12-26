package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes6.dex */
public class WalletDelinkRequest extends BaseRequest {
    private String wallet;

    public WalletDelinkRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public String getWallet() {
        return this.wallet;
    }

    public void setWallet(String str) {
        this.wallet = str;
    }
}
