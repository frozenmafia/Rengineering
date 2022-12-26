package com.fancode.payment.type;

import o.getTargetTypes;
/* loaded from: classes6.dex */
public enum PaymentEntityType {
    FRH("FRH"),
    ARTICLE("ARTICLE"),
    MATCH("MATCH"),
    PAGE("PAGE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final valueOf Companion = new valueOf(null);
    private final String rawValue;

    PaymentEntityType(String str) {
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
    }
}
