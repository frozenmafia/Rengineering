package com.fancode.payment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetPaymentPassesQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetPaymentPassesQuery$HaptikSDK$a> {
    public static final GetPaymentPassesQuery$Data$Companion$invoke$1$match$1 INSTANCE = new GetPaymentPassesQuery$Data$Companion$invoke$1$match$1();

    GetPaymentPassesQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetPaymentPassesQuery$HaptikSDK$a invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetPaymentPassesQuery$HaptikSDK$a.valueOf.toString(removecancellable);
    }
}
