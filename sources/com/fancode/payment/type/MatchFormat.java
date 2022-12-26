package com.fancode.payment.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum MatchFormat {
    T20("T20"),
    ODI("ODI"),
    T20I("T20I"),
    TEST("TEST"),
    T10("T10"),
    HUNDRED("HUNDRED"),
    HUN("HUN"),
    UNKNOWN__("UNKNOWN__");
    
    public static final valueOf Companion = new valueOf(null);
    private final String rawValue;

    MatchFormat(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes6.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }

        public final MatchFormat valueOf(String str) {
            MatchFormat matchFormat;
            runAnimators.ag$a(str, "rawValue");
            MatchFormat[] values = MatchFormat.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    matchFormat = null;
                    break;
                }
                matchFormat = values[i];
                if (runAnimators.values((Object) matchFormat.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return matchFormat == null ? MatchFormat.UNKNOWN__ : matchFormat;
        }
    }
}
