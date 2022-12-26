package com.fancode.payment.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onActivityPostStarted;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PaymentPriceInfoFragment$Price$Fragments$Companion$invoke$1$amountFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, onActivityPostStarted> {
    public static final PaymentPriceInfoFragment$Price$Fragments$Companion$invoke$1$amountFragment$1 INSTANCE = new PaymentPriceInfoFragment$Price$Fragments$Companion$invoke$1$amountFragment$1();

    PaymentPriceInfoFragment$Price$Fragments$Companion$invoke$1$amountFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final onActivityPostStarted invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return onActivityPostStarted.values.valueOf(removecancellable);
    }
}
