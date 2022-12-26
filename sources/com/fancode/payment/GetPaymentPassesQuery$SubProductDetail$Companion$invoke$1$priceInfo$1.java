package com.fancode.payment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class GetPaymentPassesQuery$SubProductDetail$Companion$invoke$1$priceInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetPaymentPassesQuery$HaptikSDK$b> {
    public static final GetPaymentPassesQuery$SubProductDetail$Companion$invoke$1$priceInfo$1 INSTANCE = new GetPaymentPassesQuery$SubProductDetail$Companion$invoke$1$priceInfo$1();

    GetPaymentPassesQuery$SubProductDetail$Companion$invoke$1$priceInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetPaymentPassesQuery$HaptikSDK$b invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetPaymentPassesQuery$HaptikSDK$b.valueOf.ah$a(removecancellable);
    }
}
