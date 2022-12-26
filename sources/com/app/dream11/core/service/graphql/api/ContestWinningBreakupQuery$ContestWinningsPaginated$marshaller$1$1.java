package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestWinningBreakupQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestWinningBreakupQuery$ContestWinningsPaginated$marshaller$1$1 extends Lambda implements Transition<List<? extends ContestWinningBreakupQuery.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestWinningBreakupQuery$ContestWinningsPaginated$marshaller$1$1 INSTANCE = new ContestWinningBreakupQuery$ContestWinningsPaginated$marshaller$1$1();

    ContestWinningBreakupQuery$ContestWinningsPaginated$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ContestWinningBreakupQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ContestWinningBreakupQuery.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ContestWinningBreakupQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ContestWinningBreakupQuery.Edge edge : list) {
            valueof.values(edge.marshaller());
        }
    }
}
