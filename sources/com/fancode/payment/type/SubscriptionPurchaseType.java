package com.fancode.payment.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum SubscriptionPurchaseType {
    SUBSCRIPTION("SUBSCRIPTION"),
    SUBSCRIPTION_PRODUCT("SUBSCRIPTION_PRODUCT"),
    UNKNOWN__("UNKNOWN__");
    
    public static final valueOf Companion = new valueOf(null);
    private final String rawValue;

    SubscriptionPurchaseType(String str) {
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

        public final SubscriptionPurchaseType valueOf(String str) {
            SubscriptionPurchaseType subscriptionPurchaseType;
            runAnimators.ag$a(str, "rawValue");
            SubscriptionPurchaseType[] values = SubscriptionPurchaseType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    subscriptionPurchaseType = null;
                    break;
                }
                subscriptionPurchaseType = values[i];
                if (runAnimators.values((Object) subscriptionPurchaseType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return subscriptionPurchaseType == null ? SubscriptionPurchaseType.UNKNOWN__ : subscriptionPurchaseType;
        }
    }
}
