package com.fancode.livestream.type;
/* loaded from: classes4.dex */
public enum MatchFormat {
    T20("T20"),
    ODI("ODI"),
    T20I("T20I"),
    TEST("TEST"),
    T10("T10"),
    HUNDRED("HUNDRED"),
    HUN("HUN"),
    THEHUNDRED("THEHUNDRED"),
    $UNKNOWN("$UNKNOWN");
    
    private final String rawValue;

    MatchFormat(String str) {
        this.rawValue = str;
    }

    public String rawValue() {
        return this.rawValue;
    }

    public static MatchFormat safeValueOf(String str) {
        MatchFormat[] values;
        for (MatchFormat matchFormat : values()) {
            if (matchFormat.rawValue.equals(str)) {
                return matchFormat;
            }
        }
        return $UNKNOWN;
    }
}
