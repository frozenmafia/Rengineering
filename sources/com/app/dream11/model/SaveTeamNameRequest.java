package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes6.dex */
public class SaveTeamNameRequest extends CommonRequest {
    String teamName;

    public SaveTeamNameRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String str) {
        this.teamName = str;
    }
}
