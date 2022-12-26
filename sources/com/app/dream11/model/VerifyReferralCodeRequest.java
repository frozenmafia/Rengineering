package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class VerifyReferralCodeRequest extends BaseDeviceRequest {
    private String shortRefCode;

    public VerifyReferralCodeRequest(String str, onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
        this.shortRefCode = str;
    }

    public String getShortRefCode() {
        return this.shortRefCode;
    }

    public void setShortRefCode(String str) {
        this.shortRefCode = str;
    }
}
