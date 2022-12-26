package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum VerificationOption {
    VPA("VPA"),
    BANK("BANK"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    VerificationOption(String str) {
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

        public final VerificationOption safeValueOf(String str) {
            VerificationOption verificationOption;
            runAnimators.ag$a(str, "rawValue");
            VerificationOption[] values = VerificationOption.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    verificationOption = null;
                    break;
                }
                verificationOption = values[i];
                if (runAnimators.values((Object) verificationOption.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return verificationOption == null ? VerificationOption.UNKNOWN__ : verificationOption;
        }
    }
}
