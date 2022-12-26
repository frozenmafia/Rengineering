package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.ContestItem;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestItem$marshaller$1$1 extends Lambda implements Transition<List<? extends ContestItem.WinnerBreakup>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestItem$marshaller$1$1 INSTANCE = new ContestItem$marshaller$1$1();

    ContestItem$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ContestItem.WinnerBreakup> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ContestItem.WinnerBreakup>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ContestItem.WinnerBreakup> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ContestItem.WinnerBreakup winnerBreakup : list) {
            valueof.values(winnerBreakup.marshaller());
        }
    }
}
