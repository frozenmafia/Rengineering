package com.fancode.payment.type;

import com.dreampay.commons.constants.Constants;
/* loaded from: classes4.dex */
public enum OrderStatus {
    PENDING("PENDING"),
    SUCCESS(Constants.Upi.PHONEPE_SUCCESS),
    FAILED("FAILED"),
    REFUND_INITIATED("REFUND_INITIATED"),
    REFUNDED("REFUNDED"),
    REFUND_FAILED("REFUND_FAILED"),
    UNKNOWN__("UNKNOWN__");
    
    public static final OrderStatus$ah$a Companion = new OrderStatus$ah$a(null);
    private final String rawValue;

    OrderStatus(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
