package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.DepositOffersQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class DepositOffersQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends DepositOffersQuery.DepositOffer>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final DepositOffersQuery$Data$marshaller$1$1 INSTANCE = new DepositOffersQuery$Data$marshaller$1$1();

    DepositOffersQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends DepositOffersQuery.DepositOffer> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<DepositOffersQuery.DepositOffer>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<DepositOffersQuery.DepositOffer> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (DepositOffersQuery.DepositOffer depositOffer : list) {
            valueof.values(depositOffer.marshaller());
        }
    }
}
