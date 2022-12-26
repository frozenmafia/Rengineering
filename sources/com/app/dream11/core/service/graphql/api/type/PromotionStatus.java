package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum PromotionStatus {
    ACTIVE("ACTIVE"),
    EXPIRED("EXPIRED"),
    CLAIMABLE("CLAIMABLE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    PromotionStatus(String str) {
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

        public final PromotionStatus safeValueOf(String str) {
            PromotionStatus promotionStatus;
            runAnimators.ag$a(str, "rawValue");
            PromotionStatus[] values = PromotionStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    promotionStatus = null;
                    break;
                }
                promotionStatus = values[i];
                if (runAnimators.values((Object) promotionStatus.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return promotionStatus == null ? PromotionStatus.UNKNOWN__ : promotionStatus;
        }
    }
}
