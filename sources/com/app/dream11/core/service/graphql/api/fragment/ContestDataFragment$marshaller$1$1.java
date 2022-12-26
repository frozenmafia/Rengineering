package com.app.dream11.core.service.graphql.api.fragment;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestDataFragment$marshaller$1$1 extends Lambda implements Transition<List<? extends Integer>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestDataFragment$marshaller$1$1 INSTANCE = new ContestDataFragment$marshaller$1$1();

    ContestDataFragment$marshaller$1$1() {
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
        for (Integer num : list) {
            valueof.ag$a(num);
        }
    }
}
