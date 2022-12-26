package com.microsoft.fraudprotection.androidsdk;
/* loaded from: classes5.dex */
public enum AttributeType {
    DEVICE_SPECIFICATIONS("device"),
    USER_PREFERENCES("user_pref"),
    ACCELEROMETER("accelerometer"),
    GYROSCOPE("gyroscope"),
    LOCATION("location");
    
    private final String type;

    AttributeType(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }
}
