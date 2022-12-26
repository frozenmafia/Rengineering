package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum DepositListingType {
    WALLET_SECTION("WALLET_SECTION"),
    NETBANKING_SECTION("NETBANKING_SECTION"),
    MANAGE_PAYMENT("MANAGE_PAYMENT"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    DepositListingType(String str) {
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

        public final DepositListingType safeValueOf(String str) {
            DepositListingType depositListingType;
            runAnimators.ag$a(str, "rawValue");
            DepositListingType[] values = DepositListingType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    depositListingType = null;
                    break;
                }
                depositListingType = values[i];
                if (runAnimators.values((Object) depositListingType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return depositListingType == null ? DepositListingType.UNKNOWN__ : depositListingType;
        }
    }
}
