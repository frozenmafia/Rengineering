package com.sendbird.android;
/* loaded from: classes.dex */
public enum LogLevel {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6);
    
    int order;

    LogLevel(int i) {
        this.order = i;
    }
}
