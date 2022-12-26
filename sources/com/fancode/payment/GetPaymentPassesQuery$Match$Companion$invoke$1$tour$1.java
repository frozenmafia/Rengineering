package com.fancode.payment;

import com.fancode.payment.GetPaymentPassesQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class GetPaymentPassesQuery$Match$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetPaymentPassesQuery.HaptikWebView> {
    public static final GetPaymentPassesQuery$Match$Companion$invoke$1$tour$1 INSTANCE = new GetPaymentPassesQuery$Match$Companion$invoke$1$tour$1();

    GetPaymentPassesQuery$Match$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetPaymentPassesQuery.HaptikWebView invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetPaymentPassesQuery.HaptikWebView.valueOf.ag$a(removecancellable);
    }
}
