package com.app.dream11.core.service.graphql.api.tier;

import com.app.dream11.core.service.graphql.api.tier.TierDataQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TierDataQuery$Tier$Companion$invoke$1$tierBenefits$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, TierDataQuery.TierBenefit> {
    public static final TierDataQuery$Tier$Companion$invoke$1$tierBenefits$1 INSTANCE = new TierDataQuery$Tier$Companion$invoke$1$tierBenefits$1();

    TierDataQuery$Tier$Companion$invoke$1$tierBenefits$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.tier.TierDataQuery$Tier$Companion$invoke$1$tierBenefits$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TierDataQuery.TierBenefit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final TierDataQuery.TierBenefit invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return TierDataQuery.TierBenefit.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final TierDataQuery.TierBenefit invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (TierDataQuery.TierBenefit) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
