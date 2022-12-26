package com.fancode.livestream.type;
/* loaded from: classes4.dex */
public enum DRMSecurityLevel {
    LEVEL_1("LEVEL_1"),
    LEVEL_2("LEVEL_2"),
    LEVEL_3("LEVEL_3"),
    $UNKNOWN("$UNKNOWN");
    
    private final String rawValue;

    DRMSecurityLevel(String str) {
        this.rawValue = str;
    }

    public String rawValue() {
        return this.rawValue;
    }

    public static DRMSecurityLevel safeValueOf(String str) {
        DRMSecurityLevel[] values;
        for (DRMSecurityLevel dRMSecurityLevel : values()) {
            if (dRMSecurityLevel.rawValue.equals(str)) {
                return dRMSecurityLevel;
            }
        }
        return $UNKNOWN;
    }
}
