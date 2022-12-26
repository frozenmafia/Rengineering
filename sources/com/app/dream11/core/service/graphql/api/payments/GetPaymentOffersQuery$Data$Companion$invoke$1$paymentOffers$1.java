package com.app.dream11.core.service.graphql.api.payments;

import com.app.dream11.core.service.graphql.api.payments.GetPaymentOffersQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetPaymentOffersQuery$Data$Companion$invoke$1$paymentOffers$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetPaymentOffersQuery.PaymentOffers> {
    public static final GetPaymentOffersQuery$Data$Companion$invoke$1$paymentOffers$1 INSTANCE = new GetPaymentOffersQuery$Data$Companion$invoke$1$paymentOffers$1();

    GetPaymentOffersQuery$Data$Companion$invoke$1$paymentOffers$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetPaymentOffersQuery.PaymentOffers invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetPaymentOffersQuery.PaymentOffers.Companion.invoke(removecancellable);
    }
}
