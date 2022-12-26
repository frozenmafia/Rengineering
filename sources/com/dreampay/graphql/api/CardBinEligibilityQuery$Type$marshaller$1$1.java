package com.dreampay.graphql.api;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class CardBinEligibilityQuery$Type$marshaller$1$1 extends Lambda implements Transition<List<? extends Integer>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final CardBinEligibilityQuery$Type$marshaller$1$1 INSTANCE = new CardBinEligibilityQuery$Type$marshaller$1$1();

    CardBinEligibilityQuery$Type$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends Integer> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<Integer>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<Integer> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (Number number : list) {
            valueof.ag$a(Integer.valueOf(number.intValue()));
        }
    }
}
