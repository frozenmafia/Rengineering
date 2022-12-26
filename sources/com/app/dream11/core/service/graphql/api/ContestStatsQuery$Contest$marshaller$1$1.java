package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestStatsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestStatsQuery$Contest$marshaller$1$1 extends Lambda implements Transition<List<? extends ContestStatsQuery.MyTeam>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestStatsQuery$Contest$marshaller$1$1 INSTANCE = new ContestStatsQuery$Contest$marshaller$1$1();

    ContestStatsQuery$Contest$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ContestStatsQuery.MyTeam> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ContestStatsQuery.MyTeam>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ContestStatsQuery.MyTeam> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ContestStatsQuery.MyTeam myTeam : list) {
            valueof.values(myTeam.marshaller());
        }
    }
}
