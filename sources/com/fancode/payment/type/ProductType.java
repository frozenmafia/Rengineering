package com.fancode.payment.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum ProductType {
    MATCH_PASS("MATCH_PASS"),
    TOUR_PASS("TOUR_PASS"),
    FANTASY_MATCH_PASS("FANTASY_MATCH_PASS"),
    FANTASY_TOUR_PASS("FANTASY_TOUR_PASS"),
    SUBSCRIPTION_PASS("SUBSCRIPTION_PASS"),
    UNKNOWN__("UNKNOWN__");
    
    public static final toString Companion = new toString(null);
    private final String rawValue;

    ProductType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes6.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }

        public final ProductType ag$a(String str) {
            ProductType productType;
            runAnimators.ag$a(str, "rawValue");
            ProductType[] values = ProductType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    productType = null;
                    break;
                }
                productType = values[i];
                if (runAnimators.values((Object) productType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return productType == null ? ProductType.UNKNOWN__ : productType;
        }
    }
}
