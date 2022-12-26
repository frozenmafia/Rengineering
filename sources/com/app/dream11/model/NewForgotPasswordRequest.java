package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class NewForgotPasswordRequest extends BaseRequest {
    private String email;
    private Boolean force;
    private String wlsSlug;

    public NewForgotPasswordRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider, String str) {
        super(onactionviewexpanded, iEventDataProvider);
        this.email = str;
        this.force = true;
    }

    public Boolean getForce() {
        return this.force;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setForce(Boolean bool) {
        this.force = bool;
    }

    public String getWlsSlug() {
        return this.wlsSlug;
    }

    public void setWlsSlug(String str) {
        this.wlsSlug = str;
    }
}
