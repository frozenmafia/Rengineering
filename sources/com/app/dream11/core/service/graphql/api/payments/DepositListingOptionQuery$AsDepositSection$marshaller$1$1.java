package com.app.dream11.core.service.graphql.api.payments;

import com.app.dream11.core.service.graphql.api.payments.DepositListingOptionQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class DepositListingOptionQuery$AsDepositSection$marshaller$1$1 extends Lambda implements Transition<List<? extends DepositListingOptionQuery.Listing>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final DepositListingOptionQuery$AsDepositSection$marshaller$1$1 INSTANCE = new DepositListingOptionQuery$AsDepositSection$marshaller$1$1();

    DepositListingOptionQuery$AsDepositSection$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends DepositListingOptionQuery.Listing> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<DepositListingOptionQuery.Listing>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<DepositListingOptionQuery.Listing> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (DepositListingOptionQuery.Listing listing : list) {
            valueof.values(listing.marshaller());
        }
    }
}
