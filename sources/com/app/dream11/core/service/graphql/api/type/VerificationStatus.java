package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum VerificationStatus {
    VERIFIED("VERIFIED"),
    IN_PROGRESS("IN_PROGRESS"),
    NOT_VERIFIED("NOT_VERIFIED"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    VerificationStatus(String str) {
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

        public final VerificationStatus safeValueOf(String str) {
            VerificationStatus verificationStatus;
            runAnimators.ag$a(str, "rawValue");
            VerificationStatus[] values = VerificationStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    verificationStatus = null;
                    break;
                }
                verificationStatus = values[i];
                if (runAnimators.values((Object) verificationStatus.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return verificationStatus == null ? VerificationStatus.UNKNOWN__ : verificationStatus;
        }
    }
}
