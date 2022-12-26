package com.dreampay.graphql.api;

import com.dreampay.graphql.api.CardBinEligibilityQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class CardBinEligibilityQuery$Type$marshaller$1$3 extends Lambda implements Transition<List<? extends CardBinEligibilityQuery.Artwork>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final CardBinEligibilityQuery$Type$marshaller$1$3 INSTANCE = new CardBinEligibilityQuery$Type$marshaller$1$3();

    CardBinEligibilityQuery$Type$marshaller$1$3() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends CardBinEligibilityQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<CardBinEligibilityQuery.Artwork>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<CardBinEligibilityQuery.Artwork> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (CardBinEligibilityQuery.Artwork artwork : list) {
            valueof.values(artwork.marshaller());
        }
    }
}
