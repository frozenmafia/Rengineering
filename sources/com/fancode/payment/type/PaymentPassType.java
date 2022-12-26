package com.fancode.payment.type;
/* loaded from: classes6.dex */
public enum PaymentPassType {
    ONE_TIME("ONE_TIME"),
    SUBSCRIPTION("SUBSCRIPTION"),
    SUBSCRIPTION_PRODUCT("SUBSCRIPTION_PRODUCT"),
    UNKNOWN__("UNKNOWN__");
    
    public static final PaymentPassType$ah$a Companion = new PaymentPassType$ah$a(null);
    private final String rawValue;

    PaymentPassType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
