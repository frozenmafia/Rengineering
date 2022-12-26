package com.fancode.livestream.type;
/* loaded from: classes4.dex */
public enum MatchStatus {
    COMPLETED("COMPLETED"),
    LIVE("LIVE"),
    NOT_STARTED("NOT_STARTED"),
    ABANDONED("ABANDONED"),
    $UNKNOWN("$UNKNOWN");
    
    private final String rawValue;

    MatchStatus(String str) {
        this.rawValue = str;
    }

    public String rawValue() {
        return this.rawValue;
    }

    public static MatchStatus safeValueOf(String str) {
        MatchStatus[] values;
        for (MatchStatus matchStatus : values()) {
            if (matchStatus.rawValue.equals(str)) {
                return matchStatus;
            }
        }
        return $UNKNOWN;
    }
}
