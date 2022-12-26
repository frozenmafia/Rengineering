package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.DepositOffersQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DepositOffersQuery$Data$Companion$invoke$1$depositOffers$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, DepositOffersQuery.DepositOffer> {
    public static final DepositOffersQuery$Data$Companion$invoke$1$depositOffers$1 INSTANCE = new DepositOffersQuery$Data$Companion$invoke$1$depositOffers$1();

    DepositOffersQuery$Data$Companion$invoke$1$depositOffers$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.DepositOffersQuery$Data$Companion$invoke$1$depositOffers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DepositOffersQuery.DepositOffer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final DepositOffersQuery.DepositOffer invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return DepositOffersQuery.DepositOffer.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final DepositOffersQuery.DepositOffer invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (DepositOffersQuery.DepositOffer) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
