package com.dreampay.graphql.type;

import com.dreampay.commons.constants.Constants;
import o.getTargetTypes;
/* loaded from: classes4.dex */
public enum PaymentInstrument {
    GPAY("GPAY"),
    PHONEPE("PHONEPE"),
    UPI_COLLECT(Constants.UPI_COLLECT_PAYMENT_INSTRUMENT),
    UPI_INTENT(Constants.UPI_INTENT_PAYMENT_INSTRUMENT),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    PaymentInstrument(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }
    }
}
