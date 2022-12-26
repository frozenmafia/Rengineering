package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class GetOtpRequest extends BaseDeviceRequest {
    private String mobileNum;
    private String wlsSlug;

    public GetOtpRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public void setMobileNum(String str) {
        this.mobileNum = str;
    }

    public String getMobileNum() {
        return this.mobileNum;
    }

    public String getWlsSlug() {
        return this.wlsSlug;
    }

    public void setWlsSlug(String str) {
        this.wlsSlug = str;
    }
}
