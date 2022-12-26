package com.fancode.payment.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onActivityPreCreated;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PaymentPriceInfoFragment$Companion$invoke$1$totalAmount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, onActivityPreCreated.values> {
    public static final PaymentPriceInfoFragment$Companion$invoke$1$totalAmount$1 INSTANCE = new PaymentPriceInfoFragment$Companion$invoke$1$totalAmount$1();

    PaymentPriceInfoFragment$Companion$invoke$1$totalAmount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final onActivityPreCreated.values invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return onActivityPreCreated.values.ag$a.ag$a(removecancellable);
    }
}
