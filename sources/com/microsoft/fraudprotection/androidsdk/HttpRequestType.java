package com.microsoft.fraudprotection.androidsdk;
/* loaded from: classes5.dex */
public enum HttpRequestType {
    GET("GET"),
    POST("POST");
    
    private final String type;

    HttpRequestType(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }
}
