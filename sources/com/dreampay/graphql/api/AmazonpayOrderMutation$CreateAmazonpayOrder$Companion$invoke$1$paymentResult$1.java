package com.dreampay.graphql.api;

import com.dreampay.graphql.api.AmazonpayOrderMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AmazonpayOrderMutation$CreateAmazonpayOrder$Companion$invoke$1$paymentResult$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, AmazonpayOrderMutation.PaymentResult> {
    public static final AmazonpayOrderMutation$CreateAmazonpayOrder$Companion$invoke$1$paymentResult$1 INSTANCE = new AmazonpayOrderMutation$CreateAmazonpayOrder$Companion$invoke$1$paymentResult$1();

    AmazonpayOrderMutation$CreateAmazonpayOrder$Companion$invoke$1$paymentResult$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final AmazonpayOrderMutation.PaymentResult invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return AmazonpayOrderMutation.PaymentResult.Companion.invoke(removecancellable);
    }
}
