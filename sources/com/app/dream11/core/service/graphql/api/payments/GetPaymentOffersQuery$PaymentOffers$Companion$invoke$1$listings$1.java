package com.app.dream11.core.service.graphql.api.payments;

import com.app.dream11.core.service.graphql.api.payments.GetPaymentOffersQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetPaymentOffersQuery$PaymentOffers$Companion$invoke$1$listings$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetPaymentOffersQuery.Listing> {
    public static final GetPaymentOffersQuery$PaymentOffers$Companion$invoke$1$listings$1 INSTANCE = new GetPaymentOffersQuery$PaymentOffers$Companion$invoke$1$listings$1();

    GetPaymentOffersQuery$PaymentOffers$Companion$invoke$1$listings$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.payments.GetPaymentOffersQuery$PaymentOffers$Companion$invoke$1$listings$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetPaymentOffersQuery.Listing> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetPaymentOffersQuery.Listing invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetPaymentOffersQuery.Listing.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetPaymentOffersQuery.Listing invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetPaymentOffersQuery.Listing) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
