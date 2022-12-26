package com.fancode.video.models;
/* loaded from: classes4.dex */
public enum VideoHostType {
    MOBILE("mobile"),
    FireTV("firetv"),
    ChromeCast("chromecast");
    
    private String hostType;

    VideoHostType(String str) {
        this.hostType = "";
        this.hostType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.hostType;
    }

    public static VideoHostType create(String str) {
        VideoHostType videoHostType = MOBILE;
        if ("firetv".equalsIgnoreCase(str)) {
            return FireTV;
        }
        return "chromecast".equalsIgnoreCase(str) ? ChromeCast : videoHostType;
    }
}
