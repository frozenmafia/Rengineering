package com.fancode.livestream.type;
/* loaded from: classes4.dex */
public enum DRMType {
    WIDEVINE("WIDEVINE"),
    PLAYREADY("PLAYREADY"),
    FAIRPLAY("FAIRPLAY"),
    $UNKNOWN("$UNKNOWN");
    
    private final String rawValue;

    DRMType(String str) {
        this.rawValue = str;
    }

    public String rawValue() {
        return this.rawValue;
    }

    public static DRMType safeValueOf(String str) {
        DRMType[] values;
        for (DRMType dRMType : values()) {
            if (dRMType.rawValue.equals(str)) {
                return dRMType;
            }
        }
        return $UNKNOWN;
    }
}
