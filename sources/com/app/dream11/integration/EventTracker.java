package com.app.dream11.integration;
/* loaded from: classes.dex */
public enum EventTracker {
    APPSFLYER,
    FIREBASE_CRASHLYTICS,
    CLEVERTAP,
    FIREBASE,
    APXOR,
    IN_HOUSE("in_house_analytics_enabled"),
    BUGSNAG;
    
    public String featureFlag;

    EventTracker(String str) {
        this.featureFlag = str;
    }
}
