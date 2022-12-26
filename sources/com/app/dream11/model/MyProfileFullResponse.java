package com.app.dream11.model;
/* loaded from: classes6.dex */
public class MyProfileFullResponse {
    private String preferredTeams;
    private QuickCheckResponse regionInfo;
    private UserAttributes userAttributes;
    private UserInfo userDetails;

    public QuickCheckResponse getRegionInfo() {
        return this.regionInfo;
    }

    public void setRegionInfo(QuickCheckResponse quickCheckResponse) {
        this.regionInfo = quickCheckResponse;
    }

    public UserAttributes getUserAttributes() {
        return this.userAttributes;
    }

    public void setUserAttributes(UserAttributes userAttributes) {
        this.userAttributes = userAttributes;
    }

    public UserInfo getUserDetails() {
        return this.userDetails;
    }

    public String getPreferredTeams() {
        return this.preferredTeams;
    }

    public void setPreferredTeams(String str) {
        this.preferredTeams = str;
    }
}
