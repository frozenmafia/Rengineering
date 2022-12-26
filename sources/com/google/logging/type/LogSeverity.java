package com.google.logging.type;

import o.ViewInfoStore;
import o.ViewInfoStore$ag$a;
import o.ViewInfoStore$ah$a;
/* loaded from: classes7.dex */
public enum LogSeverity implements ViewInfoStore$ah$a {
    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(300),
    WARNING(400),
    ERROR(500),
    CRITICAL(CRITICAL_VALUE),
    ALERT(ALERT_VALUE),
    EMERGENCY(EMERGENCY_VALUE),
    UNRECOGNIZED(-1);
    
    public static final int ALERT_VALUE = 700;
    public static final int CRITICAL_VALUE = 600;
    public static final int DEBUG_VALUE = 100;
    public static final int DEFAULT_VALUE = 0;
    public static final int EMERGENCY_VALUE = 800;
    public static final int ERROR_VALUE = 500;
    public static final int INFO_VALUE = 200;
    public static final int NOTICE_VALUE = 300;
    public static final int WARNING_VALUE = 400;
    private static final ViewInfoStore.values<LogSeverity> internalValueMap = new ViewInfoStore.values<LogSeverity>() { // from class: com.google.logging.type.LogSeverity.2
        @Override // o.ViewInfoStore.values
        /* renamed from: valueOf */
        public LogSeverity ag$a(int i) {
            return LogSeverity.forNumber(i);
        }
    };
    private final int value;

    @Override // o.ViewInfoStore$ah$a
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static LogSeverity valueOf(int i) {
        return forNumber(i);
    }

    public static LogSeverity forNumber(int i) {
        if (i != 0) {
            if (i != 100) {
                if (i != 200) {
                    if (i != 300) {
                        if (i != 400) {
                            if (i != 500) {
                                if (i != 600) {
                                    if (i != 700) {
                                        if (i != 800) {
                                            return null;
                                        }
                                        return EMERGENCY;
                                    }
                                    return ALERT;
                                }
                                return CRITICAL;
                            }
                            return ERROR;
                        }
                        return WARNING;
                    }
                    return NOTICE;
                }
                return INFO;
            }
            return DEBUG;
        }
        return DEFAULT;
    }

    public static ViewInfoStore.values<LogSeverity> internalGetValueMap() {
        return internalValueMap;
    }

    public static ViewInfoStore$ag$a internalGetVerifier() {
        return LogSeverity$ah$a.toString;
    }

    LogSeverity(int i) {
        this.value = i;
    }
}
