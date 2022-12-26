package com.fancode.payment.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class OrderStatus$ah$a {
    public /* synthetic */ OrderStatus$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private OrderStatus$ah$a() {
    }

    public final OrderStatus values(String str) {
        OrderStatus orderStatus;
        runAnimators.ag$a(str, "rawValue");
        OrderStatus[] values = OrderStatus.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                orderStatus = null;
                break;
            }
            orderStatus = values[i];
            if (runAnimators.values((Object) orderStatus.getRawValue(), (Object) str)) {
                break;
            }
            i++;
        }
        return orderStatus == null ? OrderStatus.UNKNOWN__ : orderStatus;
    }
}
