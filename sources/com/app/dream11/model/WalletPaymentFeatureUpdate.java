package com.app.dream11.model;

import com.app.dream11.core.event.EventType;
/* loaded from: classes3.dex */
public class WalletPaymentFeatureUpdate extends FeatureUpdate {
    private String message;
    private String msgCode;
    private String walletType;

    public WalletPaymentFeatureUpdate(EventType eventType) {
        super(eventType);
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getWalletType() {
        return this.walletType;
    }

    public void setWalletType(String str) {
        this.walletType = str;
    }
}
