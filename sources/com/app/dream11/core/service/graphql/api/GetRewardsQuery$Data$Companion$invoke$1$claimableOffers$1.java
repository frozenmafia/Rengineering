package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetRewardsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetRewardsQuery$Data$Companion$invoke$1$claimableOffers$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetRewardsQuery.ClaimableOffer> {
    public static final GetRewardsQuery$Data$Companion$invoke$1$claimableOffers$1 INSTANCE = new GetRewardsQuery$Data$Companion$invoke$1$claimableOffers$1();

    GetRewardsQuery$Data$Companion$invoke$1$claimableOffers$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.GetRewardsQuery$Data$Companion$invoke$1$claimableOffers$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetRewardsQuery.ClaimableOffer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetRewardsQuery.ClaimableOffer invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetRewardsQuery.ClaimableOffer.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetRewardsQuery.ClaimableOffer invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetRewardsQuery.ClaimableOffer) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
