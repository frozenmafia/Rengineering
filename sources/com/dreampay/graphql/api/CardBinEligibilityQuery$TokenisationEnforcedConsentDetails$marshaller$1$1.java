package com.dreampay.graphql.api;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class CardBinEligibilityQuery$TokenisationEnforcedConsentDetails$marshaller$1$1 extends Lambda implements Transition<List<? extends String>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final CardBinEligibilityQuery$TokenisationEnforcedConsentDetails$marshaller$1$1 INSTANCE = new CardBinEligibilityQuery$TokenisationEnforcedConsentDetails$marshaller$1$1();

    CardBinEligibilityQuery$TokenisationEnforcedConsentDetails$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends String> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<String>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<String> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (String str : list) {
            valueof.valueOf(str);
        }
    }
}
