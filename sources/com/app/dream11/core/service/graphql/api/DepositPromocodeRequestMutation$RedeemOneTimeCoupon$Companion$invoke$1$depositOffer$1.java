package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.DepositPromocodeRequestMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DepositPromocodeRequestMutation$RedeemOneTimeCoupon$Companion$invoke$1$depositOffer$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DepositPromocodeRequestMutation.DepositOffer> {
    public static final DepositPromocodeRequestMutation$RedeemOneTimeCoupon$Companion$invoke$1$depositOffer$1 INSTANCE = new DepositPromocodeRequestMutation$RedeemOneTimeCoupon$Companion$invoke$1$depositOffer$1();

    DepositPromocodeRequestMutation$RedeemOneTimeCoupon$Companion$invoke$1$depositOffer$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final DepositPromocodeRequestMutation.DepositOffer invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return DepositPromocodeRequestMutation.DepositOffer.Companion.invoke(removecancellable);
    }
}
