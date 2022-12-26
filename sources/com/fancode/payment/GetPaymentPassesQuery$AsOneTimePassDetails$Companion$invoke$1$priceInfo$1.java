package com.fancode.payment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class GetPaymentPassesQuery$AsOneTimePassDetails$Companion$invoke$1$priceInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetPaymentPassesQuery$HaptikSDK$c> {
    public static final GetPaymentPassesQuery$AsOneTimePassDetails$Companion$invoke$1$priceInfo$1 INSTANCE = new GetPaymentPassesQuery$AsOneTimePassDetails$Companion$invoke$1$priceInfo$1();

    GetPaymentPassesQuery$AsOneTimePassDetails$Companion$invoke$1$priceInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetPaymentPassesQuery$HaptikSDK$c invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetPaymentPassesQuery$HaptikSDK$c.valueOf.valueOf(removecancellable);
    }
}
