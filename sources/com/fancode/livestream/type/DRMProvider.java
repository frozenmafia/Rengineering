package com.fancode.livestream.type;
/* loaded from: classes4.dex */
public enum DRMProvider {
    NONE("NONE"),
    INTER_TRUST("INTER_TRUST"),
    NAGRA("NAGRA"),
    $UNKNOWN("$UNKNOWN");
    
    private final String rawValue;

    DRMProvider(String str) {
        this.rawValue = str;
    }

    public String rawValue() {
        return this.rawValue;
    }

    public static DRMProvider safeValueOf(String str) {
        DRMProvider[] values;
        for (DRMProvider dRMProvider : values()) {
            if (dRMProvider.rawValue.equals(str)) {
                return dRMProvider;
            }
        }
        return $UNKNOWN;
    }
}
