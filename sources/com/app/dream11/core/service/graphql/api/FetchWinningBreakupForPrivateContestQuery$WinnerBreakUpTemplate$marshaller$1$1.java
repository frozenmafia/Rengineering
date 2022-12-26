package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchWinningBreakupForPrivateContestQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class FetchWinningBreakupForPrivateContestQuery$WinnerBreakUpTemplate$marshaller$1$1 extends Lambda implements Transition<List<? extends FetchWinningBreakupForPrivateContestQuery.WinnerBreakup>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FetchWinningBreakupForPrivateContestQuery$WinnerBreakUpTemplate$marshaller$1$1 INSTANCE = new FetchWinningBreakupForPrivateContestQuery$WinnerBreakUpTemplate$marshaller$1$1();

    FetchWinningBreakupForPrivateContestQuery$WinnerBreakUpTemplate$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FetchWinningBreakupForPrivateContestQuery.WinnerBreakup> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FetchWinningBreakupForPrivateContestQuery.WinnerBreakup>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FetchWinningBreakupForPrivateContestQuery.WinnerBreakup> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FetchWinningBreakupForPrivateContestQuery.WinnerBreakup winnerBreakup : list) {
            valueof.values(winnerBreakup.marshaller());
        }
    }
}
