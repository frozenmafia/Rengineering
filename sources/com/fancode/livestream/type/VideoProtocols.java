package com.fancode.livestream.type;
/* loaded from: classes4.dex */
public enum VideoProtocols {
    HLS("HLS"),
    DASH("DASH"),
    $UNKNOWN("$UNKNOWN");
    
    private final String rawValue;

    VideoProtocols(String str) {
        this.rawValue = str;
    }

    public String rawValue() {
        return this.rawValue;
    }

    public static VideoProtocols safeValueOf(String str) {
        VideoProtocols[] values;
        for (VideoProtocols videoProtocols : values()) {
            if (videoProtocols.rawValue.equals(str)) {
                return videoProtocols;
            }
        }
        return $UNKNOWN;
    }
}
