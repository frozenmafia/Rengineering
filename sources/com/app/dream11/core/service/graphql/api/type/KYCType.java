package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum KYCType {
    AADHAAR("AADHAAR"),
    PAN("PAN"),
    BANK("BANK"),
    KYC("KYC"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    KYCType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final KYCType safeValueOf(String str) {
            KYCType kYCType;
            runAnimators.ag$a(str, "rawValue");
            KYCType[] values = KYCType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    kYCType = null;
                    break;
                }
                kYCType = values[i];
                if (runAnimators.values((Object) kYCType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return kYCType == null ? KYCType.UNKNOWN__ : kYCType;
        }
    }
}
