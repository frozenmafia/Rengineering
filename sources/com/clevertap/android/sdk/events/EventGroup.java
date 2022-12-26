package com.clevertap.android.sdk.events;
/* loaded from: classes4.dex */
public enum EventGroup {
    REGULAR(""),
    PUSH_NOTIFICATION_VIEWED("-spiky");
    
    public final String httpResource;

    EventGroup(String str) {
        this.httpResource = str;
    }
}
