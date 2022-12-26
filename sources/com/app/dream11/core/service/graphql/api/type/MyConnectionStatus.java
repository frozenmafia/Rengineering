package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public enum MyConnectionStatus {
    FOLLOW("FOLLOW"),
    FOLLOWING("FOLLOWING"),
    NOT_CONNECTED("NOT_CONNECTED"),
    BOTH("BOTH"),
    BLOCK("BLOCK"),
    BLOCKED_BY("BLOCKED_BY"),
    CANT_FOLLOW("CANT_FOLLOW"),
    ERROR("ERROR"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    MyConnectionStatus(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final MyConnectionStatus safeValueOf(String str) {
            MyConnectionStatus myConnectionStatus;
            runAnimators.ag$a(str, "rawValue");
            MyConnectionStatus[] values = MyConnectionStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    myConnectionStatus = null;
                    break;
                }
                myConnectionStatus = values[i];
                if (runAnimators.values((Object) myConnectionStatus.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return myConnectionStatus == null ? MyConnectionStatus.UNKNOWN__ : myConnectionStatus;
        }
    }
}
