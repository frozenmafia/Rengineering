package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestStatsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestStatsQuery$ContestStatistics$marshaller$1$1 extends Lambda implements Transition<List<? extends ContestStatsQuery.PlayerRole>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestStatsQuery$ContestStatistics$marshaller$1$1 INSTANCE = new ContestStatsQuery$ContestStatistics$marshaller$1$1();

    ContestStatsQuery$ContestStatistics$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ContestStatsQuery.PlayerRole> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ContestStatsQuery.PlayerRole>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ContestStatsQuery.PlayerRole> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ContestStatsQuery.PlayerRole playerRole : list) {
            valueof.values(playerRole == null ? null : playerRole.marshaller());
        }
    }
}
