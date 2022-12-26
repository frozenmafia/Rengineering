package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class SocialVerModel extends CommonRequest {
    String access_token;
    String id_token;
    String platform;

    public SocialVerModel(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public String getAccess_token() {
        return this.access_token;
    }

    public void setAccess_token(String str) {
        this.access_token = str;
    }

    public String getId_token() {
        return this.id_token;
    }

    public void setId_token(String str) {
        this.id_token = str;
    }
}
