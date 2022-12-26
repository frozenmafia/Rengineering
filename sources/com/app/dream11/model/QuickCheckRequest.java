package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes6.dex */
public class QuickCheckRequest extends CommonRequest {
    private String dob;
    private String stateId;

    public QuickCheckRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String str) {
        this.dob = str;
    }

    public String getStateId() {
        return this.stateId;
    }

    public void setStateId(String str) {
        this.stateId = str;
    }
}
