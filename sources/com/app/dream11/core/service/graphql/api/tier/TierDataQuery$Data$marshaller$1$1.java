package com.app.dream11.core.service.graphql.api.tier;

import com.app.dream11.core.service.graphql.api.tier.TierDataQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class TierDataQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends TierDataQuery.Tier>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final TierDataQuery$Data$marshaller$1$1 INSTANCE = new TierDataQuery$Data$marshaller$1$1();

    TierDataQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends TierDataQuery.Tier> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<TierDataQuery.Tier>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<TierDataQuery.Tier> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (TierDataQuery.Tier tier : list) {
            valueof.values(tier == null ? null : tier.marshaller());
        }
    }
}
