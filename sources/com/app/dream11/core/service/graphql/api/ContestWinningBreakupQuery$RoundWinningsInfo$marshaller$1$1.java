package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestWinningBreakupQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestWinningBreakupQuery$RoundWinningsInfo$marshaller$1$1 extends Lambda implements Transition<List<? extends ContestWinningBreakupQuery.FeesDetail>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestWinningBreakupQuery$RoundWinningsInfo$marshaller$1$1 INSTANCE = new ContestWinningBreakupQuery$RoundWinningsInfo$marshaller$1$1();

    ContestWinningBreakupQuery$RoundWinningsInfo$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ContestWinningBreakupQuery.FeesDetail> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ContestWinningBreakupQuery.FeesDetail>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ContestWinningBreakupQuery.FeesDetail> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ContestWinningBreakupQuery.FeesDetail feesDetail : list) {
            valueof.values(feesDetail.marshaller());
        }
    }
}
