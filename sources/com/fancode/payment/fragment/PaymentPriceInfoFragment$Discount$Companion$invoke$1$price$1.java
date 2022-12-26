package com.fancode.payment.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onActivityPreCreated;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PaymentPriceInfoFragment$Discount$Companion$invoke$1$price$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, onActivityPreCreated.valueOf> {
    public static final PaymentPriceInfoFragment$Discount$Companion$invoke$1$price$1 INSTANCE = new PaymentPriceInfoFragment$Discount$Companion$invoke$1$price$1();

    PaymentPriceInfoFragment$Discount$Companion$invoke$1$price$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final onActivityPreCreated.valueOf invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return onActivityPreCreated.valueOf.ag$a.values(removecancellable);
    }
}
