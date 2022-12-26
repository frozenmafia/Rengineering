package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class PanRequest extends CommonRequest {
    private String DateOfBirth;
    private String PanNumber;
    private String State;
    private String UserFullName;

    public PanRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public void setUserFullName(String str) {
        this.UserFullName = str;
    }

    public void setPanNumber(String str) {
        this.PanNumber = str;
    }

    public void setDateOfBirth(String str) {
        this.DateOfBirth = str;
    }

    public void setState(String str) {
        this.State = str;
    }
}
