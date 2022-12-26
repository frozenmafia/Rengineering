package com.fancode.payment.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PaymentPassType$ah$a {
    public /* synthetic */ PaymentPassType$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private PaymentPassType$ah$a() {
    }

    public final PaymentPassType values(String str) {
        PaymentPassType paymentPassType;
        runAnimators.ag$a(str, "rawValue");
        PaymentPassType[] values = PaymentPassType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                paymentPassType = null;
                break;
            }
            paymentPassType = values[i];
            if (runAnimators.values((Object) paymentPassType.getRawValue(), (Object) str)) {
                break;
            }
            i++;
        }
        return paymentPassType == null ? PaymentPassType.UNKNOWN__ : paymentPassType;
    }
}
