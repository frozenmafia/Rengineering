package com.dreampay.graphql.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum BankType {
    POPULAR("POPULAR"),
    OTHERS("OTHERS"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    BankType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final BankType safeValueOf(String str) {
            BankType bankType;
            runAnimators.ag$a(str, "rawValue");
            BankType[] values = BankType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bankType = null;
                    break;
                }
                bankType = values[i];
                if (runAnimators.values((Object) bankType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return bankType == null ? BankType.UNKNOWN__ : bankType;
        }
    }
}
