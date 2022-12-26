package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.LeaderBoardFilterQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class LeaderBoardFilterQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends LeaderBoardFilterQuery.LeaderBoardFilter>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final LeaderBoardFilterQuery$Data$marshaller$1$1 INSTANCE = new LeaderBoardFilterQuery$Data$marshaller$1$1();

    LeaderBoardFilterQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends LeaderBoardFilterQuery.LeaderBoardFilter> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<LeaderBoardFilterQuery.LeaderBoardFilter>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<LeaderBoardFilterQuery.LeaderBoardFilter> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (LeaderBoardFilterQuery.LeaderBoardFilter leaderBoardFilter : list) {
            valueof.values(leaderBoardFilter == null ? null : leaderBoardFilter.marshaller());
        }
    }
}
