package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class EmailRequest extends CommonRequest {
    private String AltEmailId;
    private String isNewVerificationReq;

    public EmailRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public void setIsNewVerificationReq(String str) {
        this.isNewVerificationReq = str;
    }

    public void setAltEmailId(String str) {
        this.AltEmailId = str;
    }
}
