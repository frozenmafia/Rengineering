package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerInfoQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class PlayerInfoQuery$TourStatistic$marshaller$1$1 extends Lambda implements Transition<List<? extends PlayerInfoQuery.MatchPointsBreakup>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final PlayerInfoQuery$TourStatistic$marshaller$1$1 INSTANCE = new PlayerInfoQuery$TourStatistic$marshaller$1$1();

    PlayerInfoQuery$TourStatistic$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends PlayerInfoQuery.MatchPointsBreakup> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<PlayerInfoQuery.MatchPointsBreakup>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<PlayerInfoQuery.MatchPointsBreakup> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (PlayerInfoQuery.MatchPointsBreakup matchPointsBreakup : list) {
            valueof.values(matchPointsBreakup.marshaller());
        }
    }
}
