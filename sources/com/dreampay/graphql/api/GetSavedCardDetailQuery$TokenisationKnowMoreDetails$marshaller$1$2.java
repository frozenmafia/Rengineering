package com.dreampay.graphql.api;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes4.dex */
final class GetSavedCardDetailQuery$TokenisationKnowMoreDetails$marshaller$1$2 extends Lambda implements Transition<List<? extends String>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetSavedCardDetailQuery$TokenisationKnowMoreDetails$marshaller$1$2 INSTANCE = new GetSavedCardDetailQuery$TokenisationKnowMoreDetails$marshaller$1$2();

    GetSavedCardDetailQuery$TokenisationKnowMoreDetails$marshaller$1$2() {
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
