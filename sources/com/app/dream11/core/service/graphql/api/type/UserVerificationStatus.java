package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum UserVerificationStatus {
    NOT_SUBMITTED("NOT_SUBMITTED"),
    VERIFIED("VERIFIED"),
    REJECTED("REJECTED"),
    INREVIEW("INREVIEW"),
    UNLINKED("UNLINKED"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    UserVerificationStatus(String str) {
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

        public final UserVerificationStatus safeValueOf(String str) {
            UserVerificationStatus userVerificationStatus;
            runAnimators.ag$a(str, "rawValue");
            UserVerificationStatus[] values = UserVerificationStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    userVerificationStatus = null;
                    break;
                }
                userVerificationStatus = values[i];
                if (runAnimators.values((Object) userVerificationStatus.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return userVerificationStatus == null ? UserVerificationStatus.UNKNOWN__ : userVerificationStatus;
        }
    }
}
