package com.fancode.video.models;
/* loaded from: classes4.dex */
public enum PlayerType {
    FANCODE("FANCODE", "com.fancode/exoplayer", "https://ma1442-r.analytics.edgekey.net/config/beacon-25672.xml");
    
    private final String akamaiId;
    private final String akamaiUrl;
    private final String name;

    PlayerType(String str, String str2, String str3) {
        this.name = str;
        this.akamaiId = str2;
        this.akamaiUrl = str3;
    }

    public String getAkamaiUrl() {
        return this.akamaiUrl;
    }

    public String getAkamaiId() {
        return this.akamaiId;
    }

    public static PlayerType fromValue(String str) {
        return FANCODE;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
