package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetRewardsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GetRewardsQuery$Data$marshaller$1$2 extends Lambda implements Transition<List<? extends GetRewardsQuery.ClaimableOffer>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetRewardsQuery$Data$marshaller$1$2 INSTANCE = new GetRewardsQuery$Data$marshaller$1$2();

    GetRewardsQuery$Data$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetRewardsQuery.ClaimableOffer> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetRewardsQuery.ClaimableOffer>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetRewardsQuery.ClaimableOffer> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetRewardsQuery.ClaimableOffer claimableOffer : list) {
            valueof.values(claimableOffer.marshaller());
        }
    }
}
