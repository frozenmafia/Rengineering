package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class EmailLoginRequest extends BaseCampaignRequest {
    private String email;
    private String password;

    public EmailLoginRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider, String str, String str2) {
        super(onactionviewexpanded, iEventDataProvider, true);
        this.email = str;
        this.password = str2;
    }

    public EmailLoginRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider, String str) {
        this(onactionviewexpanded, iEventDataProvider, str, "");
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }
}
