package com.fancode.livestream.type;
/* loaded from: classes4.dex */
public enum DAISDKType {
    IMA_DAI_CORE("IMA_DAI_CORE"),
    IMA_DAI_EXTENSION("IMA_DAI_EXTENSION"),
    PAL_SDK("PAL_SDK"),
    NO_SDK("NO_SDK"),
    $UNKNOWN("$UNKNOWN");
    
    private final String rawValue;

    DAISDKType(String str) {
        this.rawValue = str;
    }

    public String rawValue() {
        return this.rawValue;
    }

    public static DAISDKType safeValueOf(String str) {
        DAISDKType[] values;
        for (DAISDKType dAISDKType : values()) {
            if (dAISDKType.rawValue.equals(str)) {
                return dAISDKType;
            }
        }
        return $UNKNOWN;
    }
}
