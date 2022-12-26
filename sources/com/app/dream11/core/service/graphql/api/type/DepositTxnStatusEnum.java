package com.app.dream11.core.service.graphql.api.type;

import com.dreampay.commons.constants.Constants;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum DepositTxnStatusEnum {
    FAILED("FAILED"),
    PENDING("PENDING"),
    SUCCESS(Constants.Upi.PHONEPE_SUCCESS),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    DepositTxnStatusEnum(String str) {
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

        public final DepositTxnStatusEnum safeValueOf(String str) {
            DepositTxnStatusEnum depositTxnStatusEnum;
            runAnimators.ag$a(str, "rawValue");
            DepositTxnStatusEnum[] values = DepositTxnStatusEnum.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    depositTxnStatusEnum = null;
                    break;
                }
                depositTxnStatusEnum = values[i];
                if (runAnimators.values((Object) depositTxnStatusEnum.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return depositTxnStatusEnum == null ? DepositTxnStatusEnum.UNKNOWN__ : depositTxnStatusEnum;
        }
    }
}
