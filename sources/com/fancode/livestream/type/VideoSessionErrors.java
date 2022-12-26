package com.fancode.livestream.type;
/* loaded from: classes4.dex */
public enum VideoSessionErrors {
    TOO_MANY_SESSIONS("TOO_MANY_SESSIONS"),
    $UNKNOWN("$UNKNOWN");
    
    private final String rawValue;

    VideoSessionErrors(String str) {
        this.rawValue = str;
    }

    public String rawValue() {
        return this.rawValue;
    }

    public static VideoSessionErrors safeValueOf(String str) {
        VideoSessionErrors[] values;
        for (VideoSessionErrors videoSessionErrors : values()) {
            if (videoSessionErrors.rawValue.equals(str)) {
                return videoSessionErrors;
            }
        }
        return $UNKNOWN;
    }
}
