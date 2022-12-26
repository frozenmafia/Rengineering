package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WinningBreakupQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class WinningBreakupQuery$WinnerTemplate$marshaller$1$1 extends Lambda implements Transition<List<? extends WinningBreakupQuery.PrizeBreakup>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final WinningBreakupQuery$WinnerTemplate$marshaller$1$1 INSTANCE = new WinningBreakupQuery$WinnerTemplate$marshaller$1$1();

    WinningBreakupQuery$WinnerTemplate$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends WinningBreakupQuery.PrizeBreakup> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<WinningBreakupQuery.PrizeBreakup>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<WinningBreakupQuery.PrizeBreakup> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (WinningBreakupQuery.PrizeBreakup prizeBreakup : list) {
            valueof.values(prizeBreakup.marshaller());
        }
    }
}
