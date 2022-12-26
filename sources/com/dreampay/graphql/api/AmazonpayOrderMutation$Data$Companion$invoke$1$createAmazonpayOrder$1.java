package com.dreampay.graphql.api;

import com.dreampay.graphql.api.AmazonpayOrderMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AmazonpayOrderMutation$Data$Companion$invoke$1$createAmazonpayOrder$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, AmazonpayOrderMutation.CreateAmazonpayOrder> {
    public static final AmazonpayOrderMutation$Data$Companion$invoke$1$createAmazonpayOrder$1 INSTANCE = new AmazonpayOrderMutation$Data$Companion$invoke$1$createAmazonpayOrder$1();

    AmazonpayOrderMutation$Data$Companion$invoke$1$createAmazonpayOrder$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final AmazonpayOrderMutation.CreateAmazonpayOrder invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return AmazonpayOrderMutation.CreateAmazonpayOrder.Companion.invoke(removecancellable);
    }
}
