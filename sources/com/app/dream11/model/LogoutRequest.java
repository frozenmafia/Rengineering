package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class LogoutRequest extends BaseDeviceRequest {
    private String wlsSlug;

    public LogoutRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
        this.wlsSlug = this.wlsSlug;
    }

    public String getWlsSlug() {
        return this.wlsSlug;
    }

    public void setWlsSlug(String str) {
        this.wlsSlug = str;
    }
}
