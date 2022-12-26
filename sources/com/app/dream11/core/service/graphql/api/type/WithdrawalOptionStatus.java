package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum WithdrawalOptionStatus {
    VERIFIED("VERIFIED"),
    IN_REVIEW("IN_REVIEW"),
    FAILED("FAILED"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    WithdrawalOptionStatus(String str) {
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

        public final WithdrawalOptionStatus safeValueOf(String str) {
            WithdrawalOptionStatus withdrawalOptionStatus;
            runAnimators.ag$a(str, "rawValue");
            WithdrawalOptionStatus[] values = WithdrawalOptionStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    withdrawalOptionStatus = null;
                    break;
                }
                withdrawalOptionStatus = values[i];
                if (runAnimators.values((Object) withdrawalOptionStatus.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return withdrawalOptionStatus == null ? WithdrawalOptionStatus.UNKNOWN__ : withdrawalOptionStatus;
        }
    }
}
