package com.google.firebase.database.logging;
/* loaded from: classes5.dex */
public interface Logger {

    /* loaded from: classes5.dex */
    public enum Level {
        DEBUG,
        INFO,
        WARN,
        ERROR,
        NONE
    }

    Level valueOf();

    void valueOf(Level level, String str, String str2, long j);
}
