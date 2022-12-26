package com.app.dream11.model;
/* loaded from: classes3.dex */
public class ChatServiceCredentials {
    private String accessToken;
    private String userId;

    public ChatServiceCredentials(String str, String str2) {
        this.userId = str;
        this.accessToken = str2;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getAccessToken() {
        return this.accessToken;
    }
}
