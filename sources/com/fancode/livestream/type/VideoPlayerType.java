package com.fancode.livestream.type;
/* loaded from: classes4.dex */
public enum VideoPlayerType {
    BRIGHTCOVE("BRIGHTCOVE"),
    FANCODE("FANCODE"),
    YOUTUBE("YOUTUBE"),
    $UNKNOWN("$UNKNOWN");
    
    private final String rawValue;

    VideoPlayerType(String str) {
        this.rawValue = str;
    }

    public String rawValue() {
        return this.rawValue;
    }

    public static VideoPlayerType safeValueOf(String str) {
        VideoPlayerType[] values;
        for (VideoPlayerType videoPlayerType : values()) {
            if (videoPlayerType.rawValue.equals(str)) {
                return videoPlayerType;
            }
        }
        return $UNKNOWN;
    }
}
