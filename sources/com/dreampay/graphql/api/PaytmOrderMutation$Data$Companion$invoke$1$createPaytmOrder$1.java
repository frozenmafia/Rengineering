package com.dreampay.graphql.api;

import com.dreampay.graphql.api.PaytmOrderMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class PaytmOrderMutation$Data$Companion$invoke$1$createPaytmOrder$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PaytmOrderMutation.CreatePaytmOrder> {
    public static final PaytmOrderMutation$Data$Companion$invoke$1$createPaytmOrder$1 INSTANCE = new PaytmOrderMutation$Data$Companion$invoke$1$createPaytmOrder$1();

    PaytmOrderMutation$Data$Companion$invoke$1$createPaytmOrder$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PaytmOrderMutation.CreatePaytmOrder invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PaytmOrderMutation.CreatePaytmOrder.Companion.invoke(removecancellable);
    }
}
