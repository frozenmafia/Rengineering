package com.fancode.payment.type;
/* loaded from: classes6.dex */
public enum MatchStatus {
    COMPLETED("COMPLETED"),
    LIVE("LIVE"),
    NOT_STARTED("NOT_STARTED"),
    ABANDONED("ABANDONED"),
    UNKNOWN__("UNKNOWN__");
    
    public static final MatchStatus$ah$a Companion = new MatchStatus$ah$a(null);
    private final String rawValue;

    MatchStatus(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
