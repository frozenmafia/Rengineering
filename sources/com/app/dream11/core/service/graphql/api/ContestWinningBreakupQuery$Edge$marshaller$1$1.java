package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestWinningBreakupQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestWinningBreakupQuery$Edge$marshaller$1$1 extends Lambda implements Transition<List<? extends ContestWinningBreakupQuery.TeamWinning>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestWinningBreakupQuery$Edge$marshaller$1$1 INSTANCE = new ContestWinningBreakupQuery$Edge$marshaller$1$1();

    ContestWinningBreakupQuery$Edge$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ContestWinningBreakupQuery.TeamWinning> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ContestWinningBreakupQuery.TeamWinning>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ContestWinningBreakupQuery.TeamWinning> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ContestWinningBreakupQuery.TeamWinning teamWinning : list) {
            valueof.values(teamWinning.marshaller());
        }
    }
}
