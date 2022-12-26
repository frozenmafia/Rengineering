package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class SendOtpForLoginRequest extends BaseRequest {
    private String mobileNumber;
    private String wlsSlug;

    public SendOtpForLoginRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider, String str) {
        super(onactionviewexpanded, iEventDataProvider);
        this.mobileNumber = str;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public String getWlsSlug() {
        return this.wlsSlug;
    }

    public void setWlsSlug(String str) {
        this.wlsSlug = str;
    }
}
