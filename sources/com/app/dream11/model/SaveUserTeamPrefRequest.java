package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class SaveUserTeamPrefRequest extends CommonRequest {
    private String selectedPreference;
    private String teams;

    public SaveUserTeamPrefRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public void setTeams(String str) {
        this.teams = str;
    }

    public void setSelectedPreference(String str) {
        this.selectedPreference = str;
    }
}
