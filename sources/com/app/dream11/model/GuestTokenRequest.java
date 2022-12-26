package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class GuestTokenRequest extends CommonRequest {
    String imei;
    String version;

    public GuestTokenRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getImei() {
        return this.imei;
    }

    public void setImei(String str) {
        this.imei = str;
    }
}
