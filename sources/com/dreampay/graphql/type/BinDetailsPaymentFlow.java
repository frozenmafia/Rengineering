package com.dreampay.graphql.type;

import o.getTargetTypes;
/* loaded from: classes6.dex */
public enum BinDetailsPaymentFlow {
    NORMAL("normal"),
    MANAGE_PAYMENTS("manage_payments"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    BinDetailsPaymentFlow(String str) {
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
    }
}
