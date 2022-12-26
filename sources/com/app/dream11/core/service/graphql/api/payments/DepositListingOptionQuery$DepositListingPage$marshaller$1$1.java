package com.app.dream11.core.service.graphql.api.payments;

import com.app.dream11.core.service.graphql.api.payments.DepositListingOptionQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class DepositListingOptionQuery$DepositListingPage$marshaller$1$1 extends Lambda implements Transition<List<? extends DepositListingOptionQuery.Listing1>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final DepositListingOptionQuery$DepositListingPage$marshaller$1$1 INSTANCE = new DepositListingOptionQuery$DepositListingPage$marshaller$1$1();

    DepositListingOptionQuery$DepositListingPage$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends DepositListingOptionQuery.Listing1> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<DepositListingOptionQuery.Listing1>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<DepositListingOptionQuery.Listing1> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (DepositListingOptionQuery.Listing1 listing1 : list) {
            valueof.values(listing1.marshaller());
        }
    }
}
