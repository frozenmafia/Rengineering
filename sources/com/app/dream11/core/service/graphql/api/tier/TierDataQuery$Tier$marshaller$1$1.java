package com.app.dream11.core.service.graphql.api.tier;

import com.app.dream11.core.service.graphql.api.tier.TierDataQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class TierDataQuery$Tier$marshaller$1$1 extends Lambda implements Transition<List<? extends TierDataQuery.TierBenefit>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final TierDataQuery$Tier$marshaller$1$1 INSTANCE = new TierDataQuery$Tier$marshaller$1$1();

    TierDataQuery$Tier$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends TierDataQuery.TierBenefit> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<TierDataQuery.TierBenefit>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<TierDataQuery.TierBenefit> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (TierDataQuery.TierBenefit tierBenefit : list) {
            valueof.values(tierBenefit.marshaller());
        }
    }
}
