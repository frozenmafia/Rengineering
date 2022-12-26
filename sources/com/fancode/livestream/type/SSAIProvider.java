package com.fancode.livestream.type;
/* loaded from: classes4.dex */
public enum SSAIProvider {
    NONE("NONE"),
    YOSPACE("YOSPACE"),
    MEDIA_TAILOR("MEDIA_TAILOR"),
    DAI("DAI"),
    $UNKNOWN("$UNKNOWN");
    
    private final String rawValue;

    SSAIProvider(String str) {
        this.rawValue = str;
    }

    public String rawValue() {
        return this.rawValue;
    }

    public static SSAIProvider safeValueOf(String str) {
        SSAIProvider[] values;
        for (SSAIProvider sSAIProvider : values()) {
            if (sSAIProvider.rawValue.equals(str)) {
                return sSAIProvider;
            }
        }
        return $UNKNOWN;
    }
}
