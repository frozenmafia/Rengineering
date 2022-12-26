package com.dreampay.graphql.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public enum ConsentType {
    EXPLICIT("EXPLICIT"),
    IMPLICIT("IMPLICIT"),
    NONE("NONE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    ConsentType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final ConsentType safeValueOf(String str) {
            ConsentType consentType;
            runAnimators.ag$a(str, "rawValue");
            ConsentType[] values = ConsentType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    consentType = null;
                    break;
                }
                consentType = values[i];
                if (runAnimators.values((Object) consentType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return consentType == null ? ConsentType.UNKNOWN__ : consentType;
        }
    }
}
