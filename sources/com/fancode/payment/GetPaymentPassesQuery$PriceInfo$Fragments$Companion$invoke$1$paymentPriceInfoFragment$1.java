package com.fancode.payment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onActivityPreCreated;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetPaymentPassesQuery$PriceInfo$Fragments$Companion$invoke$1$paymentPriceInfoFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, onActivityPreCreated> {
    public static final GetPaymentPassesQuery$PriceInfo$Fragments$Companion$invoke$1$paymentPriceInfoFragment$1 INSTANCE = new GetPaymentPassesQuery$PriceInfo$Fragments$Companion$invoke$1$paymentPriceInfoFragment$1();

    GetPaymentPassesQuery$PriceInfo$Fragments$Companion$invoke$1$paymentPriceInfoFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final onActivityPreCreated invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return onActivityPreCreated.toString.valueOf(removecancellable);
    }
}
